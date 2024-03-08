package com.fan.fanbox.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.fan.fanbox.domain.dto.LoginDto;
import com.fan.fanbox.domain.dto.LoginUser;
import com.fan.fanbox.domain.dto.Result;
import com.fan.fanbox.domain.enums.HttpStatus;
import com.fan.fanbox.domain.enums.UserStatus;
import com.fan.fanbox.domain.pojo.User;

import com.fan.fanbox.domain.pojo.UserRole;
import com.fan.fanbox.mapper.UserMapper;
import com.fan.fanbox.service.LoginService;
import com.fan.fanbox.service.UserRoleService;
import com.fan.fanbox.service.UserService;
import com.fan.fanbox.utils.JwtUtil;
import com.fan.fanbox.utils.RedisCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Service
public class LoginServiceImpl extends ServiceImpl<UserMapper, User> implements LoginService {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRoleService userRoleService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private RedisCache redisCache;

    /**
     * 登录
     * @param loginDto
     * @return
     */
    @Override
    public Result login(LoginDto loginDto) {
        String username = loginDto.getUsername();
        String password = loginDto.getPassword();
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(username,password);
        Authentication authenticate = authenticationManager.authenticate(authenticationToken);
        if (Objects.isNull(authenticate)){
            throw new RuntimeException("登录失败");
        }
        LoginUser loginUser = (LoginUser) authenticate.getPrincipal();
        String userId = loginUser.getUser().getId().toString();
        String jwt = JwtUtil.createJWT(userId);
        Map<String,String> map = new HashMap<>();
        map.put("token",jwt);

        redisCache.setCacheObject("login:"+userId,loginUser);

        return Result.success(map);
    }

    /**
     * 退出登录
     * @return
     */
    @Override
    public Result logout() {

        UsernamePasswordAuthenticationToken authentication =
                (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
        LoginUser loginUser = (LoginUser) authentication.getPrincipal();
        String userId = loginUser.getUser().getId().toString();
        redisCache.deleteObject("login:" + userId);
        return Result.success("退出登录成功");
    }

    /**
     * 注册
     * @param loginDto
     * @return
     */
    @Override
    public Result register(LoginDto loginDto) {
        String username = loginDto.getUsername();
        String password = loginDto.getPassword();
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper();
        wrapper.eq(User::getUsername,username);
        if(userService.getOne(wrapper) != null){
            return Result.error(HttpStatus.CONFLICT.getCode(),"该账号已注册");
        }
        User user = new User();
        user.setUsername(username);
        user.setPassword(passwordEncoder.encode(password));
        user.setCreateTime(LocalDateTime.now());
        user.setStatus(UserStatus.NORMAL.getStatus());
        user.setArticleNum(0L);
        user.setFollowNum(0L);
        userService.save(user);
        userRoleService.save(new UserRole(user.getId(), 5L));
        return Result.success("注册成功");
    }


}
