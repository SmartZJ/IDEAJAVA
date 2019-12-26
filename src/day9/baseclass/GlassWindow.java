package day9.baseclass;

import day9.interfacetest.Waterproof;

public class GlassWindow extends Window implements Waterproof {
    @Override
    public void waterproof() {
        System.out.println("挡雨");
    }
}
