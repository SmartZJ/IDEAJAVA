package day5;
/*
* 2.手机Phone类
属性：型号(type)屏幕大小(size)操作系统(os)中央处理器(cpu)
功能：播放音乐(playMusic())播放视频(playVideo())玩儿游戏(playGame())
构造器:1.type,size,os,cpu

* */
public class Phone {
    String type;
    double size;
    String os;
    String cpu;
    public Phone(String type,double size,String os,String cpu){
        this.type = type;
        this.size = size;
        this.os = os;
        this.cpu = cpu;
    }
    public void playMusic(){
        System.out.println("使用"+type+"播放音乐");
    }
    public void playVideo(){
        System.out.println("播放视频");
    }
}
