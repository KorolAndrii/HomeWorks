package com.korol.labs.lab1.vegetables.impl;

import com.korol.labs.lab1.vegetables.Roots;
import com.korol.labs.lab1.vegetables.SupplierCountry;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * Created by Somebody on 05.02.2017.
 */
public class Carrot extends Roots {
    private String shapeInfo;

    public Carrot() {
    }

    public Carrot(float calories) {
        super(calories);
    }

    public Carrot(String name, float calories, SupplierCountry supplierCountry, float rootLength, String shapeInfo) {
        super(name, calories, supplierCountry, rootLength);
        this.shapeInfo = shapeInfo;
    }

    public String getShapeInfo() {
        return shapeInfo;
    }

    public void setShapeInfo(String shapeInfo) {
        this.shapeInfo = shapeInfo;
    }

    @Override
    public String toString() {
        return Carrot.class.getSimpleName() + " name: " + this.getName() + " calories: " + this.getCalories()
                + " country: " + this.getCountry() + "(" + this.getCountry().getRating() + ")" + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Carrot carrot = (Carrot) o;

        return new EqualsBuilder()
                .append(shapeInfo, carrot.shapeInfo)
                .append(this.getName(), carrot.getName())
                .append(this.getCalories(), carrot.getCalories())
                .append(this.getCountry(), carrot.getCountry())
                .append(this.getRootLength(), carrot.getRootLength())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(shapeInfo)
                .append(this.getCalories())
                .append(this.getName())
                .append(this.getCountry())
                .append(this.getRootLength())
                .toHashCode();
    }
}
