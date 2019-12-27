package day9.homework;
/*
* 1.老曾去参加青年歌手大奖赛,有10个评委随机打分（0-10）,(去掉一个最高一个最低)求平均分?
    要求：打印去掉的评委分数
    打印：
    评委1	评委2 ... 评委10  平均分
     5    	 7  	     3      5
  2.封装一个方法 public static int search(int[]arr,int num)
    查询传入数组是否包含参数，如果有，返回下标，如果没有，返回-1
* */
public class ArrayPractice {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        scoring();
        System.out.println("返还值为："+search(arr,8));

    }

    public static void scoring(){
        int[] arr = new int[10];
        int temp = 0;
        //打分
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = getRand();
            System.out.println("评委"+(i+1)+":"+arr[i]);
        }
        //排序
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length-1 ; j++) {
                if (arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        //去头去尾
        int sum = 0;
        for (int i = 0; i <arr.length ; i++) {
            if (i!=0||i!=arr.length){
                sum+=arr[i];
            }
        }
        //返回平均值
        System.out.println("平均分："+sum/8);
    }
    //获取分数
    public static int getRand(){
        return (int)(Math.random()*9);
    }



    public static int search(int[]arr,int num){
        int reply = 0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==num){
                reply = i;
                break;
            }else {
                reply = -1;
            }
        }

        return reply;
    }
}
