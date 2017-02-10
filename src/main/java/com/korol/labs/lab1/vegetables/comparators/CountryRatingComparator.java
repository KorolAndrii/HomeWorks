package com.korol.labs.lab1.vegetables.comparators;

import com.korol.labs.lab1.vegetables.Vegetable;

import java.util.Comparator;

/**
 * Created by Somebody on 08.02.2017.
 */
public class CountryRatingComparator implements Comparator<Vegetable> {
    private static CountryRatingComparator countryRatingComparator;

    private CountryRatingComparator() {

    }

    public static CountryRatingComparator getInstance() {
        if (countryRatingComparator == null) {
            countryRatingComparator = new CountryRatingComparator();
        }
        return  countryRatingComparator;
    }

    @Override
    public int compare(Vegetable vegetable1, Vegetable vegetable2) {
        Integer countryRating1 = vegetable1.getCountry().getRating();
        Integer countryRating2 = vegetable2.getCountry().getRating();

        return countryRating1.compareTo(countryRating2);
    }
}
