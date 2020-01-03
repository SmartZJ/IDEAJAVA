package day12;

import java.util.Arrays;
import java.util.Scanner;


public class HomeWork {
    public static void main(String[] args) {
        test1();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符");
        test2(sc.next());

    }
    /*
 * 1、字符串基本Api
    a)创建一个String对象（"爱德华_java程序员_布鲁明顿"），把它转换为一个char数组，char数组存储String的每一个字符。
    b)创建一个StringBuilder对象，把char数组内容添加到StringBuilder对象中
    c)删除（第9-11个字符），然后插入字符串"高级攻城狮"到第9个位置
    d)再把"java"字符串替换为（"ios"），再倒序存储字符串
    e)再把字符串都转换为大写，然后输出结果字符串
 * */
    public static void test1(){
       String str = "爱德华_java程序员_布鲁明顿";
       char[] cstr = str.toCharArray();
       System.out.println(Arrays.toString(cstr));
       StringBuilder strb = new StringBuilder().append(cstr);
       System.out.println(strb);
       strb.delete(8,11);
       System.out.println(strb);
       strb.insert(8,"高级工程师");
       System.out.println(strb);
       strb.replace(4,8,"ios");
       System.out.println(strb);
       strb.reverse();
       System.out.println(strb);
       StringBuilder strb1 = new StringBuilder(strb.toString().toUpperCase());
       System.out.println(strb1);

   }
   /*
   * 2、字符串转换练习
        提示：
        1)String和StringBuilder的replace都可以进行替换，分析选择合适的api。
        2)"15"->15;字符串转对应字面值的整数，Integer类有相关功能，查询相关资料自学。
        需求：
        1个字符的替换
        a)_转换为@
        b)@转换为_
        2个字符的替换
        c)数字后面跟字母转换为该数字个字母（0不用考虑，数字只考虑一位数）
        d)如果最后一个是'_'  去掉
        例如：
        1）__am3j@t4u6_   转换为：  @@amjjj_tuuuu6
        2）_0j2a3     转换为： @0jaa3
      * */
    private static void test2(String s) {

        StringBuilder strb1 = new StringBuilder(s);
        for (int i = 0; i <strb1.length() ; i++) {
            //字符转换
            if (i<strb1.length()-1){
                if (strb1.charAt(i)=='_'){
                    strb1.replace(i,i+1,"@");
                }else if (strb1.charAt(i)=='@'){
                    strb1.replace(i,i+1,"_");
                }
                //数字字母替换
                if ((int)strb1.charAt(i)>48&&(int)strb1.charAt(i)<58){
                    if ((int)strb1.charAt(i+1)>64&&(int)strb1.charAt(i+1)<106||(int)strb1.charAt(i+1)>96&&(int)strb1.charAt(i+1)<122){
                        StringBuilder fs = new StringBuilder();
                        for (int j = 0; j <Integer.parseInt(String.valueOf(strb1.charAt(i))) ; j++) {
                            fs.append(strb1.charAt(i+1));
                            System.out.println(fs);
                        }
                        strb1.replace(i,i+2,fs.toString());
                    }
                }
            }else {
                if (strb1.charAt(i)=='_'){
                    strb1.replace(i,i+1,"");
                }
            }

        }
//        for (int i = 0; i <strb1.length()-1 ; i++) {
//            if ((int)strb1.charAt(i)>48&&(int)strb1.charAt(i)<58){
//                if ((int)strb1.charAt(i+1)>64&&(int)strb1.charAt(i+1)<106||(int)strb1.charAt(i+1)>96&&(int)strb1.charAt(i+1)<122){
//                            StringBuilder fs = new StringBuilder();
//                            for (int j = 0; j <Integer.parseInt(String.valueOf(strb1.charAt(i))) ; j++) {
//                                fs.append(strb1.charAt(i+1));
//                                System.out.println(fs);
//                            }
//                    strb1.replace(i,i+2,fs.toString());
//                }
//            }
//        }

        StringBuilder strb2 = new StringBuilder("_0j2a3");
        System.out.println(strb1);
    }
}
