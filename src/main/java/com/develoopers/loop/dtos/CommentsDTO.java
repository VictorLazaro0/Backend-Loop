package com.develoopers.loop.dtos;

import java.time.LocalDateTime;

public class CommentsDTO {
    private Integer id_comment;
    private LocalDateTime date_comment;
    private String text_comment;
    private Integer id_user;
    private Integer id_posts;

    public Integer getId_comment() {
        return id_comment;
    }

    public void setId_comment(Integer id_comment) {
        this.id_comment = id_comment;
    }

    public LocalDateTime getDate_comment() {
        return date_comment;
    }

    public void setDate_comment(LocalDateTime date_comment) {
        this.date_comment = date_comment;
    }

    public String getText_comment() {
        return text_comment;
    }

    public void setText_comment(String text_comment) {
        this.text_comment = text_comment;
    }

    public Integer getId_user() {
        return id_user;
    }

    public void setId_user(Integer id_user) {
        this.id_user = id_user;
    }

    public Integer getId_posts() {
        return id_posts;
    }

    public void setId_posts(Integer id_posts) {
        this.id_posts = id_posts;
    }
}
