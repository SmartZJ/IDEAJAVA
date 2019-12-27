package week2.timo5;
/*
* 提莫大魔王作战5：
    创建Hero类和Monster类、抽象Role类，接口以及测试类
    Monster：提莫大魔王
    功能：攻击 闪避
    Hero：盖伦 剑圣
    功能：攻击 闪避 复活
    测试类写执行逻辑

    提莫大魔王的：血量:20000; 伤害：500；被动：被攻击时有50%几率闪避
    盖伦的血量：3000；盖伦的伤害250；被动：被攻击时有20%几率防御，死亡时有15%几率复活
    剑圣的血量：1500；剑圣的伤害2000；被动：被攻击时有30%几率无视，死亡时有10%几率复活
    打印他们的初始血量和伤害。

    程序要求：盖伦和剑圣轮流攻击体提莫大魔王一次，然后提莫攻击盖伦一次；盖伦和剑圣再轮流攻击体提莫大魔王一次，然后提莫攻击剑圣一次
    如果一个英雄死亡时，判断复活，判断失败即死亡，不能继续攻击，提莫只会攻击另一个存活英雄
    判断成功，英雄血量回复到初始化状态
    每个英雄只能复活一次

    打印每回合攻击是否成功，以及剩余血量
    循环执行，胜利条件：提莫死亡 失败条件：两个英雄死亡
* */
public class TimoTest {
    public static void main(String[] args) {
        //攻击指示 0：盖伦 1：剑圣
        int instruct = 0;
        //回合计数器
        int round = 0;
        //创建对象
        Role tm = new Monster("提莫",20000,500,50);
        Role gl = new Hero("盖伦",3000,250,20,15);
        Role js = new Hero("剑圣",1500,2000,30,10);
        //打印初始血量和伤害
        System.out.println(tm.getName()+"HP:"+tm.getHp()+"AD:"+tm.getAd());
        System.out.println(gl.getName()+"HP:"+gl.getHp()+"AD:"+gl.getAd());
        System.out.println(js.getName()+"HP:"+js.getHp()+"AD:"+js.getAd());
        //攻击循环
        while (true){
            //盖伦攻击
            gl.attack(tm);
            //剑圣攻击
            js.attack(tm);
            //结束判断1
            if (tm.getHp()==0){
                System.out.println("=====游戏胜利=====");
                break;
            }

            //提莫攻击
            if (instruct==0){
                tm.attack(gl);
                if (js.getHp()>0){
                    instruct = 1;
                }
            }else if (instruct==1){
                tm.attack(js);
                if (gl.getHp()>0){
                    instruct = 0;
                }
            }
            //结束判断2
            if (gl.getHp()==0&&js.getHp()==0){
                System.out.println("=====游戏失败=====");
                break;
            }

            round++;
            //回合结束打印
            System.out.println("=====第"+round+"回合结束=====");
            System.out.println(tm.getName()+"剩余HP:"+tm.getHp());
            System.out.println(gl.getName()+"剩余HP:"+gl.getHp());
            System.out.println(js.getName()+"剩余HP:"+js.getHp()+"\n");
        }
    }
}
