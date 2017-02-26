package com.korol.homeworks.homework3.task15;


import com.korol.labs.lab1.vegetables.Vegetable;
import com.korol.labs.lab1.vegetables.comparators.CaloriesComparator;
import com.korol.labs.lab1.vegetables.impl.Tomato;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;


/**
 * Created by Somebody on 23.02.2017.
 */
public class MyPriorityQueueTest {
    private MyPriorityQueue<Vegetable> queue;
    private List<Vegetable> priorityList;
    private List<Vegetable> vegetables;

    @Before
    public void setUp() {
        queue = new MyPriorityQueue<>(10, CaloriesComparator.getInstance());
        vegetables = new ArrayList<>();
        priorityList = new ArrayList<>();
        priorityList.add(new Tomato(0.3f)); // 1
        priorityList.add(new Tomato(1.0f)); // 1
        priorityList.add(new Tomato(5.1f)); // 1
        priorityList.add(new Tomato(5.2f)); // 1

        vegetables.add(new Tomato(5.2f)); // 0
        vegetables.add(new Tomato(1.0f)); // 1
        vegetables.add(new Tomato(5.1f)); // 2
        vegetables.add(new Tomato(5.9f)); // 3
        vegetables.add(new Tomato(7.0f)); // 4
        vegetables.add(new Tomato(0.3f)); // 5

        queue.offer(vegetables.get(0));
        queue.offer(vegetables.get(1));
        queue.offer(vegetables.get(2));
        queue.offer(vegetables.get(5));

    }

    @Test
    public void offer() throws Exception {
        Iterator iterator1 = queue.iterator();
        Iterator iterator2 = priorityList.iterator();
        while (iterator1.hasNext()) {
            Assert.assertEquals(iterator1.next(), iterator2.next());
        }
    }


    @Test
    public void peek() throws Exception {
        Assert.assertEquals(vegetables.get(5), queue.peek());
    }

    @Test
    public void poll() throws Exception {
        queue.poll();
        queue.poll();
        Assert.assertEquals(vegetables.get(2), queue.poll());
        Assert.assertEquals(vegetables.get(0), queue.peek());
    }

    @Test (expected = ConcurrentModificationException.class)
    public void iterator() throws Exception {
        Iterator iterator1 = queue.iterator();
        while (iterator1.hasNext()) {
            queue.offer(vegetables.get(1));
            iterator1.next();
        }
    }

}