package day9.baseclass;

import day9.interfacetest.Revoling;

public class RevolingDoor extends Door implements Revoling {
    @Override
    public void revoling() {
        System.out.println("旋转");
    }
}
