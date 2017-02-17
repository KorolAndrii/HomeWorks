package com.korol.homeworks.homework2.task3_4;

/**
 * Created by Somebody on 16.02.2017.
 */
public interface List<E> {
    /**
     * Appends the specified element to the end of this list.
     * @param data
     */
    void add(E data);

    /**
     * Inserts the specified element at the specified position in this list
     * @param data
     * @param index
     */
    void add(E data, int index);


    /**
     * Returns the element at the specified position in this list
     * @param index
     * @return
     */
    E get(int index);

    /**
     * Removes the element at the specified position in this list
     * @param index
     * @return
     */
    boolean remove(int index);

    /**
     * Returns the number of elements in this list.
     *
     * @return the number of elements in this list
     */
    int getSize();

}
