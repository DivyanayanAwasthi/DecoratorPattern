package com.decorator;

public abstract class Bevarage {

    public String description;

    private String size;

    public String getDescription(){
    return description;
    }

    public abstract  double cost();

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
