package com.korol.homeworks.homework3.task15;

import java.util.*;


/**
 * Created by Somebody on 19.02.2017.
 */
public class MyPriorityQueue<E> {
    private int size;

    private Object[] queue;

    private final Comparator<? super E> comparator;

    private int modCount = 0;

    public MyPriorityQueue(int initialCapacity,
                         Comparator<? super E> comparator) {
        if (initialCapacity < 1)
            throw new IllegalArgumentException();
        this.queue = new Object[initialCapacity];
        this.comparator = comparator;
    }

    /**
     * Increases the capacity of the array.
     */
    private void grow() {
        int oldCapacity = queue.length;
        // Double size if small; else grow by 50%
        int newCapacity = oldCapacity + ((oldCapacity < 64) ? (oldCapacity + 2) : (oldCapacity >> 1));
        queue = Arrays.copyOf(queue, newCapacity);
    }

    /**
     * Inserts the specified element into this priority queue.
     */
    public boolean offer(E e) {
        if (e == null) {
            throw new NullPointerException();
        }
        modCount++;
        int i = size;
        if (i >= queue.length) {
            grow();
        }
        size = i + 1;
        if (i == 0) {
            queue[0] = e;
        } else {
            siftUp(i, e);
        }
        return true;
    }

    /**
     * Inserts item x at position k, maintaining heap invariant by
     * promoting x up the tree until it is greater than or equal to
     * its parent, or is the root.
     *
     * @param k the position to fill
     * @param x the item to insert
     */
    private void siftUp(int k, E x) {
        while (k > 0) {
            int parent = (k - 1) >>> 1;
            Object e = queue[parent];
            if (comparator.compare(x, (E) e) >= 0)
                break;
            queue[k] = e;
            k = parent;
        }
        queue[k] = x;
    }

    public E peek() {
        return (size == 0) ? null : (E) queue[0];
    }

    /**
     * Removes the element from star of this priority queue.
     */
    public E poll() {
        if (size == 0)
            return null;
        int s = --size;
        modCount++;
        E result = (E) queue[0];
        E x = (E) queue[s];
        queue[s] = null;
        if (s != 0) {
            siftDown(0, x);
        }
        return result;
    }

    /**
     * Inserts item x at position k, maintaining heap invariant by
     * demoting x down the tree repeatedly until it is less than or
     * equal to its children or is a leaf.
     *
     * @param k the position to fill
     * @param x the item to insert
     */
    private void siftDown(int k, E x) {
        int half = size >>> 1;
        while (k < half) {
            int child = (k << 1) + 1;
            Object c = queue[child];
            int right = child + 1;
            if (right < size && comparator.compare((E) c, (E) queue[right]) > 0)
                c = queue[child = right];
            if (comparator.compare(x, (E) c) <= 0)
                break;
            queue[k] = c;
            k = child;
        }
        queue[k] = x;
    }

    public Iterator iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<E> {
        private int cursor = 0;
        private int expectedModCount = modCount;

        public boolean hasNext() {
            return cursor < size;
        }

        public E next() {
            if (expectedModCount != modCount)
                throw new ConcurrentModificationException();
            if (cursor < size)
                return (E) queue[cursor++];
            else  throw new NoSuchElementException();
        }
    }
}
