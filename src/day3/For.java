package day3;

import java.util.Scanner;

/*
*
* 1、输出a---z的全部小写英文字母。提示：字母和整数有对应关系。

2、输出1-1000之间能被5整除的数，并计算他们的和。

3、运行程序
提示：
	***********欢迎注册QQ***********
	请选择：
	1.注册QQ
	2.登录QQ
	3.退出

选择1.注册QQ
	提示：请输入用户名
用户输入后在提示：
	提示：请输入密码
用户输入完成提示：
	提示：请再次输入密码
验证两次密码是否相同，如果相同，提示：注册成功		不同，提示：注册失败
返回选择页面

选择2.登录QQ，如果没有注册，则提示：没有注册用户，返回选择页面
	提示：请输入用户名
用户输入后在提示：
	提示：请输入密码
验证用户名、密码是否相同
	如果相同，提示：登录成功，欢迎XXX用户使用QQ.
	不同，提示：登录失败，用户名或密码不正确,返回选择页面
选择3.退出程序
*/
public class For {
    public static void main(String[] args) {
        System.out.println("=====1=====");
        for (int i = 0;i<26;i++){
            System.out.println((char)(i+97));
        }
        System.out.println("=====2=====");
        int sum = 0;
        for (int i = 0;i<=1000;i++){
            if (i%5==0){
                sum+=i;
            }
        }
        System.out.println("1-1000之间能被5整除的数的和为"+sum);
        System.out.println("=====3=====");
        Scanner sc = new Scanner(System.in);
        String registerUsername = null,loginUsername = null,registerPassword = null,loginPassword = null;
        int num = 0;
        System.out.println("***********欢迎注册QQ***********");
        for (;;){
            System.out.println("请选择：" +"\n1.注册QQ"+"\n2.登录QQ"+"\n3.退出\n");
            num = sc.nextInt();
           if (num==1){
               System.out.println("请输入用户名");
                String un = sc.next();
               System.out.println("请输入密码");
                String pw = sc.next();
               System.out.println("请再次输入密码");
               String pwr = sc.next();
                if (pw.equals(pwr)){
                    System.out.println("注册成功\n");
                    un=registerUsername;
                    pw=registerPassword;
                }else {
                    System.out.println("注册失败\n");
                }
           }else if (num==2){
               if (registerPassword==null||registerUsername==null){
                   System.out.println("没有注册用户\n");
               }else {
                   System.out.println("请输入用户名");
                   loginUsername = sc.next();
                   System.out.println("请输入密码");
                   loginPassword = sc.next();
                   if (registerUsername.equals(loginUsername)&&loginPassword.equals(registerPassword)){
                       System.out.println("登录成功\n");
                       System.out.println("欢迎"+registerUsername+"用户使用QQ.");
                       break;
                   }else {
                       System.out.println("登录失败，用户名或密码不正确!\n");
                   }
               }
           }else if (num==3){
               System.out.println("退出程序");
               break;
           }
        }

    }
}
