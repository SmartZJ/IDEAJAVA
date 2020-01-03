package week3.timo6;

public class Hero extends Role implements Resurrection {
    private boolean flag;
    private int resurrection;
    private int rHp;
    //重写血量设置 调用复活方法
    @Override
    public void setHp(int hp) {
        if (hp<=0&&flag){
            resurrection();
        }else {
            super.setHp(hp);
        }
    }

    public Hero(String name, int hp, int ad, int eva, int resurrection) {
        super(name, hp, ad, eva);
        this.rHp = hp;
        flag = true;
        this.resurrection = resurrection;
    }
    //实现复活方法
    @Override
    public void resurrection() {
        if (flag){
            if (super.getRand()<resurrection){
                System.out.println(super.getName()+"复活成功");
                super.setHp(rHp);
                flag = false;
            }else {
                System.out.println(super.getName()+"复活失败");
                flag = false;
            }

        }else {
            System.out.println("不能复活");
        }
    }
}
