package com.korol.homeworks.homework4.task18.films;

import com.korol.homeworks.homework4.task18.enums.Language;

/**
 * Created by Somebody on 05.03.2017.
 */
public class FilmSuperMan extends Film {
    public FilmSuperMan(Language language) {
        super(language);
        name = "Super Man";
    }

    public String showInfo() {
        return "Film " + name + ", soundtrack language: " + soundtrackLanguage
                + ", subtitles language: " + subtitlesLanguage;
    }
}
