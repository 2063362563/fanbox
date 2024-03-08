package com.fan.fanbox.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fan.fanbox.domain.pojo.Article;
import com.fan.fanbox.mapper.ArticleMapper;
import com.fan.fanbox.service.ArticleService;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {
}
