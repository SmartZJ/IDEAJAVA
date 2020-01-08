package day15;

import java.util.*;


public class HomeWork {
    public static void main(String[] args) {
//        test1();
//        test2();
//        test3();
        test4();
    }


    /*
        1、定义一个Teacher类 name 和 age两属性
        2、循环创建n(假设为5)个Teacher对象，（
        name teacher1 age 10
        name teacher2 age 20
        name teacher3 age 30
        name teacher4 age 40
        name teacher5 age 50
        ）
        3、分别添加到set容器对象中
        4、把set容器对象删除一个与传入内容匹配的对象(name teacher3 age 30)
        提示！删除的时候，根据对象内容相同认为是相同对象，怎么判断对象内容相同？重写object某方法！
        5、两种方式遍历set对象
    * */
    private static void test1() {
        Set<Teacher> set = new HashSet<>();
        for (int i = 0; i <5 ; i++) {
            set.add(new Teacher("teacher"+(i+1),(i+1)*10));
        }
        //删除
        set.remove(new Teacher("teacher3",30));
        //循环1
        System.out.println("=====1=====");
        for (Teacher t:set) {
            System.out.println(t.toString());
        }
        System.out.println("=====2=====");
        //循环2
        Iterator<Teacher> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }


    /*1. 假如有以下email数据“aa@sohu.com,bb@163.com,cc@sina.com,..”现需要把     email中的用户部分（如aa）和邮件地址部分(如sohu.com)分离，分离后以键值对应的方式放入HashMap，并遍历打印map的键和值。
    提示：参考String split方法。*/
    private static void test2() {
        String[] ss = {"aa@sohu.com","bb@163.com","cc@sina.com"};
        HashMap<String,String> map = new HashMap<>();
        for (String s:ss) {
            String user = "",mail = "";
            map.put(s.substring(0,s.indexOf("@")),s.substring(s.indexOf("@")+1,s.length()));
        }
        Set<String> set = map.keySet();
        for (String s:set) {
            System.out.println("用户名：" + s + "\t邮件地址:" + map.get(s));
        }
    }
/*
* 2  定义一个Worker类,   属性:name:String,age:int,salary:double
    a).把若干Worker对象放在List中,排序并遍历输出
    两种方式  ：
     1）利用comparable 接口--》按年龄升序排列
     2）利用compartor 接口--》按工资降序排列

    b).把若干Worker对象放在Set中并遍历,要求没有重复元素，内容相同标准（名字和年龄相同）
    c).把若干Worker对象放在Map中，并按照两种方式分别遍历键和值,要求以Worker的姓名作为key，worker对象作为value。
* */
    private static void test3() {
        List<Worker> workers = new ArrayList<>();
        for (int i = 1 ; i < 6; i++) {
            workers.add(new Worker("worker"+i,i*10,i*1000));
        }
        //年龄升序
        System.out.println("=====年龄升序=====");
        Collections.sort(workers);
        for (Worker w:workers) {
            System.out.println(w.toString());
        }

        //工资降序
        System.out.println("=====工资降序=====");
        workers.sort(new Comparator<Worker>() {
            @Override
            public int compare(Worker o1, Worker o2) {
                return (int) (o2.getSalary()-o1.getSalary());
            }
        });
        for (Worker w:workers) {
            System.out.println(w.toString());
        }

        //Set
        System.out.println("遍历Set");
        Set<Worker> set = new HashSet<>();
        for (Worker w:workers) {
            set.add(w);
        }
        for (Worker w:set) {
            System.out.println(w.toString());
        }

        //Map
        System.out.println("遍历map");
        HashMap<String,Worker> map = new HashMap<>();
        for (Worker w:workers) {
            map.put(w.getName(),w);
        }
        System.out.println("遍历1");
        Set<String> set2 = map.keySet();
        for (String s:set2) {
            System.out.println("key:"+s+"value:"+map.get(s));
        }
        System.out.println("遍历2");
        Set<Map.Entry<String,Worker>> set3 = map.entrySet();
        Iterator<Map.Entry<String,Worker>> it = set3.iterator();
        while(it.hasNext()) {
            Map.Entry<String,Worker> entry = it.next();
            System.out.println(entry);
        }



    }
    /*
    *
    * 3. 在一个Map中，记录了某学校每门课程的授课老师（key为课程名，value为老师名），请分析原有Map，创建一个新的Map，用来表示每个老师负责讲授哪些课程 新的Map的key应为老师的名字，value为一个Set，Set中的元素为课程的名字
例如：
原map ：
   课程名key（String） 老师名value （String）
   java         	曾老师
   数据库     		曾老师
   web        		卢老师
   体育         		刘老师
新map ：
   老师名key（String） 课程名的集合value （Set<String>）
   曾老师                   {java,数据库}
   卢老师                   {web}
   刘老师                   {体育}

    * */
    private static void test4() {
        //老map
        HashMap<String,String> omap = new HashMap<>();
        omap.put("JAVA","曾老师");
        omap.put("数据库","曾老师");
        omap.put("Web","卢老师");
        omap.put("体育","刘老师");
        //新map
        HashMap<String,Set<String>> nmap = new HashMap<>();
        Set<String> set = omap.keySet();
        for (String s:set) {
           if (nmap.containsKey(omap.get(s))){
               nmap.get(omap.get(s)).add(s);
           }else {
               Set<String> ss = new HashSet<>();
               ss.add(s);
               nmap.put(omap.get(s),ss);
           }
        }
        //遍历
        Set<String> set2 = nmap.keySet();
        for (String s:set2) {
            System.out.println("key:"+s+"value:"+nmap.get(s));
        }
    }
}
