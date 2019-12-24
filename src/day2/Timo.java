package day2;
/*
* 1、完成：
提莫大魔王作战1：
提莫大魔王的：血量:10000; 伤害：500；被动：被攻击时有50%几率闪避

盖伦的血量：3000；盖伦的伤害250；被动：被攻击时有20%几率闪避
剑圣的血量：1500；剑圣的伤害2000；被动：被攻击时有30%几率闪避
打印他们的初始血量和伤害。

程序要求：盖伦和剑圣轮流攻击体提莫大魔王一次，然后提莫攻击盖伦一次；盖伦和剑圣再轮流攻击体提莫大魔王一次，然后提莫攻击剑圣一次
输出：打印每次是否成功攻击，每轮剩余血量
*/
public class Timo {
    public static void main(String[] args) {
        int tm = 10000,tmAd = 500,tmEva = 5;
        int gl = 3000,glAd = 250,glEva = 2;
        int js = 1500,jsAd = 2000,jsEva = 3;
        int rand ;

        System.out.println("提莫血量："+tm+",盖伦血量:"+gl+",剑圣血量:"+js);
        System.out.println("=====round1=====");
        //盖伦攻击
            rand  = (int)(Math.random()*10);
        if (rand<tmEva){
                System.out.println("盖伦攻击提莫miss");
            }else {
                tm-=glAd;
                System.out.println("提莫被盖伦攻击血量剩余"+tm);
            }
        //剑圣攻击
            rand  = (int)(Math.random()*10);
            if (rand<tmEva){
                System.out.println("剑圣攻击提莫miss");
            }else {
                tm-=jsAd;
                System.out.println("提莫被剑圣攻击血量剩余"+tm);
            }
        //提莫攻击
            rand  = (int)(Math.random()*10);
            if(rand<glEva){
                System.out.println("提莫攻击盖伦miss");
            }else {
                gl-=tmAd;
                System.out.println("盖伦被提莫攻击血量剩余"+gl);
            }
            System.out.println("提莫剩余血量："+tm+",盖伦剩余血量:"+gl+",剑圣剩余血量:"+js);

        System.out.println("=====round2=====");
        //盖伦攻击
        rand  = (int)(Math.random()*10);
        if (rand<tmEva){
            System.out.println("盖伦攻击提莫miss");
        }else {
            tm-=glAd;
            System.out.println("提莫被盖伦攻击血量剩余"+tm);
        }
        //剑圣攻击
        rand  = (int)(Math.random()*10);
        if (rand<tmEva){
            System.out.println("剑圣攻击提莫miss");
        }else {
            tm-=jsAd;
            System.out.println("提莫被剑圣攻击血量剩余"+tm);
        }
        //提莫攻击
        rand  = (int)(Math.random()*10);
        if(rand<jsEva){
            System.out.println("提莫攻击剑圣miss");
        }else {
            js-=tmAd;
            System.out.println("剑圣被提莫攻击血量剩余"+gl);
        }
        System.out.println("提莫剩余血量："+tm+",盖伦剩余血量:"+gl+",剑圣剩余血量:"+js);
    }

}
