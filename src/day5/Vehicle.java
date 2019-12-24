package day5;
/*
3.交通工具(Vehicle)类:
属性： 名字(name)、速度(speed=0)、 体积(size)
方法：移动(move())、设置速度(setSpeed(int speed))
		加速 speedUp()：每次加速10km/h
		减速 speedDown()：每次减速10km/h
构造器:1.name,size
	驾驶员小黑开bz车，先在城市中，40km/h，后上高速，加速到90km/h
* */
public class Vehicle {
    String name ;
    int speed = 0;
    int size;
    public Vehicle(String name,int size ){
        this.name = name;
        this.size = size;
    }
    public void move(){ }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public void speedUp(){
        speed+=10;
    }
    public void speedDown(){
        speed-=10;
    }
}
