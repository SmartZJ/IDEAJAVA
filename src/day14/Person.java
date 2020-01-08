package day14;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int age;
    private List<Car> car;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        car = new ArrayList<Car>();
    }



    public List<Car> getCar() {
        return car;
    }

    public void setCar(String car) {
       this.car.add(new Car(car));
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                '}';
    }
}
