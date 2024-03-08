package com.fan.fanbox.domain.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @description user_role
 * @author fan
 * @date 2024-02-22
 */
@Data
@AllArgsConstructor
public class UserRole implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    /**
     * user_id
     */
    private Long userId;

    /**
     * role_id
     */
    private Long roleId;

    public UserRole() {}
}