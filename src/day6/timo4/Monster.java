package day6.timo4;

public class Monster {
    String name;
    int hp;
    int ad;
    int eva;

    public Monster(String name, int hp, int ad, int eva) {
        this.name = name;
        this.hp = hp;
        this.ad = ad;
        this.eva = eva;
    }
    //攻击方法
    public void attack(Hero hero){
        if (hero.hp > 0&&hp > 0){
            if (hero.dodge()){
                System.out.println(name+"攻击"+hero.name+"失败");
            }else {
                hero.hp -= ad;
                if (hero.hp < 0){
                    hero.hp = 0;
                }
                System.out.println(name+"攻击"+hero.name+"成功\t"+hero.name+"剩余HP："+hero.hp);
            }
        }else {
            if (hero.hp < 0){
                System.out.println(hero.name+"已死亡无法被选中");
            }else if (hp < 0){
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

}
