package com.korol.homeworks.homework3.task11;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/**
 * Created by Somebody on 19.02.2017.
 */
public class Factory {
    private int limit;
    private int count;
    //private int count2;
    private ReferenceQueue<A> queue = new ReferenceQueue<>();

    public Factory(int limit) {
        this.limit = limit;
    }

    public A startCreating(int i) throws InterruptedException {
        while (true) {
            System.out.println(count);
            if (count < limit) {
                i++;
                packA(new A(i));
            } else {
                // Removes the next reference object in this queue, blocking until either
                // one becomes available or the given timeout period expires.
                queue.remove(500);
                count--;
                System.out.println("removed");
               // count2++;
            }

        }
    }

    private PhantomReference<A> packA(A a) {
        PhantomReference<A> refA = new PhantomReference(a, queue);
        count++;
        return refA ;
    }

    public static void main(String[] args) throws InterruptedException {
        String a = "text";
        String b = "text";
        a += "!";
        b += "!";
        System.out.println(a != b);


    }}
