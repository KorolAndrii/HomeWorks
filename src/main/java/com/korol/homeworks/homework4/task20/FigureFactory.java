package com.korol.homeworks.homework4.task20;


/**
 * Created by Somebody on 05.03.2017.
 */
public class FigureFactory {
    public static Figure getFigure(int i) {
        Figure figure = null;
        switch (i) {
            case 0 : figure = new IForm();
            break;
            case 1 : figure = new JForm();
            break;
            case 2 : figure = new Lform();
            break;
            case 3 : figure = new OForm();
            break;
            case 4 : figure = new SForm();
            break;
            case 5 : figure = new TForm();
            break;
            case 6 : figure = new ZForm();
            break;
            default:
                throw new IllegalArgumentException();
        }
        return figure;
    }
}
