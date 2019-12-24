package day2;
/*
* 1.定义一个整数3，依次乘以3，加上3，减去3，对5求余，除以3。分别将结果打印出来，要求用到今天学到的+=运算符等。
  2.定义变量存储圆周率pi（取3.14)，定义变量存储10除以3的值，并打印上述所有数据到控制台。
  3、你妈妈叫你去买菜，给了你100元，你买了1.5元1斤的3斤土豆，老板开心，给你抹去了零头。10.5元一斤的2斤猪肉，忽然，你看见喜欢的衣服打8折，原价30，打印结果和剩余金钱，如果要买，剩下的钱还够不够？如果足够，打印买衣服之后剩下的钱
* */
public class ArithmeticExercises {
    public static void main(String[] args) {
        System.out.println("=====1=====");
        int i1 = 3;
        i1+=3;
        System.out.println(i1);
        i1-=3;
        System.out.println(i1);
        i1%=5;
        System.out.println(i1);
        i1/=3;
        System.out.println(i1);
        System.out.println("=====2=====");
        double pi = 3.14;
        System.out.println(pi);
        pi = 10/3;
        System.out.println(pi);
        System.out.println("=====3=====");
        int money = 100;
        float potato = 1.5f;
        float meat = 10.5f;
        int clothes = 30;
        double balance = 100-(int)(3*1.5)-2*10.5>0.8*30? 100-(int)(3*1.5)-2*10.5-0.8*30:100-(int)(3*1.5)-2*10.5;
        System.out.println("还剩："+balance+"元");
    }
}
