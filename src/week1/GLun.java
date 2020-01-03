package week1;

public class GLun {
    int hp;
    int ad;
    public GLun(int hp,int ad){
        this.hp = hp;
        this.ad = ad;
    }
    //攻击方法
    public void attack(Timo tm){
        if (hp>0&&tm.hp>0){
            if (tm.dodge()){
                tm.hp -= ad;
                if (tm.hp<0){
                    tm.hp=0;
                }
                System.out.println("盖伦攻击提莫成功，提莫血量剩余："+tm.hp);
            }else {
                System.out.println("盖伦攻击提莫失败");
            }
        }else {
            if (hp<=0){
                System.out.println("盖伦死亡，无法攻击");
            }else if (tm.hp<=0){
                System.out.println("提莫死亡，无法被选中");
            }else {
                System.out.println("gl.attack erro");
            }
        }
    }
    //闪避方法
    public boolean dodge(){
        boolean flag = true;
        int rand = (int)(Math.random()*10);
        if (rand<=2){
            flag = false;
        }
        return  flag;
    }
}
