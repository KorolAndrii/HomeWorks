package com.korol.labs.lab1.vegetables.comparators;

import com.korol.labs.lab1.vegetables.Vegetable;

import java.util.Comparator;

/**
 * Created by Somebody on 05.02.2017.
 */
public class CaloriesComparator implements Comparator<Vegetable> {
    @Override
    public int compare(Vegetable vegetable1, Vegetable vegetable2) {
        Float calories1 = vegetable1.getCalories();
        Float calories2 = vegetable2.getCalories();

        return calories1.compareTo(calories2);
    }
}
