package day8.polymorphic;
/*
* 三星手机类：
    功能：发短信-（速度快）播放音乐 玩儿游戏
* */
public class SamsungPhone extends Phone{
    public SamsungPhone(String name, double price, double size, String system) {
        super(name, price, size, system);
    }

    @Override
    public void sendMassage(Person person) {
        System.out.println(person.getName()+"用三星手机发短信-（速度快）");
    }

    @Override
    public void playMusic(Person person) {
        System.out.println(person.getName()+"用三星手机放音乐");
    }

    @Override
    public void playGame(Person person) {
        System.out.println(person.getName()+"用三星手机玩游戏");
    }
}
