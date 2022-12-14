package com.mustache.bbs.controller;

import com.mustache.bbs.domain.dto.ArticleDto;
import com.mustache.bbs.entity.Article;
import com.mustache.bbs.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/articles")
@Slf4j // 이 annotation이 있어야 log를 사용할 수 있다
public class ArticleController {

    private final ArticleRepository articleRepository;

    public ArticleController(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }


    // articles/new로 들어오면 articles폴더 안의 new.mustache를 반환
    @GetMapping(value = "/new")
    public String newArticleForm() {
        return "articles/new";
    }

    // articles/posts로 들어오면 Article DTO로 결과를 받아 로그에 출력
    @PostMapping(value = "/posts")
    public String createArticle(ArticleDto form) {
        log.info(form.toString());
        Article article = form.toEntity(); //DTO로 받은 data를 entity로 변환하기
        articleRepository.save(article);
        return "";
    }
}


