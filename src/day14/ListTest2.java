package day14;

import java.util.*;

/*
* 公司有员工：28岁的小黄，20岁的小李，35岁的老张
    老张有一辆奔驰和一辆奥迪，小黄有一辆迈腾，小李有一辆大众
    今天又来了一位员工，30岁的老王
    老王有一辆特斯拉，和一辆凯美瑞
    老张看见老王的特斯拉很喜欢，买了下来。
    对员工按年龄升序排序
    打印个员工的信息
    * */
public class ListTest2 {
    public static void main(String[] args) {
        //新建Person类对象
        Person xh = new Person("小黄",28);
        Person xl = new Person("小李",20);
        Person lz = new Person("老张",35);
        Person lw = new Person("老王",35);
        lz.setCar("奔驰");
        lz.setCar("奥迪");
        xh.setCar("迈腾");
        xl.setCar("大众");
        lw.setCar("特斯拉");
        lw.setCar("凯美瑞");
        //老张看见老王的特斯拉很喜欢，买了下来。
        lz.setCar(lw.getCar().get(0).getName());
        lw.getCar().remove(0);

        //排序
        List<Person> list = new ArrayList<Person>();
        list.add(xh);
        list.add(xl);
        list.add(lz);
        list.add(lw);

//        for (Person p:list) {
//            if ("老王".equals(p.getName())){
//                Car car = p.getCar().remove(p.getCar().indexOf(new Car("特斯拉")));
//                for (Person p2:list){
//                    if ("老张".equals(p2.getName())&&p2.getAge()==35){
//                        p2.getCar().add(car);
//                    }
//                }
//            }
//        }

        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
              return o1.getAge()-o2.getAge();
            }
        });
        print(list);

    }
    private static void print(List<Person> list ){
        //迭代器打印
        Iterator<Person> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
