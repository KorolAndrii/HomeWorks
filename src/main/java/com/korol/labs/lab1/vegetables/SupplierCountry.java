package com.korol.labs.lab1.vegetables;

/**
 * Created by Somebody on 05.02.2017.
 */
public enum SupplierCountry {
    ECUADOR(1), UKRAINE(2), TURKEY(3), POLAND(4), MOROCCO(5), CHINA(6);

    private int rating;

    SupplierCountry(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }
}
