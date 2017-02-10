package com.korol.labs.lab1.salads;

import com.korol.labs.lab1.vegetables.SupplierCountry;
import com.korol.labs.lab1.vegetables.impl.Beet;
import com.korol.labs.lab1.vegetables.impl.Carrot;
import com.korol.labs.lab1.vegetables.impl.Tomato;
import com.korol.labs.lab1.vegetables.impl.TomatoColor;

/**
 * Created by Somebody on 05.02.2017.
 */
public class SaladBuilder {
    public Salad beetsSalad() {
        Salad salad = new Salad();
        Beet beet = new Beet("Opolskii", 150.0f, SupplierCountry.UKRAINE,
                30.0f, true);
        Beet beet1 = new Beet("Sora", 175.0f, SupplierCountry.POLAND,
                45.0f, false);
        Carrot carrot = new Carrot("Nantskaya 4", 24.0f, SupplierCountry.CHINA,
                28.5f, "Normal shape");
        Carrot carrot1 = new Carrot("Flacorro", 35.0f, SupplierCountry.TURKEY,
                15.0f, "Unusual short and weight");

        salad.addVegetable(beet);
        salad.addVegetable(beet1);
        salad.addVegetable(carrot);
        salad.addVegetable(carrot1);

        return salad;
    }

    public Salad tomatoSalad() {
        Salad salad = new Salad();
        Tomato tomato = new Tomato("Spark", 110.0f, SupplierCountry.ECUADOR,
                15.0f, TomatoColor.RED);
        Tomato tomato1 = new Tomato("Bull heart", 135.0f, SupplierCountry.MOROCCO,
                17.9f, TomatoColor.YELLOW);

        salad.addVegetable(tomato);
        salad.addVegetable(tomato1);

        return salad;
    }
}
