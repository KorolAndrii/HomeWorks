package com.korol.labs.lab1.salads;

import com.korol.labs.lab1.vegetables.Vegetable;
import com.korol.labs.lab1.vegetables.comparators.CaloriesComparator;

import java.util.*;

/**
 * Created by Somebody on 05.02.2017.
 */
public class Salad {
    private Set<Vegetable> vegetables = new HashSet<>();

    public void addVegetable(Vegetable vegetable) {
        vegetables.add(vegetable);
    }

    public Set<Vegetable> getVegetables() {
        return vegetables;
    }

    public float getSaladCalories() {
        float sumCalories = 0.0f;

        for (Vegetable vegetable : vegetables) {
            sumCalories += vegetable.getCalories();
        }
        return sumCalories;
    }

    public Set<Vegetable> sortByCalories() {
        Set<Vegetable> sortedSalad = new TreeSet<>(new CaloriesComparator());
        sortedSalad.addAll(vegetables);
        vegetables = sortedSalad;
        return vegetables;
    }

    public List<Vegetable> getVegForCalRange(float from, float to) {
        List<Vegetable> vegetables = new ArrayList<>();
        for (Vegetable vegetable : vegetables) {
            if (vegetable.getCalories() <= to && vegetable.getCalories() >= from) {
                vegetables.add(vegetable);
            }
        }
        return vegetables;
    }
}
