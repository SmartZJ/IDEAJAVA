package day14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
* List基础练习

    1、定义一个Person类 name 和 age两属性
    2、循环创建n(假设为5)个person对象，（
    name person1 age 10
    name person2 age 20
    name person3 age 30
    name person4 age 40
    name person5 age 50
    ）
    3、分别添加到list容器对象中
    4、删除第5个位置的对象
    5、把第4个位置的值设置为新Person对象（name person444 age444），
    6、把list转换为Person[]数组，使用Arrays的toString打印元素信息
    7、所有方式遍历list对象
* */
public class ListTest {
    public static void main(String[] args) {
    test1();
    }

    private static void test1() {
        List<Person> list = new ArrayList<Person>();
        for (int i = 0; i <5 ; i++) {
            list.add(new Person("person"+(i+1),(i+1)*10));
        }
        print(list);
        //删除
        System.out.println("-----after delete-----");
        list.remove(4);
        print(list);
        //修改
        list.set(3,new Person("person444",444));
        System.out.println("-----after set-----");
        print(list);
        //转换
        Person[] arr = list.toArray(new Person[0]);
        for (Person p:arr) {
            System.out.println(p.toString());
        }

        System.out.println("for循环list");
        for (Person p:list) {
            System.out.println(p.toString());
        }
        System.out.println("增强for循环list");
        for (int i = 0; i <list.size() ; i++) {
            System.out.println( list.get(i).toString());
        }

    }
    private static void print(List<Person> list ){
        //迭代器打印
        Iterator<Person> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

}
