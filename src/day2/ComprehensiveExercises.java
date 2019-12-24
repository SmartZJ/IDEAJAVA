package day2;

import java.util.Scanner;

/*
* 小甜甜一家去吃火锅，在美团上搜索火锅店名字，
吃了30元的牛肉2份，20元五花肉1份，40元的鲍鱼2份，25.5的黄喉1份，8.6元的土豆2份，6.5元的莴笋1份；
老板去掉零头，打印"XXX火锅店花费XXX元"，还有抽奖活动，
随机6-10折，再次打印"打折后XXX火锅店花费XXX元"。
* */
public class ComprehensiveExercises {
    public static void main(String[] args) {
        String str;
        int beef = 30;
        int meat = 20;
        int abalone = 40;
        double throat = 25.5;
        double potato = 8.6;
        double lettuce = 6.5;
        double discount = (int)(Math.random()*4+6);
        int allpay = (int)(beef*2+meat+abalone*2+throat+potato*2+lettuce);
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入火锅店名:");
        str = sc.next();
        System.out.println(discount);
        System.out.println(str+"火锅店话费"+allpay+"元");
        System.out.println("打折后 "+str+"火锅店花费"+discount*allpay/10+"元");
//        for (int i = 0 ; i<=10;i++){
//            discount = (int)(Math.random()*4+6);
//        System.out.println(discount/10);
//     }
    }
}
