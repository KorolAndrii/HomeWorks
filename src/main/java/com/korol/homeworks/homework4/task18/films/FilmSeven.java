package com.korol.homeworks.homework4.task18.films;

import com.korol.homeworks.homework4.task18.enums.Language;

/**
 * Created by Somebody on 05.03.2017.
 */
public class FilmSeven extends Film {
    public FilmSeven(Language language) {
        super(language);
        name = "Seven";
    }

    public String showInfo() {
        return "Film " + name + ", soundtrack language: " + soundtrackLanguage
                + ", subtitles language: " + subtitlesLanguage;
    }
}
