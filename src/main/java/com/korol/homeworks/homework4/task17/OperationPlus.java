package com.korol.homeworks.homework4.task17;

/**
 * Created by Somebody on 05.03.2017.
 */
public class OperationPlus extends Component{
    private Component left;
    private Component right;

    public OperationPlus(Component left, Component right) {
        this.left = left;
        this.right = right;
    }



    @Override
    int calculate() {
        return left.calculate() + right.calculate();
    }
}
