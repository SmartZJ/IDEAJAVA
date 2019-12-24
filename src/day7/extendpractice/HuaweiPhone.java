package day7.extendpractice;
/*
* 华为手机类
属性：名字  系统  屏幕大小  面部解锁
功能：开机  关机  看视频  打电话  发短信  画图  5G通讯
* */
public class HuaweiPhone extends Phone {
    int faceID;

    public HuaweiPhone(String name,  String system, double size,  int faceID) {
        super(name, system, size);
        this.faceID = faceID;
    }

    @Override
    public void open() {
        System.out.println(name+"开机");
    }

    public void draw(){
        System.out.println("画图");

    }
    public void communicate5G(){
        System.out.println("5G千兆网速");
    }

}
