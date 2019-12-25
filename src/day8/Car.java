package day8;

public class Car {
    private double oil;
    private double price;
    private int power;
    private int maxSpeed;
    private int glassSize;

    public Car(double oil, double price, int power, int maxSpeed, int glassSize) {
        this.oil = oil;
        setPrice(price);
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.glassSize = glassSize;
    }

    public double getOil() {
        return oil;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price>5000){
            this.price = price;
        }else {
            if (price>0){
                System.out.println("价格修改不符合规范");
            }else {
                this.price = 5000;
            }
        }

    }

    public int getPower() {
        return power;
    }


    public String getMaxSpeed() {
        return maxSpeed + "码";
    }

    public void setMaxSpeed(int speed) {
        this.maxSpeed = maxSpeed;
    }


}
