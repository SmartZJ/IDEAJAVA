package week3.timo6;

import java.util.ArrayList;
import java.util.List;

/*
* 提莫大魔王作战6：
	创建Hero类和Monster类、抽象Role类，接口以及测试类
	Monster：提莫大魔王、大龙
	功能：攻击 闪避
	Hero：盖伦 剑圣 剑姬 剑魔
	功能：攻击 闪避 复活
	测试类写执行逻辑

	提莫大魔王的：血量:20000; 伤害：500；被动：被攻击时有50%几率闪避
	大龙的：血量:30000; 伤害：400；被动：被攻击时有30%几率闪避
	盖伦的血量：3000；盖伦的伤害250；被动：被攻击时有20%几率防御，死亡时有15%几率复活
	剑圣的血量：1500；剑圣的伤害2000；被动：被攻击时有30%几率无视，死亡时有10%几率复活
	剑姬的血量：2000；剑姬的伤害2500；被动：被攻击时有40%几率防御，死亡时有15%几率复活
	剑魔的血量：2500；剑魔的伤害1000；被动：被攻击时有10%几率无视，死亡时有40%几率复活
	打印他们的初始血量和伤害。

	程序要求：hero轮流攻击一位monster一次，monster轮流攻击一位hero一次，
	如果一个英雄死亡时，判断复活，判断失败即死亡，不能继续攻击，剩下monster不再攻击
	判断成功，英雄血量回复到初始化状态
	如果一个英雄死亡时，剩下存活英雄不再攻击，进入怪物攻击阶段
	每个英雄只能复活一次

	打印每回合攻击是否成功，以及剩余血量
	循环执行，胜利条件：monster全部死亡 失败条件：hero全部死亡
* */
public class TimoTest {
    public static void main(String[] args) {
        //攻击指示 0：盖伦 1：剑圣
        int instruct = 0;
        //回合计数器
        int round = 0;
        //创建对象
        boolean flag = true;
        Role tm = new Monster("提莫",20000,500,50);
        Role dl = new Monster("大龙",30000,400,30);
        Role gl = new Hero("盖伦",3000,250,20,15);
        Role js = new Hero("剑圣",1500,2000,30,10);
        Role jj = new Hero("剑姬",2000,2500,40,15);
        Role jm = new Hero("剑魔",2500,1000,10,40);
        //分别存入两个list
        List<Role> hero = new ArrayList<Role>();
        hero.add(gl);
        hero.add(js);
        hero.add(jj);
        hero.add(jm);
        List<Role> monster = new ArrayList<Role>();
        monster.add(tm);
        monster.add(dl);
        //打印初始血量和伤害
        System.out.println("=====Moster=====");
        for (Role r:monster) {
            System.out.println(r.getName()+"HP:"+r.getHp()+"AD:"+r.getAd());
        }
        System.out.println("=====Hero=====");
        for (Role r:hero) {
            System.out.println(r.getName()+"HP:"+r.getHp()+"AD:"+r.getAd());
        }
        //攻击循环
        int i = 0;
        while (flag){

                //hero攻击循环
                for (Role r:hero) {
                    if (monster.get(i%monster.size()).getHp()==0){
                        System.out.println("怪物"+monster.get(i%monster.size()).getName()+"死亡停止攻击");
                        break;
                    }else {
                        r.attack(monster.get(i%2));
                    }
                }
                //结束判断1
                int count = 0;
                for (Role r:monster) {
                    if (r.getHp()==0){
                        count++;
                    }
                    if (count==monster.size()){
                        System.out.println("=====游戏胜利=====");
                        flag = false;
                    }
                }
                count = 0;
                if (!flag){
                    break;
                }
                //moster攻击循环
                for (Role r:monster) {
                    if (hero.get(i).getHp()==0){
                        System.out.println("英雄"+hero.get(i).getName()+"死亡停止攻击");
                        break;
                    }else {
                        r.attack(hero.get(i));
                    }
                }
                //结束判断2
                for (Role r:hero) {
                    if (r.getHp()==0){
                        count++;
                    }
                    if (count==hero.size()){
                        System.out.println("=====游戏失败=====");
                        flag = false;
                    }
                }
                count = 0;
                round++;
                //打印剩余血量
                System.out.println("=====Moster=====");
                for (Role r:monster) {
                    System.out.println(r.getName()+"剩余HP:"+r.getHp());
                }
                System.out.println("=====Hero=====");
                for (Role r:hero) {
                    System.out.println(r.getName()+"剩余HP:"+r.getHp());
                }
                System.out.println("=====第"+round+"回合=====\n");
                i++;
                if (i==hero.size()){
                    i=0;
                }
//            }
        }
        //打印剩余血量
        System.out.println("=====Moster=====");
        for (Role r:monster) {
            System.out.println(r.getName()+"剩余HP:"+r.getHp());
        }
        System.out.println("=====Hero=====");
        for (Role r:hero) {
            System.out.println(r.getName()+"剩余HP:"+r.getHp());
        }
    }
}
