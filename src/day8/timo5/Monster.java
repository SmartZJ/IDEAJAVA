package day8.timo5;

public class Monster {
    private String name;
    private int hp;
    private int ad;
    private int eva;

    public Monster(String name, int hp, int ad, int eva) {
        this.name = name;
        this.hp = hp;
        this.ad = ad;
        this.eva = eva;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAd() {
        return ad;
    }

    private void setAd(int ad) {
        this.ad = ad;
    }



    //攻击方法
    public void attack(Hero hero){
        if (hero.getHp() > 0&&hp > 0){
            if (hero.dodge()){
                System.out.println(name+"攻击"+hero.getName()+"失败");
            }else {
                hero.setHp(hero.getHp()-ad);
                if (hero.getHp() < 0){
                    hero.setHp(0);
                }
                System.out.println(name+"攻击"+hero.getName()+"成功\t"+hero.getName()+"剩余HP："+hero.getHp());
            }
        }else {
            if (hero.getHp() < 0){
                System.out.println(hero.getName()+"已死亡无法被选中");
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
