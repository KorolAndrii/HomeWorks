package com.korol.homeworks.homework3.task13_14;

import java.util.*;

/**
 * Created by Somebody on 19.02.2017.
 */
public final class ListUtil {
    private ListUtil() {
    }

    public static <T> List<? super T> unionSortLists(final List<? extends T> listA,
                                                     final List<? extends T> listB,
                                                     Comparator<? super T> comparator) {

        if (comparator == null) {
            throw new IllegalArgumentException("Comparator is null");
        }

        boolean aEmpty = (listA == null) || listA.isEmpty();
        boolean bEmpty = (listB == null) || listB.isEmpty();

        if (aEmpty & bEmpty) {

            // both empty - we give a new empty list
            return new ArrayList<T>();
        } else if (aEmpty) {

            // one empty - give a copy of the other, containing all the elements
            return new ArrayList<T>(listB);
        } else if (bEmpty) {
            return new ArrayList<T>(listA);
        } else {

            // both non-empty - combine
            ArrayList<T> result = new ArrayList<T>(
                    listA.size() + listB.size());
            result.addAll(listA);
            result.addAll(listB);
            sort(result, comparator);
            return result;
        }
    }

    public static <E> void sort(List<E> list, Comparator<? super E> comparator) {
        if (list == null || list.size() == 0) {
            return;
        }
        quickSort(0, list.size() - 1, comparator, list);

    }

    private static <E> void quickSort(int low, int high, Comparator<? super E> comparator, List<E> list) {
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
                exchange(list, i, j);
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(low, j, comparator, list);
        if (i < high)
            quickSort(i, high, comparator, list);
    }


    private static  <T> void exchange(List<T> list, int i, int j) {
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

}
