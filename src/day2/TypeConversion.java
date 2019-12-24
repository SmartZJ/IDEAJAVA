package day2;
/*
* 1、类型转换
a)定义byte 类型变量 b1值为112，把b1的值赋值给新的long类型变量 n1，把变量n1的值赋值给int类型变量 i1，打印相关变量。
b)定义 int 类型变量i2值为97，把i2的值对应的字符赋值给char变量c2，打印出c2对应的字符值和整数值。
c)定义char类型变量ch1,ch2,ch3，分别存储('Y','e','s')三个字符，把三个字符连接起来打印为Yes。
d)定义小数float变量price存储商品围巾单价为95.85元，小明买了3条，付款的时候进行优惠，自动把总价的小数部分抹掉，打印出：你需要支付xxx元。
e)给定一个任意的大写字母A~Z，转换为小写字母
* */
public class TypeConversion {
    public static void main(String[] args) {
        System.out.println("=====a=====");
        byte b1 = 112;
        long n1;
        int i1;
        n1=b1;
        i1=(int)n1;
        System.out.println(b1);
        System.out.println(n1);
        System.out.println(i1);

        System.out.println("=====b=====");
        int i2 = 97;
        char c2;
        c2 = (char)i2;
        System.out.println((int)c2);
        System.out.println(c2);
        System.out.println("=====c=====");
        char ch1 ,ch2 ,ch3 ;
        ch1 = 'Y';
        ch2 = 'e';
        ch3 = 's';
        System.out.println(""+ch1+ch2+ch3);
        System.out.println("=====d=====");
        float price = 95.85f;
        System.out.println("你需要支付："+(int)(price*3));
        System.out.println("=====e=====");
        char word ;
        word = 'A';
        System.out.println((char)(word+32));
    }
}
