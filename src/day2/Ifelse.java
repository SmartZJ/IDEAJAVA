package day2;

public class Ifelse {
    public static void main(String[] args) {
        int rand = (int)(Math.random()*101);
        if (rand>60){
            System.out.println("及格了");
        }else{
            System.out.println("没及格");
        }


        if (rand<10){
            System.out.println(rand+"小于10");
        }else if (rand<50){
            System.out.println(rand+"大于10小于50");
        }else if (rand<80){
            System.out.println(rand+"大于50小于80");
        }else {
            System.out.println(rand+"大于80");
        }
    }
}
