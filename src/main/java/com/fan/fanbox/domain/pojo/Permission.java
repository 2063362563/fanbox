package com.fan.fanbox.domain.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * @description permission
 * @author fan
 * @date 2024-02-22
 */
@Data
public class Permission implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    /**
     * id
     */
    private Long id;

    /**
     * permission_name
     */
    private String permissionName;

    /**
     * permission_key
     */
    private String permissionKey;

    public Permission() {}
}