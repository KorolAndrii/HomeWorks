package com.korol.homeworks.homework4.task18;

import com.korol.homeworks.homework4.task18.enums.Factories;

/**
 * Created by Somebody on 05.03.2017.
 */
public class Factory {
    public static CinemaFactory getFactory(Factories factories) {
        switch (factories) {
            case SEVEN_FILM_FACTORY: return SevenFilmFactory.getInstance();
            case SUPER_MAN_FILM_FACTORY: return SuperManFilmFactory.getInstance();
        }
        return null;
    }
}
