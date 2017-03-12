package com.korol.homeworks.homework4.task17;

public class OperationSubtract extends Component {
    private Component left;
    private Component right;

    public OperationSubtract(Component left, Component right) {
        this.left = left;
        this.right = right;
    }

    @Override
    int calculate() {
        return left.calculate() - right.calculate();
    }
}
