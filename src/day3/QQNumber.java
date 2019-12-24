package day3;

import java.util.Scanner;

/*
* 2.创建QQ号，运行程序提示：
	欢迎使用QQ
	请选择：
	1.注册
	2.登录
	3.退出
选择1注册：
		请输入用户名
	用户输入后在提示：
		请输入密码
	用户输入完成提示：
		注册成功
	并打印注册信息
		用户名：xxxx
		密码：xxxx

选择2登录提示：
	请注册QQ
选择3退出提示：
	欢迎再次使用*/
public class QQNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user;
        System.out.println("=====欢迎使用QQ=====");
        System.out.println("=====请选择：=====");
        System.out.println("=====1.注册=====");
        System.out.println("=====2.登录=====");
        System.out.println("=====3.退出=====");
        int password,num = sc.nextInt();
        switch (num){
            case 1:
                System.out.println("=====请输入用户名=====");
                user = sc.next();
                System.out.println("=====请输入密码=====");
                password = sc.nextInt();
                System.out.println("======注册成功======");
                System.out.println("用户名:"+user);
                System.out.println("密码:"+password);
                break;
            case 2:
                System.out.println("=====请注册QQ=====");
                break;
            case 3:
                System.out.println("=====欢迎再次使用=====");
                break;
            default:
                System.out.println("请输入有效指令");
                break;
        }
    }
}
