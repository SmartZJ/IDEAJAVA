package day9.abstracttest;

public class Developer extends Person{
    public Developer(String name, String adress) {
        super(name, adress);
    }

    @Override
    public void work() {
        System.out.println("写代码1");
        System.out.println("调bug1");
        System.out.println("写代码2");
        System.out.println("调bug2");
    }


}
