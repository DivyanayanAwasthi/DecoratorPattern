package com.CreateOrder;

import com.beverages.DarkRoast;
import com.beverages.Espresso;
import com.beverages.HouseBlend;
import com.condoniments.Mocha;
import com.decorator.Bevarage;

public class MakeOrderTest {

    public static void main(String[] args) {
        Bevarage bevarage = new Espresso();
        System.out.println(bevarage.getDescription() + "--" + bevarage.cost());

        Bevarage bevarage1 = new DarkRoast();
        bevarage1 = new Mocha(bevarage1);
        System.out.println(bevarage1.getDescription() + "--" + bevarage1.cost());
    }
}
