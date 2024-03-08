package com.fan.fanbox.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fan.fanbox.domain.pojo.Permission;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PermissionMapper extends BaseMapper<Permission> {

    List<String> selectPermsByUserId(Long userId);
}
