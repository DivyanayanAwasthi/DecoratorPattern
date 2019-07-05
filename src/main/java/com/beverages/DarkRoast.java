package com.beverages;

import com.decorator.Bevarage;

public class DarkRoast extends Bevarage {

    public DarkRoast(){
        description="dark Roast";
    }

    @Override
    public double cost() {
        return 11.50;
    }
}
