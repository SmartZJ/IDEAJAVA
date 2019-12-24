package day7.extendpractice;
/*
* 华为手机类
属性：名字  系统  屏幕大小  面部解锁
功能：开机  关机  看视频  打电话  发短信  画图  5G通讯
* */
public class HuaweiPhone extends Phone {
    String name;
    String system;
    int size;
    int faceID;

    public HuaweiPhone(String name, String name1, String system, int size, String name2, String system1, int size1, int faceID) {
        super(name, name1, system, size);
        this.name = name2;
        this.system = system1;
        this.size = size1;
        this.faceID = faceID;
    }
    public void draw(){
        System.out.println("画图");

    }
    public void communicate5G(){
        System.out.println("5G千兆网速");
    }

}
