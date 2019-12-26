package day9.abstracttest;

public class Marketer extends Person {
    public Marketer(String name, String adress) {
        super(name, adress);
    }

    @Override
    public void work() {
        System.out.println("市场调研1");
        System.out.println("陪客户吹牛1");
        System.out.println("市场调研2");
        System.out.println("陪客户吹牛2");

    }

}
