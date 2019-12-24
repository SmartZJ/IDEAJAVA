package day7.extendpractice;
/*
* 手机类
属性：名字  系统  屏幕大小
功能：开机  关机  看视频  打电话  发短信*/
public class Phone extends ElectronicEquipment {
    String system;
    double size;

    public Phone(String name, String system, double size) {
        super(name);
        this.system = system;
        this.size = size;
    }

    public void watchVideo(){
        System.out.println("看视频");
    }

    public void call(){
        System.out.println("打电话");
    }

    public void sendMessage(){
        System.out.println("发短信");
    }
}
