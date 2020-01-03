package day11;

/*
* （A）利用throws throw 和自定义异常解决如下1，2，3需求，分别测试他们出现异常和不出现异常的情况。

    1）定义方法产生指定范围（最小值，最大值）随机整数 int random(int min,int max)throws ParamValueException{//....}
    参数：min范围的最小值，max 范围的最大值
    返回值：所得随机数
    异常处理：最小值比最大值大的时候，抛出自定义异常。

    2）定义两个数求和方法 int sum(int a,int b) throws ValueOutOfRangeException{//...};
    参数：a和b为两个加数
    返回值：所得和
    异常处理：要求在方法内部处理，a，b值加起来越界问题，抛出自定义异常。

    3）定义public static String subString(String str , int starIndex , int endIndex)
    throws StringIndexOutOfBoundsException;方法
    参数：str原字符串，starIndex 新字符串开始下标，endIndex新字符串结束下标
    返回值：所得新字符串
    需求：
    a）方法内部用 String类charAt，length方法，以及循环，字符串拼接+实现。
    b）实现把str内容的startIndex下标（包含）到endindex下标（不包含）所有字符内容拼接成字符串然后返回给方法调用处。
    c）如果startIndex小于0抛出异常StringIndexOutOfBoundsException类的对象并设置异常信息“startIndex-小于0，下标越界”。
    d）如果endIndex小于0抛出异常StringIndexOutOfBoundsException类的对象并设置异常信息“endIndex-小于0，下标越界”。
    e）如果startIndex-大于length-1抛出异常StringIndexOutOfBoundsException类的对象并设置异常信息“startIndex-大于length-1，下标越界”。
    f）如果endIndex-大于length-1抛出异常StringIndexOutOfBoundsException类的对象并设置异常信息“endIndex-大于length-1，下标越界”。
* */
public class TestException2 {
    public static void main(String[] args) throws ParamValueException {
//      random(50,30);
//        sum(201000000,1000000000);
        System.out.println( subString("123456789",0,5));


    }
    public static int random(int min,int max)throws ParamValueException{
        if (min>max){
            throw new ParamValueException("最小值："+min+"最大值："+max+"最小值大于最大值");
        }
        return (int)(Math.random()*(max-min+1)+min);
    }
    public static int sum(int a,int b) {
            try {
                if (a+b<-Math.pow(2,31)||a+b>Math.pow(2,31)-1){
                throw new ValueOutOfRangeException("超出范围");
                }
            } catch (ValueOutOfRangeException e) {
                e.printStackTrace();
            }
        return a+b;
    }
    public static String subString(String str , int starIndex , int endIndex) throws StringIndexOutOfBoundsException{
        String nstr ="";
        if (starIndex<0){
            throw new StringIndexOutOfBoundsException("startIndex-小于0，下标越界");
        }
        if (endIndex<0){
            throw new StringIndexOutOfBoundsException("endIndex-小于0，下标越界");
        }
        if (starIndex>str.length()-1){
            throw new StringIndexOutOfBoundsException("startIndex-大于length-1，下标越界");
        }
        if (endIndex>str.length()-1){
            throw new StringIndexOutOfBoundsException("endIndex-大于length-1，下标越界");
        }
        for (int i = 0; i <str.length() ; i++) {
            if (i>=starIndex&&i<endIndex){
                nstr+=str.charAt(i);
            }
        }
        return nstr;
    }

}
