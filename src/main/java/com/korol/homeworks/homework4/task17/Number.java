package com.korol.homeworks.homework4.task17;

/**
 * Created by Somebody on 05.03.2017.
 */
public class Number extends Component {
    private int value;

    public Number(int value) {
        this.value = value;
    }

    @Override
    int calculate() {
        return value;
    }
}
