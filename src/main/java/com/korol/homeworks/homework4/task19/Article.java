package com.korol.homeworks.homework4.task19;


public abstract class Article implements Cloneable {
    protected String theme;
    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getTheme() {
        return theme;
    }

    abstract String getInfo();

    public Article clone() throws CloneNotSupportedException {
        return (Article) super.clone();
    }
}
