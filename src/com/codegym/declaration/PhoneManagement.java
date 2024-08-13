package com.codegym.declaration;

public class PhoneManagement {

    public static void main(String[] args) {
        IPhone iPhone = new IPhone(1L, "iPhone 15", "Black",
                                    2000, 10, true);
        Samsung note = new Samsung(2L, "Samsung Note", "Red",
                                    2100, 15, true);
        System.out.println(iPhone.getModel());
        System.out.println(iPhone.isVirtualHomeBtn());
        System.out.println(note.getModel());
        System.out.println(note.isHavePen());
    }


}
