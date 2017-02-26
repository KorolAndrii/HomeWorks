package com.korol.homeworks.homework2.task3_4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

import static org.junit.Assert.*;

/**
 * Created by Somebody on 16.02.2017.
 */
public class SinglyLinkedListTest {
    private SinglyLinkedList<Integer> list;


    @Before
    public void setUP() {
        list = new SinglyLinkedList<>();
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

    @Test
    public void iterator() {
        Iterator<Integer> iterator = list.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            Assert.assertEquals(++i, (int) iterator.next());
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void wrongRemoveIndex() {
        list.remove(-20);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void wrongGetIndex() {
        list.remove(21);
    }

    @Test(expected = ConcurrentModificationException.class)
    public void cme() {
        Iterator<Integer> iterator = list.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            list.add(1);
            iterator.next();
        }
    }

}