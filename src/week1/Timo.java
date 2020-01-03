package week1;

public class Timo {
    int hp;
    int ad;
    public Timo(int hp,int ad){
        this.hp = hp;
        this.ad = ad;
    }
    //攻击方法
    public void attack(GLun gl){
        if (hp>0&&gl.hp>0){
            if (gl.dodge()){
                gl.hp -= ad;
                if (gl.hp<0){
                    gl.hp=0;
                }
                System.out.println("提莫攻击盖伦成功，盖伦血量剩余："+gl.hp);
            }else {
                System.out.println("提莫攻击盖伦失败");
            }
        }else {
            if (hp<=0){
                System.out.println("提莫死亡，无法攻击");
            }else if (gl.hp<=0){
                System.out.println("盖伦死亡，无法被选中");
            }else {
                System.out.println("tm.attack gl erro");
            }
        }
    }
    //攻击方法
    public void attack(JShen js){
        if (hp>0&&js.hp>0){
            if (js.dodge()){
                js.hp -= ad;
                if (js.hp<0){
                    js.hp=0;
                }
                System.out.println("提莫攻击剑圣成功，剑圣血量剩余："+js.hp);
            }else {
                System.out.println("提莫攻击剑圣失败");
            }
        }else {
            if (hp<=0){
                System.out.println("提莫死亡，无法攻击");
            }else if (js.hp<=0){
                System.out.println("剑圣死亡，无法被选中");
            }else {
                System.out.println("tm.attack gl erro");
            }
        }
    }
    //闪避方法
    public boolean dodge(){
        boolean flag = true;
        int rand = (int)(Math.random()*10);
        if (rand<=5){
            flag =false;
        }
        return flag;
    }
}
