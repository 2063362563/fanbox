package com.fan.fanbox.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;


import com.fan.fanbox.domain.dto.LoginDto;
import com.fan.fanbox.domain.dto.Result;
import com.fan.fanbox.domain.enums.HttpStatus;
import com.fan.fanbox.domain.enums.UserStatus;
import com.fan.fanbox.domain.pojo.User;
import com.fan.fanbox.service.LoginService;
import com.fan.fanbox.utils.JwtUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/login")
@Slf4j
@CrossOrigin()
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping("hello")
    @PreAuthorize("hasAnyAuthority('hello')")
    public String Hello(){
        return "hello";
    }

    /**
     * 登录
     * @param loginDto
     * @return
     */
    @PostMapping("/login_auth")
    public Result Login(@RequestBody LoginDto loginDto){
        return loginService.login(loginDto);
    }

    @PostMapping("/logout")
    @PreAuthorize("hasAuthority('logout')")
    public Result Logout(){
        return loginService.logout();
    }

    /**
     * 注册
     * @param loginDto
     * @return
     */
    @PostMapping ("/register")
    public Result Register(@RequestBody LoginDto loginDto){
        return loginService.register(loginDto);
    }
}
