package com.korol.homeworks.homework4.task17;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class TreeFactory {
    public static Component getCalculateTree(String expression) {
        if (expression == null) {
            throw new IllegalArgumentException();
        }
        List<String> list = Arrays.asList(ShuntingYard.postfix(expression).split("\\s"));
        Stack<Component> numbers = new Stack<>();
        for (String part : list) {
            switch (part) {
                case "+" :
                    numbers.push(new OperationPlus(numbers.pop(), numbers.pop()));
                    break;
                case "-" :
                    Component number1 = numbers.pop();
                    Component number2 = numbers.pop();
                    numbers.push(new OperationSubtract(number2, number1));
                    break;
                case "*" :
                    numbers.push(new OperationMultiply(numbers.pop(), numbers.pop()));
                    break;
                case "/" :
                    Component number3 = numbers.pop();
                    Component number4 = numbers.pop();
                    numbers.push(new OperationDiv(number4, number3));
                    break;
                default:
                    numbers.push(new Number(Integer.parseInt(part)));
                    break;
            }
        }
        return numbers.pop();
    }
}
