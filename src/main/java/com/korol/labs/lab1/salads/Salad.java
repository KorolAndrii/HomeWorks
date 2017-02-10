package com.korol.labs.lab1.salads;

import com.korol.labs.lab1.vegetables.Vegetable;
import com.korol.labs.lab1.vegetables.comparators.CaloriesComparator;
import com.korol.labs.lab1.vegetables.comparators.CountryRatingComparator;

import java.util.*;

/**
 * Created by Somebody on 05.02.2017.
 */
public class Salad {
    private Set<Vegetable> vegetables = new LinkedHashSet<>();

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

    public Set<Vegetable> sortByComp(Comparator<Vegetable> comparator) {
        if (comparator == null) {
            throw new IllegalArgumentException("Comparator wasn't initialized");
        }
        Set<Vegetable> sortedSalad = new TreeSet<>(comparator);
        sortedSalad.addAll(vegetables);
        vegetables = sortedSalad;
        return vegetables;
    }

    public Set<Vegetable> sortByCalor() {
        return sortByComp(CaloriesComparator.getInstance());
    }

    public Set<Vegetable> sortByCountryRating() {
        return sortByComp(CountryRatingComparator.getInstance());
    }


    public List<Vegetable> getVegForCalRange(float from, float to) {
        List<Vegetable> vegs;
        if ((from >= 0.0 && to >= 0.0) && from <= to) {
            vegs = new ArrayList<>();
            for (Vegetable vegetable : vegetables) {
                if (vegetable.getCalories() <= to && vegetable.getCalories() >= from) {
                    vegs.add(vegetable);
                }
            }
            return vegs;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
