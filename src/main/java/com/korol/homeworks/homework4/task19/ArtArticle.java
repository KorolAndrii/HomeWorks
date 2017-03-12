package com.korol.homeworks.homework4.task19;


public class ArtArticle extends Article {
    public ArtArticle() {
        theme = "some art article";
    }

    @Override
    public String getInfo() {
        return theme;
    }
}
