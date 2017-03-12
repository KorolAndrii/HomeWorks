package com.korol.homeworks.homework4.task20;

/**
 * Created by Somebody on 05.03.2017.
 */
public class ZForm implements Figure {
    private String form = "ZForm";

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    @Override
    public String show() {
        return form;
    }
}
