package day8.polymorphic;
/*
* 人类：
    数据：名字
    功能：
    用手机发短信
        发短信过程（1）人拿着手机编写短信 2）手机发短信 3）人放下手机 ）
        手机：可以是（三星，苹果，小米）--》尝试多态解决*/
public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMassage(Phone phone){
        System.out.println(name+"拿起"+phone.getName()+"手机");
        phone.sendMassage(this);
        System.out.println(name+"放下"+phone.getName()+"手机");
    }
}
