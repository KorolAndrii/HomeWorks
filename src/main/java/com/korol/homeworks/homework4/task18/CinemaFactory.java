package com.korol.homeworks.homework4.task18;

import com.korol.homeworks.homework4.task18.enums.Language;
import com.korol.homeworks.homework4.task18.films.Film;

/**
 * Created by Somebody on 05.03.2017.
 */
public abstract class CinemaFactory {
    public abstract Film getFilm(Language language);
}
