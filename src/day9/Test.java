package day9;

import day9.abstracttest.Person;
import day9.abstracttest.Developer;

public class Test {

    public static void main(String[] args) {
        Person p1 = new Developer("张三","金融城");
        p1.gotoWork();

    }


}
