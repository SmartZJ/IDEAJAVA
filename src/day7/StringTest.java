package day7;

import day7.util.InputUtil;

/*
* 1. 给定一个字符串,判断该字符串中是否包含某个子串.如果包含,求出子串的所有出现位置.
如:"abcbcbabcb34bcbd"中,"bcb"子串的出现位置为: 1,7,12.字符串和子串均由用户输入

2.给定一个长度,随机产生一个该长度的字符串,由大写,小写字母以及数字组成

3.给定一个由数字组成的字符串,如:"1239586838923173478943890234092",统计
出每个数字出现的次数
* */
public class StringTest {
    public static void main(String[] args) {
       StringTest t = new StringTest();
       t.Test1();
       t.Test2();
       t.Test3();

    }
    public void Test1(){
        String str = "";
        String input = null,output = "";
        System.out.println("=====1=====");
        str = InputUtil.getInputString("输入第一串字符");
        input = InputUtil.getInputString("输入第二串字符");
        String out = "";
        for (int i = 0; i <str.length() ; i++) {
            if (str.indexOf(input,i)==-1){
                out = "没有匹配字符 ";
            }else {
                out += str.indexOf(input,i)+",";
                i=(str.indexOf(input,i)+input.length());
            };
        }
        System.out.println(out.substring(0,out.length()-1));

    }
    public void Test2(){
        int index = 0;
        String output = "";
        //48-57、65-90、97-122
        System.out.println("=====2=====");
        index = InputUtil.getInput("随机生成，请给定长度");
        for (int i = 0; i <index ; i++) {
            //生成数字
            int rand = (int)(Math.random()*10+48);
            //生成字母
            int rand2 = (int)(Math.random()*26+65);
            //生成选择
            int choice = (int)(Math.random()*3);
            //测试打印
//            System.out.println("rand:"+rand+"rand2:"+rand2+"choice:"+choice);
           switch (choice){
               case 0:
                   output+=(char)rand;
                   break;
               case 1:
                   output+=(char)rand2;
                   break;
               case 2:
                   output+=(char)(rand2+32);
                   break;
               default:
                   System.out.println("erro");
           }
        }
        System.out.println(output);
    }
    public void Test3(){
        System.out.println("=====3=====");
        String num = InputUtil.getInputString("输入一串数字");
        System.out.println("统计每个字符出现的次数");
        for (int i = 0; i <10 ; i++) {
            int count = 0;
            String c = String.valueOf(i);
            for (int x = 0; x <num.length() ; x++) {
                int out = 0;
                if (num.indexOf(c,x)==-1){
                }else {
                    count++;
                    out = num.indexOf(c,x);
                    x=(out+1);
                };
            }
            System.out.println(c+"出现了"+count+"次");

        }
    }
}
