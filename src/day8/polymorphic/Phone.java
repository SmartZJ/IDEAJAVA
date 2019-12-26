package day8.polymorphic;
/*
* 定义一个手机类，封装手机类的属性：
手机的名字：不可更改。
手机的价格：可以改变的。
手机的屏幕大小：不可更改。
手机的操作系统：不可更改。

手机的功能：
播放音乐（用户使用）
玩儿游戏（用户使用）
发短信（用户使用）
CPU的调度，程序开始运行（系统使用）*/
public class Phone {
    private String name;
    private double price;
    private double size;
    private String system;

    public Phone(String name, double price, double size, String system) {
        this.name = name;
        this.price = price;
        this.size = size;
        this.system = system;
    }

    public String getName() {
        return name;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSize() {
        return size;
    }

    public String getSystem() {
        return system;
    }

    public void  playMusic(Person person){
        startCPU();
        System.out.println("播放音乐");
    }
    public void playGame(Person person){
        startCPU();
        System.out.println("玩游戏");
    }
    public void sendMassage(Person person){
        startCPU();
        System.out.println("发短信");
    }
    private void startCPU(){
        System.out.println("程序开始运行");
    }
}
