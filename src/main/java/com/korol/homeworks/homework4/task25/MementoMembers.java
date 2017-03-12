package com.korol.homeworks.homework4.task25;

import java.util.Stack;

public class MementoMembers {
    private Stack<Memento> stack = new Stack<>();

    public void add(Memento memento) {
        stack.push(memento);
    }

    public Memento pop() {
        return stack.pop();
    }
}
