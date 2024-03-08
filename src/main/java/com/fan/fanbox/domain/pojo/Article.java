package com.fan.fanbox.domain.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * @description article
 * @author fan
 * @date 2024-02-19
 */
@Data
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    /**
     * id
     */
    private Long id;

    /**
     * title
     */
    private String title;

    /**
     * 作者
     */
    private Long author;

    /**
     * type
     */
    private Integer type;

    /**
     * 评论数
     */
    private Long commentNum;

    /**
     * 点赞数
     */
    private Long likeNum;

    /**
     * 内容
     */
    private String content;

    /**
     * 文章状态
     */
    private Integer status;

    public Article() {}
}