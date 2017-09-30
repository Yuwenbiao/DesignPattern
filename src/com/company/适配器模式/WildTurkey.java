package com.company.适配器模式;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble a gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
