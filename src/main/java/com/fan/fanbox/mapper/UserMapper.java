package com.fan.fanbox.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fan.fanbox.domain.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {



}
