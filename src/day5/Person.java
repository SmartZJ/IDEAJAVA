package day5;
/*
* 4.人Person类
属性： 姓名 （name） 、年龄 （age）
方法:显示（display()）
	调用方法打印人的信息如：Person:[name="罗兹"，age="18"]

* */
public class Person {
    String name;
    int age;
    Vehicle car;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void display(){
        System.out.println("Person:[name="+name+"，age="+age+"]");
    }
}
