package week2.timo5;

public abstract class Role {
    private String name;
    private int hp;
    private int ad;
    private int eva;

    public Role(String name, int hp, int ad, int eva) {
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

    public int getAd() {
        return ad;
    }

    public int getEva() {
        return eva;
    }



    public void setHp(int hp) {
        this.hp = hp<0?0:hp;
    }
    //攻击方法
    public void attack(Role role){
        if (hp>0){
            if (role.getHp()>0){
                if (role.evade()){
                    System.out.println(name+"攻击"+role.getName()+"失败");
                }else {
                    role.setHp(role.getHp()-ad);
                    System.out.println(name+"攻击"+role.getName()+"成功"+role.getName()+"血量剩余："+role.getHp());
                }
            }else {
                System.out.println(role.getName()+"已死亡无法被选中");
            }
        }else {
            System.out.println(name+"已死亡无法攻击");
        }
    }
    //闪避方法
    public boolean evade(){
        boolean q = true;
        if (getRand() < eva){
            q = true;
        }else {
            q = false;
        }
        return q;
    }
    //获取随机值
    public int getRand(){
        return (int)(Math.random()*100);
    }
}
