package day11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException {
    public static void main(String[] args) {
        inputInt();
    }
    public static int inputInt(){
        Scanner sc = new Scanner(System.in);
        int input ;
        while (true){
            try {
                input  = sc.nextInt();
                return input;
            }catch (InputMismatchException e){
                System.out.println("输入数据无效，重新输入");
                sc.next();
            }
        }
    }
}
