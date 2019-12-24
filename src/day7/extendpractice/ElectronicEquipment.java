package day7.extendpractice;
/*
* 电子设备类
属性：名字
功能：开机  关机
* */
public class ElectronicEquipment {
    String name;

    public ElectronicEquipment(String name) {
        this.name = name;
    }
    public void open(){
        System.out.println("开机");
    }
    public void off(){
        System.out.println("关机");
    }
}
