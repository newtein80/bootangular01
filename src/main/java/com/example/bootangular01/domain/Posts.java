package com.example.bootangular01.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Posts
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)//PROTECTED 로 타이핑해야 Intelligence 가 표시됨 
@Getter
@Table(name="posts")
public class Posts {

    @Id
    @GeneratedValue
    @Column(name="post_id")
    private Long id;

    @Column(name="title", length=50, nullable=false)
    private String title;

    @Column(name="content", columnDefinition="TEXT", nullable=false)
    private String content;

    @Column(name="author")
    private String author;

    @Builder
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }
}