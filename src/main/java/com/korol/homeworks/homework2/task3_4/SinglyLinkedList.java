package com.korol.homeworks.homework2.task3_4;


import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Somebody on 13.02.2017.
 */
public class SinglyLinkedList<E> implements List<E> {
    private static int size;
    private Node head;

    // Default constructor
    public SinglyLinkedList() {

    }

    public void add(E data) {
        add(data, getSize());
    }

    public  int getSize() {
        return size;
    }

    public void add(E data, int index) {
        // initialize Node only in case of 1st element
        if (head == null) {
            head = new Node(data);
            size++;
            return;
        }

        Node newNode = new Node(data);
        Node current = head;

        // check for NPE before iterate over current
        if (current != null) {
            // crawl to the requested index or the last element in the list, whichever comes first
            for (int i = 0; i < index - 1 && current.next != null; i++) {
                current = current.next;
            }
        }

        // set the new node's next-node reference to this node's next-node reference
        newNode.next = current.next;

        // now set this node's next-node reference to the new node
        current.next = newNode;

        // increment the number of elements variable
        size++;
    }

    public E get(int index) {
        // index must be 1 or higher
        if (index < 1 || index > getSize())
            throw new IndexOutOfBoundsException();

        Node current = null;
        if (head != null) {
            current = head.next;
            for (int i = 0; i < index - 1; i++) {
                if (current.next == null)
                    return null;

                current = current.next;
            }
            return (E) current.data;
        }
        return (E) current;

    }

    public boolean remove(int index) {

        // if the index is out of range, exit
        if (index < 0 || index > getSize() - 1)
            throw new IndexOutOfBoundsException();
        if (index == 0 && size == 1) {
            head = null;
            return false;
        }
        if (index == 0) {
            head = head.next;
            return false;
        }
        Node current = head;
        if (head != null) {
            for (int i = 0; i < index - 1; i++) {
                if (current.next == null)
                    return false;

                current = current.next;
            }
            current.next = current.next.next;

            // decrement the number of elements variable
            size--;
            return true;
        }
        return false;
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

        // data carried by this node. could be of any type you need.
        E data;

        // Node constructor
        public Node(E dataValue) {
            next = null;
            data = dataValue;
        }
    }

    public Iterator iterator() {
        return new MyIterator(head);
    }

    private class MyIterator<E> implements Iterator<E> {
        private Node<E> current;

        public MyIterator(Node<E> first) {
            current = first;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            E data = current.data;
            current = current.next;
            return data;
        }
    }
}
