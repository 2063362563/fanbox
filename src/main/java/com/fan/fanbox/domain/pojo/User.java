package com.fan.fanbox.domain.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * @description user
 * @author fan
 * @date 2024-02-18
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    /**
     * id
     */
    private Long id;

    /**
     * username
     */
    private String username;

    /**
     * password
     */
    private String password;

    /**
     * status
     */
    private Integer status;

    /**
     * create_time
     */
    private LocalDateTime createTime;

    /**
     * last_login_time
     */
    private LocalDateTime lastLoginTime;

    /**
     * follow_num
     */
    private Long followNum;

    /**
     * article_num
     */
    private Long articleNum;

    public User() {}
}