package day6;

import java.util.Scanner;

/*
  */
public class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0;
        int sum = 1;
        while (true){
            System.out.println("请输入一个0-15的数");
            n = sc.nextInt();
            if(n<=15&&n>=0){
                break;
            }else {
                System.out.println("无效数据");
            }
        }
        //小于15的随机数
        int rand = (int)(Math.random()*(n+1));
        System.out.println("随机数是"+rand);
        Recursion r = new Recursion();
        System.out.println(r.multiplication(rand));
        System.out.println("可乐"+r.buyCola(100,100));
        System.out.println("共有"+r.catFood(10)+"颗猫粮");

        for (int i = 0; i <10 ; i++) {
            sum=sum*2+2;
        }
        System.out.println(sum);
    }
    //1.用户输入一个整数小于15的整数n，随机生成0-n的整数num，求num的阶乘
    public int multiplication(int num){
        if (num==1){
            System.out.println(1);
            return 1;
        }
        System.out.println(num);
        return num*multiplication(num-1);
    }
    //2.班上买了100瓶肥宅水，3个瓶盖可以换一瓶肥宅水，请问一共可以喝多少瓶水？
    public int buyCola(int num,int g){
        if (num==0){
            System.out.println(num+g);
            return 0;
        }
        System.out.println("可乐"+num+"盖子"+g);
        return num+buyCola(g/3,g/3+g%3);
    }
    //3.老曾买了一大袋猫粮喂流浪猫，每天喂一半多一颗，第10天喂了还剩一颗，这袋猫粮有多少颗？
    public int catFood(int day){
        if (day==0){
            return 1;
        }
        return 2*(catFood(day-1)+1);
    }
}
