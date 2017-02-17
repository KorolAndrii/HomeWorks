package com.korol.labs.lab1.salads;

import com.korol.labs.lab1.vegetables.SupplierCountry;
import com.korol.labs.lab1.vegetables.Vegetable;
import com.korol.labs.lab1.vegetables.comparators.CaloriesComparator;
import com.korol.labs.lab1.vegetables.comparators.CountryRatingComparator;
import com.korol.labs.lab1.vegetables.impl.Beet;
import com.korol.labs.lab1.vegetables.impl.Carrot;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



/**
 * Created by Somebody on 09.02.2017.
 */
public class SaladTest {
    private Salad unsortedSalad;
    private Salad sortedCaloriesSalad = new Salad();
    private Salad sortedCountryRatingSalad = new Salad();
    List<Vegetable> vegetablesFromCalRange;

    @Before
    public void setUp() throws Exception {
        SaladBuilder saladBuilder = new SaladBuilder();
        unsortedSalad = saladBuilder.beetsSalad();

        sortedCaloriesSalad.addVegetable(new Carrot("Nantskaya 4", 24.0f, SupplierCountry.CHINA,
                28.5f, "Normal shape"));
        sortedCaloriesSalad.addVegetable(new Carrot("Flacorro", 35.0f, SupplierCountry.TURKEY,
                15.0f, "Unusual short and weight"));
        sortedCaloriesSalad.addVegetable(new Beet("Opolskii", 150.0f, SupplierCountry.UKRAINE,
                30.0f, true));
        sortedCaloriesSalad.addVegetable(new Beet("Sora", 175.0f, SupplierCountry.POLAND,
                45.0f, false));

        sortedCountryRatingSalad.addVegetable(new Beet("Opolskii", 150.0f, SupplierCountry.UKRAINE,
                30.0f, true));
        sortedCountryRatingSalad.addVegetable(new Carrot("Flacorro", 35.0f, SupplierCountry.TURKEY,
                15.0f, "Unusual short and weight"));
        sortedCountryRatingSalad.addVegetable(new Beet("Sora", 175.0f, SupplierCountry.POLAND,
                45.0f, false));
        sortedCountryRatingSalad.addVegetable(new Carrot("Nantskaya 4", 24.0f, SupplierCountry.CHINA,
                28.5f, "Normal shape"));

        vegetablesFromCalRange = new ArrayList<>();
        vegetablesFromCalRange.add(new Beet("Opolskii", 150.0f, SupplierCountry.UKRAINE,
                30.0f, true));
        vegetablesFromCalRange.add(new Carrot("Flacorro", 35.0f, SupplierCountry.TURKEY,
                15.0f, "Unusual short and weight"));
    }

    @Test
    public void getSaladCalories() throws Exception {
        Assert.assertEquals((int)384.0, (int)unsortedSalad.getSaladCalories());
    }

    @Test
    public void sortByComp() throws Exception {
        Iterator<Vegetable> iterator1 = unsortedSalad.sortByComp(CaloriesComparator.getInstance()).iterator();
        Iterator<Vegetable> iterator2 = sortedCaloriesSalad.getVegetables().iterator();
        while (iterator1.hasNext()) {
            Assert.assertEquals(iterator2.next(), iterator1.next());
        }

        Iterator<Vegetable> iterator3 = unsortedSalad.sortByComp(CountryRatingComparator.getInstance()).iterator();
        Iterator<Vegetable> iterator4 = sortedCountryRatingSalad.getVegetables().iterator();
        while (iterator1.hasNext()) {
            Assert.assertEquals(iterator3.next(), iterator4.next());
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void sortByCopNull() {
        unsortedSalad.sortByComp(null);
    }


    @Test
    public void sortByCalor() throws Exception {
        Iterator<Vegetable> iterator1 = unsortedSalad.sortByCalor().iterator();
        Iterator<Vegetable> iterator2 = sortedCaloriesSalad.getVegetables().iterator();
        while (iterator1.hasNext()) {
            Assert.assertEquals(iterator2.next(), iterator1.next());
        }
    }

    @Test
    public void sortByCountryRating() throws Exception {
        Iterator<Vegetable> iterator1 = unsortedSalad.sortByCountryRating().iterator();
        Iterator<Vegetable> iterator2 = sortedCountryRatingSalad.getVegetables().iterator();
        while (iterator1.hasNext()) {
            Assert.assertEquals(iterator2.next(), iterator1.next());
        }
    }

    @Test
    public void getVegForCalRange() throws Exception {
        Assert.assertEquals(vegetablesFromCalRange, unsortedSalad.getVegForCalRange(30.0f, 160.0f));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getVegForCalRangeNegativeValues() {
        unsortedSalad.getVegForCalRange(-0.3f, 10.0f);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getVegForCalRangeWrongValues() {
        unsortedSalad.getVegForCalRange(10.3f, 5.0f);
    }

}