package com.company;

public class RuExhaust implements Exhaust {
    @Override
    public void sounds() {
        System.out.println("Выхлоп издает звуки");
    }

    @Override
    public void emitsFire() {
        System.out.println("Выхлоп излучает огонь");
    }

}
