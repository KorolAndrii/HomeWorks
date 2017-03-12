package com.korol.homeworks.homework4.task19;


public class WarArticle extends Article {
    public WarArticle() {
        theme = "some war article";
    }

    @Override
    public String  getInfo() {
       return theme;
    }
}
