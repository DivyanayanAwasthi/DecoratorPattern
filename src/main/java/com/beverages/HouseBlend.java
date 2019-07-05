package com.beverages;

import com.decorator.Bevarage;

public class HouseBlend extends Bevarage {

    public HouseBlend(){
        description="House blend";
    }

    @Override
    public double cost() {
        return 5.20;
    }
}
