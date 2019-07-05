package com.beverages;

import com.decorator.Bevarage;

public class Decafe extends Bevarage {

    public Decafe(){
        description="decafe";
    }

    @Override
    public double cost() {
        return 7.50;
    }
}
