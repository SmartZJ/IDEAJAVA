package day4;

import java.util.Scanner;

/*
* 输出n到999999之间的所有水仙花数（n由用户输入，并且要大于100小于1000）
   所谓的水仙花数是指：各个位数上的数字的位数次方和等于该数本身。

    例如：三位数中	  153 = 1^3 + 5^3 + 3^3;

            四位数中：1634 = 1^4 + 6^4 + 3^4 + 4^4;
	                 8208 = 8^4 + 2^4 + 0^4 + 8^4
* */
public class SNumber {
    public static void main(String[] args) {
        int digit = 0, sum = 0,s = 0;
        //new SNumber对象
        SNumber sn = new SNumber();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个 小于1000000的数字");
        for ( s=sc.nextInt() ;s<1000000;s++){
            //获得位数
           digit=sn.getDigit(s);
            //获得每位 的 位数次方和
            sum=sn.getSum(s,digit);
            //判断是否为水仙花数
           sn.isNarcissisticNumber(s,sum);
        }

        System.out.println("=========回文数===========");
        String snum;

        for (int i = sc.nextInt(); i <1000000 ; i++) {
            digit =sn.getDigit(i);
            snum = sn.getString(i,digit);
            if (snum.equals(i+"")){
                System.out.println(i+"是回文数");
            }

        }
    }

















    //获取位数
    public int getDigit(int num){
        int digit=0;
        while (num != 0) {
            num/= 10 ;
            digit++;
        }
        return digit;
    }
    //获得每位 的 位数次方和
    public int getSum(int num,int digit){
        int sum = 0;
        for (int i = 0; i < digit; i++) {
            sum += Math.pow(num % 10, digit);
            num = num / 10;
        }
        return sum;
    }
    //判断是否为水仙花数
    public void isNarcissisticNumber(int s,int sum){
        if (sum == s) {
            System.out.println(s+"是水仙花数");
        }
    }
    //
    public String getString(int n,int digit){
//        System.out.println("传入的参数"+n+digit);
        String sum="";
        for (int i = 0; i <digit ; i++) {
            int j = n%10;
             n/=10;
             sum+=j;
        }
        return sum;
    }






    public void sNum(){
        String sNum;
        int fNum,sum=0;
//            //获取值
        for (int x = 0;x<1000000;x++){
            fNum = x;
            //转为字符串
            sNum = String.valueOf(fNum);
            //获取 计算每位数的次方的和
            int digit = sNum.length();
//                System.out.println("位数"+digit);
            for (int i = 0;i<digit;i++){
                sum+= Math.pow(Integer.parseInt(String.valueOf(sNum.charAt(i))),digit);
//                    System.out.println("第"+i+"位的"+digit+"次方"+"="+Math.pow(Integer.parseInt(String.valueOf(sNum.charAt(i))),digit));
//                    System.out.println("sum="+sum);
            }
            //数值判断
            if (fNum==sum){
                System.out.println(fNum+"这是水仙花数");

            }else {
//                    System.out.println("这不是水仙花数");
            }
            sum = 0;
        }

    }

}
