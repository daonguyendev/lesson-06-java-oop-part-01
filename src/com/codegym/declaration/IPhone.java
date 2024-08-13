package com.codegym.declaration;

public class IPhone extends Phone {

    private boolean isVirtualHomeBtn;

    public IPhone(Long id, String model, String color, double price, int quantity) {
        super(id, model, color, price, quantity);
    }

    public IPhone(Long id, String model, String color, double price, int quantity, boolean isVirtualHomeBtn) {
        super(id, model, color, price, quantity);
        this.isVirtualHomeBtn = isVirtualHomeBtn;
    }

    public boolean isVirtualHomeBtn() {
        return isVirtualHomeBtn;
    }

    public void setVirtualHomeBtn(boolean virtualHomeBtn) {
        isVirtualHomeBtn = virtualHomeBtn;
    }
}
