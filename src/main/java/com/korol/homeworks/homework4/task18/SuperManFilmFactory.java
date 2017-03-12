package com.korol.homeworks.homework4.task18;

import com.korol.homeworks.homework4.task18.enums.Language;
import com.korol.homeworks.homework4.task18.films.Film;
import com.korol.homeworks.homework4.task18.films.FilmSuperMan;

/**
 * Created by Somebody on 05.03.2017.
 */
public class SuperManFilmFactory extends CinemaFactory {
    private static CinemaFactory instance = new SuperManFilmFactory();

    public static CinemaFactory getInstance() {
        return instance;
    }

    @Override
    public Film getFilm(Language language) {
        return new FilmSuperMan(language);
    }
}
