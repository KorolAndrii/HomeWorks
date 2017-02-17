package com.korol.homeworks.homework2.task3_4;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Somebody on 16.02.2017.
 */
public class DoublyLinkedList<E> implements List<E> {
    private static int size;
    private Node head;
    private Node tail;

    // Default constructor
    public DoublyLinkedList() {

    }

    public void add(E data) {
            final Node<E> l = tail;
            final Node<E> newNode = new Node<>(l, data, null);
            tail = newNode;
            if (l == null)
                head = newNode;
            else
                l.next = newNode;
            size++;

    }

    public  int getSize() {
        return size;
    }

    Node<E> node(int index) {
        // assert isElementIndex(index);
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException();
        }
        if (index < (size >> 1)) {
            Node<E> x = head;
            for (int i = 0; i < index; i++)
                x = x.next;
            return x;
        } else {
            Node<E> x = tail;
            for (int i = size - 1; i > index; i--)
                x = x.prev;
            return x;
        }
    }

    public void add(E data, int index) {
        Node<E> succ = node(index);
        final Node<E> pred = succ.prev;
        final Node<E> newNode = new Node<>(pred, data, succ);
        succ.prev = newNode;
        if (pred == null)
            head = newNode;
        else
            pred.next = newNode;
        size++;
    }

    public E get(int index) {
        // index must be 1 or higher
        return node(index).data;
    }

    public boolean remove(int index) {
        // assert x != null;
        Node<E> x = node(index);
        final E element = x.data;
        final Node<E> next = x.next;
        final Node<E> prev = x.prev;

        if (prev == null) {
            head = next;
        } else {
            prev.next = next;
            x.prev = null;
        }

        if (next == null) {
            tail = prev;
        } else {
            next.prev = prev;
            x.next = null;
        }

        x.data = null;
        size--;
        return true;
    }

    public String toString() {
        String output = "";

        if (head != null) {
            Node current = head;
            while (current != null) {
                output += "[" + current.data.toString() + "]";
                current = current.next;
            }

        }
        return output;
    }

    private class Node<E> {
        // reference to the next node in the chain, or null if there isn't one.
        Node next;

        // reference to the previous node in the chain, or null if there isn't one.
        Node prev;

        // data carried by this node. could be of any type you need.
        E data;

        // Node constructor
        public Node(Node<E> prev, E dataValue, Node<E> next) {
            this.next = next;
            this.prev = prev;
            data = dataValue;
        }
    }

    public MyIterator iterator(){
        return new MyIterator(head);
    }

    private class MyIterator<E> implements Iterator<E> {
        private Node<E> current;

        public MyIterator(Node<E> current) {
            this.current = current;
        }

        public boolean hasNext() {
            return current!= null;
        }

        public E next() {
            if (!hasNext())
                throw new NoSuchElementException();
            E data = current.data;
            current = current.next;
            return data;
        }

        public boolean hasPrevious() {
            return current != null;
        }

        public E previous() {
            if (!hasPrevious())
                throw new NoSuchElementException();
            E data = current.data;
            current = current.prev;
            return data;
        }
    }

    public Iterator<E> descendingIterator() {
        return new DescendingIterator();
    }

    private class DescendingIterator implements Iterator<E> {
        private final MyIterator itr = new MyIterator(tail);
        public boolean hasNext() {
            return itr.hasPrevious();
        }
        public E next() {
            return (E) itr.previous();
        }
    }
}

