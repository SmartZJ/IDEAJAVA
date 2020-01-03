package day13;

import day13.util.InputUtil;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    1、时间api练习
        a）date和dateformat练习

        1）用户输入一个格式为2015-04_06格式的字符串String时间
        通过DateFormat把其转换为时间类型Date（遇到ParseException异常，
        需要循环让用户输入字符串时间，直到输入正确格式的时间-循环结束）

        2）并把其（时分秒）设置为当前系统时间的（时分秒），并打印输出
 */
public class DateTest {
    public static void main(String[] args) {
        test();
    }

    private static void test() {
        DateFormat sdate = new SimpleDateFormat("yyyy-MM_dd H:m:s");
        Date date = new Date();
        String input = InputUtil.getInputString("以yyyy-MM_dd的格式输入日期")+" "+date.getHours()+":"+date.getMinutes()+":"+date.getSeconds();
        while (true){
            try {
                Date day = sdate.parse(input);
                System.out.println(day);

                break;
            } catch (ParseException e) {
                System.out.println(input);
                input=InputUtil.getInputString("格式错误请重新输入")+" "+date.getHours()+":"+date.getMinutes()+":"+date.getSeconds();
            }
        }


    }

}
