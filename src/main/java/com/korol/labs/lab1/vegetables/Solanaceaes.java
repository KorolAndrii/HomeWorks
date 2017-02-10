package com.korol.labs.lab1.vegetables;

/**
 * Created by Somebody on 05.02.2017.
 */
public abstract class Solanaceaes extends Vegetable {
    private float diameter;

    public Solanaceaes() {

    }

    public Solanaceaes(float calories) {
        super(calories);
    }

    public Solanaceaes(String name, float calories, SupplierCountry supplierCountry, float diameter) {
        super(name, calories, supplierCountry);
        this.diameter = diameter;
    }

    public float getFruitDiametr() {
        return diameter;
    }

    public void setFruitDiametr(float fruitDiametr) {
        this.diameter = fruitDiametr;
    }
}
