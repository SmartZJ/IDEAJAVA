package day9.baseclass;

import day9.interfacetest.Close;
import day9.interfacetest.Open;

public   class Door implements Open, Close {
    @Override
    public void close() {
        System.out.println("开门");
    }

    @Override
    public void open() {
        System.out.println("关门");
    }
}
