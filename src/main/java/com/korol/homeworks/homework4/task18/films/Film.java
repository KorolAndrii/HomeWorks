package com.korol.homeworks.homework4.task18.films;

import com.korol.homeworks.homework4.task18.enums.Language;

/**
 * Created by Somebody on 05.03.2017.
 */
public abstract class Film {
    protected String name;
    protected Language soundtrackLanguage;
    protected Language subtitlesLanguage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Language getSoundtrackLanguage() {
        return soundtrackLanguage;
    }

    public void setSoundtrackLanguage(Language language) {
        this.soundtrackLanguage = language;
        this.subtitlesLanguage = language;
    }

    public Language getSubtitlesLanguage() {
        return subtitlesLanguage;
    }

    public void setSubtitlesLanguage(Language language) {
        this.subtitlesLanguage = language;
        this.soundtrackLanguage = language;
    }

    public Film(Language language) {
        soundtrackLanguage = language;
        subtitlesLanguage = language;
    }

    abstract public String showInfo();
}
