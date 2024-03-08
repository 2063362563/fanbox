package com.fan.fanbox.domain.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * @description role_permission
 * @author fan
 * @date 2024-02-22
 */
@Data
public class RolePermission implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    /**
     * role_id
     */
    private Long roleId;

    /**
     * permission_id
     */
    private Long permissionId;

    public RolePermission() {}
}