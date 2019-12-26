package day8.timo5;

public class Hero {
    private String name;
    private int hp;
    private int ad;
    private int eva;
    private int probability;
    private  int rhp;

    public Hero(String name, int hp, int ad, int eva,int probability) {
        this.name = name;
        this.hp = hp;
        this.ad = ad;
        this.eva = eva;
        this.probability = probability;
        rhp = hp;
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

    public int getEva() {
        return eva;
    }



    //攻击方法
    public void attack(Monster monster){
        if (monster.getHp() > 0&&hp > 0){
            if (monster.dodge()){
                System.out.println(name+"攻击"+monster.getName()+"失败");
            }else {
                monster.setHp(monster.getHp()-ad);
                if (monster.getHp() < 0){
                    monster.setHp(0);
                }
                System.out.println(name+"攻击"+monster.getName()+"成功\t"+monster.getName()+"剩余HP："+monster.getHp());
            }
        }else {
            if (monster.getHp() < 0){
                System.out.println(monster.getName()+"已死亡无法被选中");
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
