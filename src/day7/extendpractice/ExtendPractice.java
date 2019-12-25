package day7.extendpractice;
/*
* 电子设备类
属性：名字
功能：开机  关机

手机类
属性：名字  系统  屏幕大小
功能：开机  关机  看视频  打电话  发短信

苹果手机类
属性：名字  系统  屏幕大小  指纹解锁
功能：开机  关机  看视频  打电话  发短信  画图  视频编辑

华为手机类
属性：名字  系统  屏幕大小  面部解锁
功能：开机  关机  看视频  打电话  发短信  画图  5G通讯

* */
public class ExtendPractice {
    public static void main(String[] args) {
        HuaweiPhone hwPhone = new HuaweiPhone("MATE 30","鸿蒙",6.0,884800);
        IPhone iPhone = new IPhone("IPhone 11","ios11.7",8.5,9974);
        hwPhone.open();
       Phone phone =  new Phone("小米","Android 8.0",5.6);
       HuaweiPhone hw2 = (HuaweiPhone) phone;
       hw2.off();
    }
}
