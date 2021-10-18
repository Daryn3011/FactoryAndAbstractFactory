package com.company;

public class EnExhaust implements Exhaust {
    @Override
    public void sounds() {
        System.out.println("Exhaust makes sounds");
    }

    @Override
    public void emitsFire() {
        System.out.println("Exhaust emits fire");
    }

}
