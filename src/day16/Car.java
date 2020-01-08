package day16;

import java.util.ArrayList;
import java.util.List;

public class Car implements Comparable<Car> {
    String name;
    List<Integer> score;

    public Car(String name) {
        this.name = name;
        score = new ArrayList<>();
    }

    public List<Integer> getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score.add(score);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getScores() {
        int sum = 0;
        for (Integer i:score) {
            sum+=i;
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        return  this.getScores()-o.getScores();
    }
}
