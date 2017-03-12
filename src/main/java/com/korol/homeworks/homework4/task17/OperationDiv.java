package com.korol.homeworks.homework4.task17;

public class OperationDiv extends Component {
    Component right;
    Component left;

    public OperationDiv(Component right, Component left) {
        this.right = right;
        this.left = left;
    }

    @Override
    int calculate() {
        return right.calculate() / left.calculate();
    }
}
