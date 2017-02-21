package com.korol.homeworks.homework3.task13;

import com.korol.labs.lab1.vegetables.Vegetable;
import com.korol.labs.lab1.vegetables.comparators.CaloriesComparator;
import com.korol.labs.lab1.vegetables.impl.Tomato;

import java.util.*;


/**
 * Created by Somebody on 19.02.2017.
 */
public class Quicksort<E> {
    private List<E> list;

    public Quicksort(List<E> list) {
        this.list = list;
    }


    public void sort(Comparator<E> comparator) {
        if (list == null || list.size() == 0) {
            return;
        }
        quicksort(0, list.size() - 1, comparator);

    }

    public List<? extends E> getList() {
        return list;
    }

    public void setList(List<E> list) {
        this.list = list;
    }

    private void quicksort(int low, int high, Comparator<E> comparator) {
        int i = low;
        int j = high;

        E pivot = list.get(low + (high - low) / 2);

        while (i <= j) {
        
            while (comparator.compare((list.get(i)), pivot) < 0) {
                i++;
            }
            
            while (comparator.compare((list.get(j)), pivot) > 0) {
                j--;
            }

            if (i <= j) {
                exchange(i, j);
                i++;
                j--;
            }
        }

        if (low < j)
            quicksort(low, j, comparator);
        if (i < high)
            quicksort(i, high, comparator);
    }

    private void exchange(int i, int j) {
        E temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    public static void main(String[] args) {
        List<Vegetable> list = new LinkedList<>();
        list.add(new Tomato(20.0f));
        list.add(new Tomato(10.0f));
        list.add(new Tomato(55.0f));
        list.add(new Tomato(40.0f));
        Quicksort<Vegetable> quicksort = new Quicksort<>(list);
        list.sort(CaloriesComparator.getInstance());
        System.out.println(quicksort.getList());

    }
}