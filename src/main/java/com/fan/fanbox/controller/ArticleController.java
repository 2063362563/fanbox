package com.fan.fanbox.controller;

import com.fan.fanbox.domain.dto.Result;
import com.fan.fanbox.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;



    @GetMapping
    public Result getUserTest(){

        return Result.success("123123412");
    }

}
