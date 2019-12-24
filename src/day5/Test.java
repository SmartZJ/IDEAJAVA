package day5;

public class Test {
    public static void main(String[] args) {
        //创建学生'陆华'对象,调用学习，使用华为mate30听音乐
        Phone lhphone = new Phone("华为",5.5,"Android 8.0","麒麟960");
        Student stu = new Student("陆华");
        stu.phone=lhphone;
        stu.study();
        stu.phone.playMusic();

        //驾驶员小黑开bz车，先在城市中，40km/h，后上高速，加速到90km/h
        Person xh = new Person("小黑",20);
        Vehicle bc = new Vehicle("奔驰",6);
        xh.car = bc;
        xh.car.setSpeed(40);
        System.out.println("驾驶员"+xh.name+"驾驶"+bc.name+"在城市中行驶,速度为"+bc.speed);
        System.out.println("上高速，开始加速");
        xh.car.speedUp();
        System.out.println("速度"+bc.speed);
        xh.car.speedUp();
        System.out.println("速度"+bc.speed);
        xh.car.speedUp();
        System.out.println("速度"+bc.speed);
        xh.car.speedUp();
        System.out.println("速度"+bc.speed);
        xh.car.speedUp();
        System.out.println("速度"+bc.speed);
        xh.display();

        Draw d = new Draw(19,5);
        d.drawTrian();
        d.drawRec();
        d.draPra();

        Point p1 = new Point(5,8),p2 = new Point(9,11);
        p1.pointDistance(p2);

    }
}
