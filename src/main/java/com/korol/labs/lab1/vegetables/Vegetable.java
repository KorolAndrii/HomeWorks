package com.korol.labs.lab1.vegetables;



/**
 * Created by Somebody on 08.02.2017.
 */
public abstract class Vegetable {
    private String name;
    private float calories;
    private SupplierCountry supplierCountry;

    public Vegetable() {

    }

    public Vegetable(float calories) {
        this.calories = calories;
    }

    public Vegetable(String name, float calories, SupplierCountry supplierCountry) {
        this.name = name;
        this.calories = calories;
        this.supplierCountry = supplierCountry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCalories() {
        return calories;
    }


    public void setCalories(float calories) {
        this.calories = calories;
    }

    public SupplierCountry getCountry() {
        return supplierCountry;
    }

    public void setCountry(SupplierCountry country) {
        this.supplierCountry = country;
    }

    @Override
    public abstract boolean equals(Object o);

    @Override
    public abstract int hashCode();

    @Override
    public abstract String toString();

}
