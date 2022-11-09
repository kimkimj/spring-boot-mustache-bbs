package com.mustache.bbs.domain.dto;

import com.mustache.bbs.entity.Article;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ArticleDto {
    private Long id;
    private String title;
    private String content;

    public ArticleDto(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    // ArticleDto를 toEntity method로
    // DTO객체를 entity로 변환하는 method
    public Article toEntity(){
        return new Article(title, content);
    }
}
