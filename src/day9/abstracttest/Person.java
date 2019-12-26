package day9.abstracttest;

public abstract class Person {
    private String name;
    private String adress;

    public Person(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void eating(){
        System.out.println("食堂吃饭");
        System.out.println("给钱");
        System.out.println("打饭");
        System.out.println("吃饭");
        System.out.println("擦嘴巴");

    }

    public void byBus(){
        System.out.println("搭公交");
        System.out.println("上车");
        System.out.println("站着玩手机");
        System.out.println("下车");
    }

    public abstract void work();

    public void gotoWork(){
        byBus();
        work();
        eating();
        work();
        byBus();
    }
}
