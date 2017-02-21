package com.korol.homeworks.homework3.task14;

import java.util.*;

/**
 * Created by Somebody on 19.02.2017.
 */
public class ListUnion {
    public static <T> List<? super T> joinLists(final List<? extends T> listA,
                                                final List<? extends T> listB,
                                                Comparator<? super T> comparator) {

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
            result.sort(comparator);
            return result;
        }
    }
}
