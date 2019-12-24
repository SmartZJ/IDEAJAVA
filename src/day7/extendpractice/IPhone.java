package day7.extendpractice;
/*
* 苹果手机类
属性：名字  系统  屏幕大小  指纹解锁
功能：开机  关机  看视频  打电话  发短信  画图  视频编辑
* */
public class IPhone extends Phone{
    String name;
    String system;
    int size;
    int fingerID;

    public IPhone(String name, String name1, String system, int size, String name2, String system1, int size1, int fingerID) {
        super(name, name1, system, size);
        this.name = name2;
        this.system = system1;
        this.size = size1;
        this.fingerID = fingerID;
    }

    public void draw(){
        System.out.println("画图");

    }

    public void videoEdit(){
        System.out.println("视频编辑");
    }
}
