package com.korol.homeworks.homework4.task19;

import java.util.HashMap;
import java.util.Map;


public class ArticlesCache {
    private static Map<String, Article> cache = new HashMap<>();

    public Article getArticle(String theme) throws CloneNotSupportedException {
        Article article = null;
        if (cache.get(theme) != null) {
            article = cache.get(theme).clone();
        } else {
            throw new IllegalArgumentException();
        }
        return article;
    }

    public static void loadCache() {
        Article warArticle = new WarArticle();
        cache.put(warArticle.getTheme(), warArticle);

        Article artArticle = new ArtArticle();
        cache.put(artArticle.getTheme(), artArticle);
    }
}
