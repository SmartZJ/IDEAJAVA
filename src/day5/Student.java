package day5;
/*
* 类设计练习：

1.学生Student类
属性：姓名(name)学号(stuId)班级(className)年龄(age)性别(gender)拥有手机(Phone)
功能：学习(study())考试(exam())
构造器:1.name	2.name,stuId	3.name,stuId,className,age,gender
	创建学生'陆华'对象,调用学习，使用华为mate30听音乐
*/
public class Student {
    String name;
    int stuId;
    String className;
    int age;
    String gender;
    Phone phone;
    public Student(String name){
        this.name = name;
    }
    public Student(String name,int stuId){
        this.name = name;
        this.stuId = stuId;
    }
    public Student(String name,int stuId,String className,int age,String gender){
        this.name = name;
        this.stuId = stuId;
        this.className = className;
        this.age = age;
        this.gender = gender;
    }
    public void study(){
        System.out.println(name+"学习");
    }
    public void exam(){
        System.out.println("参加考试");
    }
}
