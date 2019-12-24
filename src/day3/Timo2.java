package day3;
/*提莫大魔王作战3.0：
提莫大魔王的：血量:10000; 伤害：500；被动：被攻击时有50%几率闪避
盖伦的血量：3000；盖伦的伤害250；被动：被攻击时有20%几率防御
剑圣的血量：1500；剑圣的伤害2000；被动：被攻击时有30%几率无视
打印他们的初始血量和伤害。

程序要求：
盖伦和剑圣轮流攻击体提莫大魔王一次，然后提莫攻击盖伦一次；
盖伦和剑圣再轮流攻击体提莫大魔王一次，然后提莫攻击剑圣一次；
如果一个英雄死亡，不能继续攻击，提莫只会攻击另一个存活英雄

打印每回合攻击是否成功，以及剩余血量
循环执行，胜利条件：提莫死亡 失败条件：两个英雄死亡*/
public class Timo2 {
    public static void main(String[] args) {
        //英雄参数
    int tmHp = 10000,tmAd = 500,tmEva = 5;
    int glHp = 3000,glAd = 250,glEva = 2;
    int jsHp = 1500,jsAd = 2000,jsEva = 3;
        //回合计数器
    int rand,round = 0;
        //攻击指示 0攻击盖伦 1攻击剑圣
    int pointer = 0;
    while (true){
        //每次循环攻击指示归零
        pointer = 0;
        //攻击循环
        for (int i = 0;i<2;i++){
            //盖伦攻击判断
            if (glHp>0&&tmHp>0){
                rand = (int)(Math.random()*10);
                if (rand<tmEva){
                    System.out.println("盖伦攻击提莫失败");
                }else {
                    tmHp-=glAd;
                    System.out.println("盖伦攻击提莫成功,提莫剩余血量"+tmHp);
                    if (tmHp<0){
                        tmHp=0;
                    }
                }
            }else {
                System.out.println("盖伦死亡无法攻击");
            }
            //剑圣攻击判断
            if (jsHp>0&&tmHp>0){
                rand = (int)(Math.random()*10);
                if (rand<tmEva){
                    System.out.println("剑圣攻击提莫失败");
                }else {
                    tmHp-=jsAd;
                    System.out.println("剑圣攻击提莫成功,提莫剩余血量"+tmHp);
                    if (tmHp<0){
                        tmHp=0;
                    }
                }
            }else {
                System.out.println("剑圣死亡无法攻击");
            }

            //攻击指示判断 有英雄死亡只攻击存活英雄
            if (glHp<=0&&jsHp>0){
                pointer=1;
                System.out.println("*盖伦死亡，攻击剑圣");
            }
            if (glHp>0&&jsHp<=0){
                pointer=0;
                System.out.println("*剑圣死亡，攻击盖伦");
            }

            //提莫攻击判断
            if (pointer==0&&glHp>0&&tmHp>0){
                rand = (int)(Math.random()*10);
                if (rand<glEva){
                    System.out.println("提莫攻击盖伦失败\n");
                }else {
                    glHp-=tmAd;
                    System.out.println("提莫攻击盖伦成功,盖伦剩余血量:"+glHp+"\n");
                }
            }else if (pointer==1&&jsHp>0&&tmHp>0){
                rand = (int)(Math.random()*10);
                if (rand<jsEva){
                    System.out.println("提莫攻击剑圣失败\n");
                }else {
                    jsHp-=tmAd;
                    System.out.println("提莫攻击剑圣成功,剑圣剩余血量:"+jsHp+"\n");
                }
            }
            //第一次攻击循环后改变对象
            pointer=1;
        }
        round++;
        System.out.println("=====第"+round+"轮攻击结束");
        System.out.println("=====提莫剩余血量："+tmHp+"盖伦剩余血量："+glHp+"剑圣剩余血量："+jsHp+"=====\n");
        //结束循环判定
        if (tmHp<=0||(jsHp<=0&&glHp<=0)){
            if (tmHp<=0){
                System.out.println("Y=====游戏胜利=====Y");
            }else {
                System.out.println("N=====游戏失败=====N");
            }
            break;
            }
        }
    }
}
