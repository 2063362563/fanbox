package com.fan.fanbox.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fan.fanbox.domain.pojo.User;
import com.fan.fanbox.mapper.UserMapper;
import com.fan.fanbox.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
