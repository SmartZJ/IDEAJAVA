package day9.baseclass;

import day9.interfacetest.Open;

public class Cans implements Open {
    @Override
    public void open() {
        System.out.println("拉开");
    }

    public void retain(){
        System.out.println("装饮料");
    }
}
