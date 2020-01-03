package week1;

public class TimoTest {
    public static void main(String[] args) {
        //攻击指示  true盖伦 false剑圣
        boolean flag = true;
        //回合
        int round = 0;
        //新建英雄对象
        Timo tm = new Timo(10000,500);
        GLun gl = new GLun(3000,250);
        JShen js = new JShen(1500,2000);
        //打印初始血量和伤害。
        System.out.println("提莫 HP："+tm.hp+"AD:"+tm.ad);
        System.out.println("盖伦 HP："+gl.hp+"AD:"+gl.ad);
        System.out.println("剑圣 HP："+js.hp+"AD:"+js.ad);
        while (true){
            //提莫攻击指示
            if (flag){
                flag = false;
            }else {
                flag = true;
            }
            //盖伦攻击提莫
            gl.attack(tm);
            //剑圣攻击提莫
            js.attack(tm);
            //提莫攻击判断
            if (js.hp<=0&&tm.hp>0){
                flag = true;
            }else if (gl.hp<=0&&tm.hp>0){
                flag = false;
            }
            //提莫攻击
            if (flag){
                tm.attack(gl);
            }else {
                tm.attack(js);
            }
            round++;
            //回合结束打印
            System.out.println("=====第"+round+"回合结束=====\n");
            System.out.println("提莫剩余HP:"+tm.hp+"\t盖伦剩余HP:"+gl.hp+"\t剑圣剩余HP:"+js.hp);
            //跳出循环判断
            if (tm.hp==0){
                System.out.println("=====提莫死亡，游戏胜利=====");
                break;
            }else if (js.hp==0&&gl.hp==0){
                System.out.println("=====盖伦、剑圣死亡，游戏失败=====");
                break;
            }
        }
    }
}
