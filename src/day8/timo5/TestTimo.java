package day8.timo5;

/*
* 1、完成：
提莫大魔王作战4.0：
创建英雄类，怪物类。
提莫大魔王的：血量:20000; 伤害：500；被动：被攻击时有50%几率闪避
盖伦的血量：3000；盖伦的伤害250；被动：被攻击时有20%几率防御，死亡时有15%几率复活
剑圣的血量：1500；剑圣的伤害2000；被动：被攻击时有30%几率无视，死亡时有10%几率复活
打印他们的初始血量和伤害。

程序要求：盖伦和剑圣轮流攻击体提莫大魔王一次，然后提莫攻击盖伦一次；
盖伦和剑圣再轮流攻击体提莫大魔王一次，然后提莫攻击剑圣一次

如果一个英雄死亡时，判断复活，判断失败即死亡，不能继续攻击，提莫只会攻击另一个存活英雄
判断成功，英雄血量回复到初始化状态
每个英雄只能复活一次

打印每回合攻击是否成功，以及剩余血量
循环执行，胜利条件：提莫死亡 失败条件：两个英雄死亡*/
public class TestTimo {
    public static void main(String[] args) {
        //攻击指示 0：盖伦 1：剑圣
        int instruct;
        //回合计数
        int round = 0;
        boolean flag = true;
        //生成对象
        Hero gl = new Hero("盖伦",3000,250,20,15);
        Hero js = new Hero("剑圣",1500,2000,30,10);
        Monster tm = new Monster("提莫",20000,500,50);
        //打印初始血量和攻击
        System.out.println(gl.getName()+"HP:"+gl.getHp()+"\tAD:"+gl.getAd());
        System.out.println(js.getName()+"HP:"+js.getHp()+"\tAD:"+js.getAd());
        System.out.println(tm.getName()+"HP:"+tm.getHp()+"\tAD:"+tm.getAd());
        //攻击循环
        while (flag){
            //初始化攻击指示
            instruct = 0;
            for (int i = 0; i <2 ; i++) {
                //盖伦攻击
                gl.attack(tm);
                //剑圣攻击
                js.attack(tm);
                //提莫攻击判断
                if(gl.getHp()==0){
                    instruct = 1;
                }else if (js.getHp()==0){
                    instruct = 0;
                }
                //提莫攻击
                if (instruct==0){
                    tm.attack(gl);
                    //复活判定
                    if (gl.getHp()==0){
                        gl.resurrection();
                    }
                }else if (instruct==1){
                    tm.attack(js);
                    //复活判定
                    if (js.getHp()==0){
                        js.resurrection();
                    }
                }
                //指示变换
                instruct = 1;
                round++;
                //一轮攻击结束
                System.out.println("=====第"+round+"回合结束=====");
                System.out.println(tm.getName()+"剩余HP:"+tm.getHp()+"\t"+gl.getName()+"剩余HP:"+gl.getHp()+"\t"+js.getName()+"剩余HP:"+js.getHp()+"\n");
            }
            //胜负判断
            if (tm.getHp()==0){
                System.out.println("=====游戏胜利=====");
                flag = false;
            }else if(js.getHp()==0&&gl.getHp()==0){
                System.out.println("=====游戏失败=====");
                flag = false;
            }
        }
    }

}
