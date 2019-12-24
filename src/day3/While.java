package day3;

import java.util.Scanner;

/*
* --- 选择while解决下面需求
1、利用while循环打印：1到100的所有数字

2、利用循环打印"hello world2","hello world3"...."hello world11"。

3、利用循环打印50到100之间所有能被3整除的偶数。

4、分别求出100-200以内的奇数和和偶数和。

5.随机生成1-100以内的数字，用户输入猜测，小了提示“第1次，猜小了”，继续输入，大了反之，猜正确，如果次数<=5次，提示“第n次，恭喜你，运气真好，猜测正确”，如果>5次,<=10次，提示“第n次，恭喜你，猜测正确”，如果>10次，提示“第n次猜测正确，该多练习逻辑题”

6、用户键盘输入一个月份数字，利用循环打印该月所有日期
例如1月
输出："1月1日","1月2日","1月3日"......,"1月30日","1月31日"

7、输出高为n，宽为3的（n是用户输入的数字）的矩形，输入0则不打印
例如：当n为4时，输出如下图形：
   ***
   ***
   ***
   ***
8、利用循环：从键盘获取用户输入的一个（1-12内的月份数字），并打印该数字代表月的季度，

如果用户输入的不是该范围的数字则提示并重新输入。*/
public class While {

    public static void main(String[] args) {
        System.out.println("=====1=====");
        int num=0;
        while (num<100){
            num++;
            System.out.println(num);
        }
        System.out.println("=====2=====");
        num = 1;
        while (num<11){
            num++;
            System.out.println("hello world"+num);
        }
        System.out.println("=====3=====");
        num = 50;
        while (num<100){
            if (num%3==0){
                System.out.println(num);
            }
            num++;
        }
        System.out.println("=====4=====");
        num=100;
        int oddNum=0,evenNum=0;
        while (true){
            if (num%2==0){
                evenNum+=num;
            }else{
                oddNum+=num;
            }
            num++;
            if (num>200){
                System.out.println("奇数和为："+oddNum+"偶数和为："+evenNum);
                break;
            }
        }
        System.out.println("=====5=====");
        num = 0;
        int innum = 0,rand = (int)(Math.random()*100+1);
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个人1-100的数字");
        do {
            innum = sc.nextInt();
            num++;
            if (innum>rand){
                System.out.println("第"+num+"次,猜大了");
            }else if (innum<rand){
                System.out.println("第"+num+"次,猜小了");
            }else {
                if (num<=5){
                    System.out.println("第"+num+"次,恭喜你，运气真好，猜测正确");
                }else if(num<=10){
                    System.out.println("第"+num+"次,恭喜你，猜测正确");
                }else {
                    System.out.println("第"+num+"次猜测正确，该多练习逻辑题");
                }
            }
        } while (rand!=innum);
        System.out.println("=====6=====");
        num=0;
        int month,day=0;
        System.out.println("=====请输入一个月份=====");
        while (day==0){
            month = sc.nextInt();
            switch (month){
                case 4:
                case 6:
                case 9:
                case 11:
                    day = 30;
                    break;
                case 2:
                    day = 28;
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    day = 31;
                    break;
                default:
                    System.out.println("不是月份数字");
            }
            while (num<day){
                num++;
                System.out.println(month+"月"+num+"日");
            }
        }
        System.out.println("=====7=====");
        num = 0;
        int h=0;
        System.out.println("请输入矩形高");
        h=sc.nextInt();
        while (num<h){
            System.out.println("***");
            num++;
        }
        System.out.println("=====8=====");
        System.out.println("=====请输入一个月份=====");
        month=0;
        while (month<1||month>12){
            month = sc.nextInt();
            switch (month){
                case 1:
                case 2:
                case 3:
                    System.out.println(month+"月是一季度");
                    break;
                case 4:
                case 5:
                case 6:
                    System.out.println(month+"月是二季度");
                    break;
                case 7:
                case 8:
                case 9:
                    System.out.println(month+"月是三季度");
                    break;
                case 10:
                case 11:
                case 12:
                    System.out.println(month+"月是四季度");
                    break;
                default:
                    System.out.println("不是月份数字请重新输入");
            }
        }
    }
}
