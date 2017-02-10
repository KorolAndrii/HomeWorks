package com.korol.labs.lab1.vegetables;

/**
 * Created by Somebody on 05.02.2017.
 */
public abstract class Roots extends Vegetable {
    private float rootLength;

    public Roots() {

    }

    public Roots(float calories) {
        super(calories);
    }

    public Roots(String name, float calories, SupplierCountry supplierCountry, float rootLength) {
        super(name, calories, supplierCountry);
        this.rootLength = rootLength;
    }

    public float getRootLength() {
        return rootLength;
    }

    public void setRootLength(float rootLength) {
        this.rootLength = rootLength;
    }

}
