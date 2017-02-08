package com.korol.labs.lab1.vegetables;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * Created by Somebody on 08.02.2017.
 */
public abstract class Vegetable {
    private String name;
    private float calories;
    private SupplierCountry supplierCountry;


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

    public SupplierCountry getSupplierCountry() {
        return supplierCountry;
    }

    public void setSupplierCountry(SupplierCountry supplierCountry) {
        this.supplierCountry = supplierCountry;
    }

    public SupplierCountry getCountry() {
        return country;
    }

    public void setCountry(SupplierCountry country) {
        this.country = country;
    }

    public abstract boolean equals(Object o);

    public abstract int hashCode();

    public abstract String toString();

    private SupplierCountry country;
}
