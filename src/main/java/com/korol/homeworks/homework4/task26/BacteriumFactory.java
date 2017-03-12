package com.korol.homeworks.homework4.task26;

import java.util.HashMap;
import java.util.Map;

public class BacteriumFactory {
    private static Map<BacteriumForm, Bacterium> bacteriumMap = new HashMap<>();

    public static Bacterium getBacterium(BacteriumForm bacteriumForm) {
        Bacterium bacterium = bacteriumMap.get(bacteriumForm);
        if (bacterium == null) {
            bacterium =  new Bacterium(bacteriumForm);
            bacteriumMap.put(bacteriumForm, bacterium);
        }
        return bacterium;
    }
}
