package week2;

import week2.util.InputUtil;

import java.util.Arrays;

public class DoubleChromosphere {
    public static void main(String[] args) {
        int input = 0;
        boolean flag = true;
        //选择界面
        System.out.println("*****欢迎进入双色球彩票*****");
        System.out.println("1.购买彩票\n2.查看开奖\n3.退出");
        System.out.println("***************************");
        //选择判定
        while (flag){
            input = InputUtil.getInput();
            switch (input){
                case 1:
                    //买彩票
                    System.out.println("功能1");
                    break;
                case 2:
                    //查看开奖
                    System.out.println("功能2");
                    getWinningNumber();
                    break;
                case 3:
                    flag = false;
                    System.out.println("退出");
                    break;
                default:
                    System.out.println("无效指令请重新输入");
                    break;
            }
        }

    }


    //获取红球
    public static int getRedBall(){
        return (int)(Math.random()*33+1);
    }
    //获取篮球
    public static int getBlueBall(){
        return (int)(Math.random()*16+1);
    }
    //中奖号  注意消重
    public static int getWinningNumber(){
        int[] arr = new int[7];
        for (int i = 0; i <arr.length ; i++) {
            if (i<5){
                arr[i]=getRedBall();
            }else {
                arr[i]=getBlueBall();
            }
        }
        System.out.println(Arrays.toString(arr));
        return 0;
    }

}
