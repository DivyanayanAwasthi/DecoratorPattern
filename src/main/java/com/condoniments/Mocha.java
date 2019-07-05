package com.condoniments;

import com.decorator.Bevarage;
import com.decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    Bevarage bevarage;

    public Mocha(Bevarage bevarage){
       this.bevarage=bevarage;

    }

    @Override
    public String getDescription() {
        return bevarage.getDescription()+", Mocha";
    }

    @Override
    public double cost() {
        return bevarage.cost()+ 1.2 + this.pricePerSize();
    }

}
