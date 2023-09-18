package com.example.authDemo.models;

import javax.persistence.*;

@Entity
public class Posts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long postId;

    @ManyToOne
    private SiteUser userId;
    private String text;

    public Posts(){

    }

    public Posts(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setUserId(SiteUser userId) {
        this.userId = userId;
    }

}
