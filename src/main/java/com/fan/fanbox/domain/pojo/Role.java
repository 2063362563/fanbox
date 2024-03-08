package com.fan.fanbox.domain.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * @description role
 * @author fan
 * @date 2024-02-22
 */
@Data
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    /**
     * id
     */
    private Long id;

    /**
     * role_name
     */
    private String roleName;

    /**
     * role_key
     */
    private String roleKey;

    public Role() {}
}