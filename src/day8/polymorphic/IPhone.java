package day8.polymorphic;
/*
* 苹果手机类：
    功能： 发短信-（速度一般） 播放音乐 玩儿游戏
* */
public class IPhone extends Phone{

    public IPhone(String name, double price, double size, String system) {
        super(name, price, size, system);
    }

    @Override
    public void sendMassage(Person person) {
        System.out.println(person.getName()+"用苹果手机发短信-（速度一般）");
    }

    @Override
    public void playMusic(Person person) {
        System.out.println(person.getName()+"用苹果手机播放音乐");
    }

    @Override
    public void playGame(Person person) {
        System.out.println(person.getName()+"用苹果手机玩游戏");
    }
}
