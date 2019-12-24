package day7.util;

import java.util.Scanner;

/*
*
* 方法改造：普通方法改造为静态方法
       定义获取用户输入整数的工具类InputUtil，在类中封装如下三个静态方法，（利用，static属性，static方法，方法重载）
提示：一个Scanner对象可以多次获取用户输入，程序只需要一个Scanner对象就够了。
1）封装一个方法：获取用户键盘输入的整数并返回：int  getInput();

2）封装一个方法：获取用户键盘输入的整数并返回，可以传入指定提示：int  getInput(String tishi);

3）封装一个方法，获取用户键盘输入指定范围的整数,如果输入的不是该范围的则重新输入，输入对应范围则返回，并带指定提示的方法 int  getInput(int min,int max,String tishi)

*/
public class InputUtil {
    static Scanner sc = new Scanner(System.in);
    public static int getInput(){
        int num = 0;
        num = sc.nextInt();
        return num;
    }
    public static int getInput(String tishi){
        int num = 0;
        System.out.println(tishi);
        num = sc.nextInt();
        return num;
    }
    public static String getInputString(String tishi){
        String str = "";
        System.out.println(tishi);
        str = sc.next();
        return str;
    }
    public static int getInput(int min,int max,String tishi){
        int num = 0;
        while (true){
            System.out.println(tishi);
            num = sc.nextInt();
            if (min<num&&num<max){
                break;
            }else {
                System.out.println("请输入有效数字");
            }
        }
        return num;
    }

}
