package com.beverages;

import com.decorator.Bevarage;

public class Espresso extends Bevarage {

    public Espresso(){
        description="Espresso";
    }

    @Override
    public double cost() {
        return 5.50;
    }
}
