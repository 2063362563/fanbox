package com.fan.fanbox.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fan.fanbox.domain.pojo.UserRole;
import com.fan.fanbox.mapper.UserRoleMapper;
import com.fan.fanbox.service.UserRoleService;
import org.springframework.stereotype.Service;

@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements UserRoleService {

}

