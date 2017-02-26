package com.korol.homeworks.homework3.task13_14;

import com.korol.labs.lab1.vegetables.Vegetable;
import com.korol.labs.lab1.vegetables.comparators.CaloriesComparator;
import com.korol.labs.lab1.vegetables.impl.Tomato;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Somebody on 23.02.2017.
 */
public class ListUtilTest {
    private List<Vegetable> tomatoes;
    private List<Vegetable> sortedTomatoes;
    private CaloriesComparator comparator;
    private List<? super Tomato> resultList;
    private List<? super Tomato> anotherResultList;

    @Before
    public void setUp() {
        tomatoes = new ArrayList<>();
        sortedTomatoes = new ArrayList<>();
        resultList = new ArrayList<>();
        anotherResultList = new ArrayList<>();
        tomatoes.add(new Tomato(60.0f));
        tomatoes.add(new Tomato(20.0f));
        tomatoes.add(new Tomato(90.0f));
        tomatoes.add(new Tomato(10.0f));

        sortedTomatoes.add(new Tomato(10.0f));
        sortedTomatoes.add(new Tomato(20.0f));
        sortedTomatoes.add(new Tomato(60.0f));
        sortedTomatoes.add(new Tomato(90.0f));

        anotherResultList.add(new Tomato(10.0f));
        anotherResultList.add(new Tomato(10.0f));
        anotherResultList.add(new Tomato(20.0f));
        anotherResultList.add(new Tomato(20.0f));
        anotherResultList.add(new Tomato(60.0f));
        anotherResultList.add(new Tomato(60.0f));
        anotherResultList.add(new Tomato(90.0f));
        anotherResultList.add(new Tomato(90.0f));

        comparator = CaloriesComparator.getInstance();
    }

    @Test
    public void unionLists() throws Exception {
        resultList = ListUtil.unionSortLists(tomatoes, sortedTomatoes, comparator);
        Iterator iterator1 = resultList.iterator();
        Iterator iterator2 = anotherResultList.iterator();
        while (iterator1.hasNext()) {
            Assert.assertEquals(iterator1.next(), iterator2.next());
        }
    }

    @Test
    public void unionListsForNull() throws Exception {
        resultList = ListUtil.unionSortLists(null, sortedTomatoes, comparator);
        Iterator iterator1 = resultList.iterator();
        Iterator iterator2 = sortedTomatoes.iterator();
        while (iterator1.hasNext()) {
            Assert.assertEquals(iterator1.next(), iterator2.next());
        }
    }

    @Test
    public void unionListsBothNull() throws Exception {
        Assert.assertEquals(new ArrayList<Vegetable>(), ListUtil.unionSortLists(null, null, comparator));
    }

    @Test
    public void sort() throws Exception {
        ListUtil.sort(tomatoes, comparator);

        Iterator iterator1 = sortedTomatoes.iterator();
        Iterator iterator2 = tomatoes.iterator();
        while (iterator1.hasNext()) {
            Assert.assertEquals(iterator1.next(), iterator2.next());
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void nullComparator() {
        ListUtil.unionSortLists(tomatoes, sortedTomatoes, null);
    }
}