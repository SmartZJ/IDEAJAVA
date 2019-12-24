package day6.timo4;

public class Hero {
    String name;
    int hp;
    int ad;
    int eva;
    int probability;
    int rhp;

    public Hero(String name, int hp, int ad, int eva,int probability) {
        this.name = name;
        this.hp = hp;
        this.ad = ad;
        this.eva = eva;
        this.probability = probability;
        rhp = hp;
    }
    //攻击方法
    public void attack(Monster monster){
        if (monster.hp > 0&&hp > 0){
            if (monster.dodge()){
                System.out.println(name+"攻击"+monster.name+"失败");
            }else {
                monster.hp -= ad;
                if (monster.hp < 0){
                    monster.hp = 0;
                }
                System.out.println(name+"攻击"+monster.name+"成功\t"+monster.name+"剩余HP："+monster.hp);
            }
        }else {
            if (monster.hp < 0){
                System.out.println(monster.name+"已死亡无法被选中");
            }else {
                System.out.println(name+"已死亡无法攻击");
            }
        }
    }
    //闪避判定
    public boolean dodge(){
        int rand = (int)(Math.random()*101);
        if (eva>rand){
            return true;
        }else {
            return false;
        }
    }
    //复活判定
    public void resurrection(){
        int rand = (int)(Math.random()*101);
        if (rand<probability&&rhp!=0){
            hp = rhp;
            System.out.println(name+"复活");
            rhp = 0;
        }else {
            System.out.println(name+"死亡");
        }
    }
}
