package com.korol.homeworks.homework2.task3_4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;


/**
 * Created by Somebody on 17.02.2017.
 */
public class DoublyLinkedListTest {
    private DoublyLinkedList<Integer> list;

    @Before
    public void setUP() {
        list = new DoublyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
    }

    @Test
    public void add() throws Exception {
        Assert.assertEquals("[1][2][3]", list.toString());
    }

    @Test
    public void addIndex() throws Exception {
        list.add(47, 1);
        Assert.assertEquals("[1][47][2][3]", list.toString());
    }

    @Test
    public void get() throws Exception {
        Assert.assertEquals(3, (int) list.get(2));
    }

    @Test
    public void remove() throws Exception {
        list.remove(0);
        Assert.assertEquals("[2][3]", list.toString());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void wrongRemoveIndex() {
        list.remove(-20);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void wrongGetIndex() {
        list.remove(21);
    }

    @Test
    public void iterator() {
        Iterator<Integer> iterator = list.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            Assert.assertEquals(++i, (int) iterator.next());
        }
    }

    @Test
    public void descendingIterator() {
        Iterator<Integer> iterator = list.descendingIterator();
        int i = 3;
        while (iterator.hasNext()) {
            Assert.assertEquals(i--, (int) iterator.next());
        }
    }

}