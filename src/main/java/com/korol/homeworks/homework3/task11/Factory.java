package com.korol.homeworks.homework3.task11;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Somebody on 19.02.2017.
 */
public class Factory {
    private int limit;
    private int count;
    private List<PhantomReference> list = new ArrayList<>();
    private ReferenceQueue<? extends A> rq = new ReferenceQueue();

    public List<PhantomReference> getList() {
        return list;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getCount() {
        return count;
    }

    private Factory(int limit) {
        this.limit = limit;
    }

    public static Factory getFactory(int limit) {
        if (limit < 0) {
            throw new IllegalArgumentException();
        }
        return new Factory(limit);
    }

    public void createObjects() {
        while (count >= limit) {
            destruct();
        }
        list.add(new PhantomReference(new A(), rq));
        count++;
    }

    private void destruct() {
        while (rq.poll() == null) {
            System.gc();
            try {
                rq.remove(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count--;
    }
}
