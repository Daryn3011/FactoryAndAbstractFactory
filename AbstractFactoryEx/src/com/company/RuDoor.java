package com.company;

public class RuDoor implements Door {
    @Override
    public void opens() {
        System.out.println("Дверь открывается");
    }

    @Override
    public void closes() {
        System.out.println("Дверь закрывается");
    }
}
