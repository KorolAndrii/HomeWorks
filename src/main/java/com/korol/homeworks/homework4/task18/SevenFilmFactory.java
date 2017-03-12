package com.korol.homeworks.homework4.task18;

import com.korol.homeworks.homework4.task18.enums.Language;
import com.korol.homeworks.homework4.task18.films.Film;
import com.korol.homeworks.homework4.task18.films.FilmSeven;

/**
 * Created by Somebody on 05.03.2017.
 */
public final class SevenFilmFactory extends CinemaFactory {
    private static CinemaFactory instance = new SevenFilmFactory();

    public static CinemaFactory getInstance() {
        return instance;
    }

    @Override
    public Film getFilm(Language language) {
        return new FilmSeven(language);
    }
}
