package com.mustache.bbs.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/articles")
@Slf4j // 이 annotation이 있어야 log를 사용할 수 있다
public class ArticleController {

    // articles/new로 들어오면 articles폴더 안의 new.mustache를 반환
    @GetMapping(value = "/new")
    public String newArticleForm() {
        return "articles/new";
    }
}

