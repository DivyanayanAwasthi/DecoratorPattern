package com.decorator;

import javax.swing.border.BevelBorder;

public abstract class CondimentDecorator extends Bevarage {
    public abstract String getDescription();

    public float pricePerSize() {
        if (null != this.getSize()) {
            switch (this.getSize()) {
                case "large":
                    return 20;
                case "medium":
                    return 15;
                case "small":
                    return 10;
            }
        }
        return 0;
    }
}
