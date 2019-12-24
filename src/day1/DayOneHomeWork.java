package day1;

public class DayOneHomeWork {
    /*1、定义自己的一组数据。包含姓名，年龄，身高（单位为米），期望月薪，性别，是否已婚。并打印对应结果*/


    public static void main(String[] args) {
        char lastName = '刘';
        char firstName ='金';
        char firstName2 ='欣';
        byte age = 23;
        float hight = 1.68f;
        long salary = 8000;
        char sex = '男';
        Boolean marry = false;
        System.out.println(
                "姓名:"+lastName+firstName+firstName2+"\n"+
                "年龄:"+age+"\n"+
                "身高:"+hight+"米\n"+
                        "期望月薪:"+salary+"\n"+
                        "性别:"+sex+"\n" +
                        "是否已婚:"+marry);
    }

}
