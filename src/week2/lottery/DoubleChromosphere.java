package week2.lottery;

import week2.util.InputUtil;

public class DoubleChromosphere {
    public static void main(String[] args) {
        //购买的彩票
        Ticket[] tickets = null;
        //中奖号
        Ticket winTicket = null;
        int input = 0;
        boolean flag = true;
        while (flag){
        //选择界面
        System.out.println("*****欢迎光临彩票中心*****");
        System.out.println("1.购买彩票\n2.查看开奖\n3.退出");
        System.out.println("***************************");
        //选择判定
            input = InputUtil.getInput();
            switch (input){
                case 1:
                    //买彩票
                    buy();

                    break;
                case 2:
                    //查看开奖
                    if (tickets==null){
                        System.out.println("没有购买彩票，请购买彩票");
                        break;
                    }else {
                        System.out.println("功能2");
                        //获取中奖号码

                        //获取购买彩票

                        //号码对比

                        //打印输出
                        break;
                    }

                case 3:
                    flag = false;
                    System.out.println("欢迎下次光临再见！");
                    break;

                default:
                    System.out.println("选择错误 请重新选择");
                    break;
            }
        }

    }

    private static void buy() {
        System.out.println("是否随机购买？N/Y");
        
    }


}
