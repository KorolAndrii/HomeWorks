package com.korol.homeworks.homework4.task26;

import java.util.ArrayList;
import java.util.List;

public class ColonyOfBacteria {
    private List<Bacterium> bacteriaColony;

    public ColonyOfBacteria() {
        bacteriaColony = new ArrayList<>();
    }

    public void add(Bacterium bacterium) {
        bacteriaColony.add(bacterium);
    }

    public List<Bacterium> getBacteriaColony() {
        return bacteriaColony;
    }
}
