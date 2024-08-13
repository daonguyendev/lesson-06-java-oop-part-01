package com.codegym.declaration;

public class Samsung extends Phone {
    private boolean isHavePen;

    public Samsung(Long id, String model, String color, double price, int quantity) {
        super(id, model, color, price, quantity);
    }

    public Samsung(Long id, String model, String color, double price, int quantity, boolean isHavePen) {
        super(id, model, color, price, quantity);
        this.isHavePen = isHavePen;
    }

    public boolean isHavePen() {
        return isHavePen;
    }

    public void setHavePen(boolean havePen) {
        isHavePen = havePen;
    }
}
