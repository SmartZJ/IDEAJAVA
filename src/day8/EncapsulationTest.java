package day8;
/*
* 1、访问修饰符，封装
车类
数据：
    百公里油耗-》其他类可以访问不能设置
    车的价格-》其他类可以访问，可以设置-》设置的价格必须是（5000以上）
    发动机功率-》其他类可以访问不能设置
    最高速度-》其他类可以访问不能设置-》存储的是数字（220）访问的是字符串（220码）
    挡风玻璃大小-》其他类不能访问不能设置
* */
public class EncapsulationTest {
    public static void main(String[] args) {
        Car car = new Car(0.8,5600,700,180,45);
        System.out.println("油耗"+car.getOil());
        car.setPrice(4600);
        System.out.println(car.getPrice());
        car.setPrice(5100);

        System.out.println("功率："+car.getPower()+"kW");

        System.out.println(car.getPrice());
        System.out.println(car.getPower());
        System.out.println(car.getMaxSpeed());

    }
}
