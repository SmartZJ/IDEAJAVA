package day8.polymorphic;
/*1、继承+重写+多态
需求：
a）测试类中提供一个方法，根据参数“三星”，“苹果”，“小米”--》返回对应的手机对象。
b）周杰伦用三星手机发短信，林俊杰用苹果手机发短信
*/
public class Test {
    public static void main(String[] args) {
        System.out.println("=====a=====");
        Phone miPhone = productionPhone("小米");

        System.out.println("=====b=====");
        Phone smPhone = productionPhone("三星");
        Phone iphone = productionPhone("苹果");
        Person zjl = new Person("周杰伦");
        Person ljj = new Person("林俊杰");
        zjl.sendMassage(smPhone);
        ljj.sendMassage(iphone);
    }
    public static Phone productionPhone(String string){
        Phone phone = null;
        switch (string){
            case "三星":
                phone = new SamsungPhone("三星手机",5500,6.0,"Android 8.0");
                break;
            case "苹果":
                phone = new IPhone("苹果手机",8850.50,6.5,"IOS 11.7");
                break;
            case "小米":
                phone = new MiPhone("小米手机",6000,5.5,"MUI 10.0");
                break;
            default:
                System.out.println("我们不生产这个手机");
        }
        return phone;
    }
}
