package day3;

import java.util.Scanner;

/*
1.根据用户输入的月份，打出该月份的天数(不需要考虑润年、闰月)，
输入1-12之外数字则打印-不是月份数字。
    4 6 9 11 -->30
    2 -->28
    1 3 5 7 8 10 12  -->31

* */
public class Switch {
    public static void main(String[] args) {
        System.out.println("=====请输入月份=====");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num){
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(num+"月有30天");
                break;
            case 2:
                System.out.println(num+"月有28天");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(num+"月有31天");
                break;
            default:
                System.out.println("不是月份数字");
        }
    }
}
