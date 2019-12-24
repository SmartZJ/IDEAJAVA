package day4;

import java.util.Scanner;

/*
*
=========
全部图形高，用户输入
=========

*****
*****
*****
*****
*****

*
**
***
****
*****

*****
*   *
*   *
*   *
*****

*
***
*****
*******

   *
  ***
 *****
*******

   *
  ***
 *****
*******
 *****
  ***
   *

   *
  * *
 *   *
*     *
 *   *
  * *
   *

* */
public class StarPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height;
        System.out.println("请输入图形高1");
        height = sc.nextInt();
        for (int y = 0;y < height;y++){
            for (int x = 0;x < 5;x++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("请输入图形高2");

        for (int y = 0;y < height;y++){
            for (int x = 0;x <= y;x++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("请输入图形高3");

        for (int y = 0;y < height;y++){
            for (int x = 0;x <= 5;x++){
                if(y==0||y==height-1){
                    System.out.print("*");
                }else {
                    if(x==0||x==5){
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }

            }
            System.out.println();
        }
        System.out.println("请输入图形高4");

        for (int y = 1;y <= height;y++){
            for (int x = 1;x < 2*y;x++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int y=1;y<=height;y++){
            for (int x=1;x<2*(height-y+1);x++){
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("请输入图形高5");

        for(int h = 1;h<=height;h++){
            for (int x = 1;x<height-h+1;x++){
                System.out.print(" ");
            }
            for (int z = 1;z<2*h;z++){
                System.out.print("*");
            }
            System.out.println();
        }
//        for (int y = 0;y < height;y++){
//            if (y%2==0){ }else {
//                for (int x = 0 ; x < (height-y-1)/2 ; x++){
//                    System.out.print(" ");
//                }
//                for (int mx = 0 ;mx < y ; mx++ ){
//                    System.out.print("*");
//                }
//                System.out.println();
//            }
//        }
        System.out.println("请输入图形高6");
        height = sc.nextInt();
        for(int y = 1;y<=height;y++){
            for (int x = 1;x<=height-y;x++){
                System.out.print(" ");
            }
            for (int z = 1;z<2*y;z++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int y = 1;y<=height-1;y++){
            for (int x = 1;x<=y; x++){
                System.out.print(" ");
            }
            for (int x = 1;x<2*(height-y);x++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("请输入图形高6");
        for(int y = 1;y<=height;y++){
            for (int x = 1;x<=height-y;x++){
                System.out.print(" ");
            }
            for (int x = 1;x<2*y;x++){
                if (x==1||x==2*y-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int y = 1;y<=height-1;y++){
            for (int x = 1;x<=y; x++){
                System.out.print(" ");
            }
            for (int x = 1;x<2*(height-y);x++){
                if (x==1||x==2*(height-y)-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
}
}
