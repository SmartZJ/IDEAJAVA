package day9.baseclass;

import day9.interfacetest.Close;
import day9.interfacetest.Open;

public class Window implements Open, Close {
    @Override
    public void close() {
        System.out.println("开窗");
    }

    @Override
    public void open() {
        System.out.println("关窗");
    }

    public void lookWindow(){
        System.out.println("看窗外");
    }
}
