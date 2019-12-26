package day8.polymorphic;

public class MiPhone extends Phone{
/*
* 小米手机类：
    功能：发短信-（速度慢）播放音乐 玩儿游戏*/
    public MiPhone(String name, double price, double size, String system) {
        super(name, price, size, system);
    }

    @Override
    public void sendMassage(Person person) {
        System.out.println(person.getName()+"用小米手机发短信-速度慢）");
    }

    @Override
    public void playMusic(Person person) {
        System.out.println(person.getName()+"用小米手机听音乐");
    }

    @Override
    public void playGame(Person person) {
        System.out.println(person.getName()+"小米手机玩游戏");
    }
}
