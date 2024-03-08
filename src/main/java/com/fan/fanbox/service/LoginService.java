package com.fan.fanbox.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fan.fanbox.domain.dto.LoginDto;
import com.fan.fanbox.domain.dto.Result;
import com.fan.fanbox.domain.pojo.User;

public interface LoginService extends IService<User> {
    Result login(LoginDto loginDto);

    Result logout();

    Result register(LoginDto loginDto);
}
