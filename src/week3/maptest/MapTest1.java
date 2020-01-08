package week3.maptest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


/*
* 1.用户输入一个字符串，判断字符出现的次数，存入map容器，key为字符，value为次数
2.一个以 编号=Person 的键值对方式 HashMap对象中存储了5个Person对象，属性如下
编号  	名字       年龄        地址
1     	薇薇       18          金牛区
2	    张伟       19          高新区
3	    斯内克    20          武侯区
4	    大师兄    20          高新区
5	    小黑       22          金牛区
统计各个地址的人数，重新以 地址=人数 的键值对方式存储到map
* */
public class MapTest1 {
    public static void main(String[] args) {
        test1();
        test2();


    }

    private static void test1() {


    }

    private static void test2() {
        HashMap<Integer,Person> map = new HashMap<>();
        map.put(1,new Person("薇薇",18,"春熙路"));
        map.put(2,new Person("张伟",19,"天府广场"));
        map.put(3,new Person("斯内克",20,"布鲁明顿"));
        map.put(4,new Person("大师兄",20,"布鲁明顿"));
        map.put(5,new Person("小黑",22,"金牛区"));
        HashMap<String,Integer> map2 = new HashMap<>();
        Set<Integer> set = map.keySet();
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            Integer i = it.next();
            if (map2.containsKey(map.get(i).getAddress())){
                map2.put(map.get(i).getAddress(),map2.get(map.get(i).getAddress())+1);
            }else {
                map2.put( map.get(i).getAddress(),1);
            }
        }
        System.out.println(map2);
    }
}
