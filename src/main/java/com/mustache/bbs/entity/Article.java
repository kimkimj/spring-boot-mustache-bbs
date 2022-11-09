package com.mustache.bbs.entity;

import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
public class Article {

    @Id //Primary Key
    @GeneratedValue //자동 값 생성
    private Long id;

    @Column
    private String title;

    @Column
    private String content;

    // id를 제외한 constructor
    public Article(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
