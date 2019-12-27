package day10;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
//        doubleArray();
//        doubleArray1();
        printSan(6);
        printSan2(6);
    }


    /*
* 1. 源数组   {
    {1, 2, 3, 4},
    {5, 6, 7, 8},
    {9,10,11,12},
    {13,14,15,16}}
    1. 分别求两条对角线的和-》提示找规律
    2. 逆序输出-》从16依次打印到1
* */
    public static void doubleArray(){
        int[][] dArr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int sum = 0,sum2 = 0;
        //对角线1
        for (int i = 0; i <dArr.length ; i++) {
            sum+=dArr[i][i];
        }
        //对角线2
        for (int i = 0; i <dArr.length ; i++) {
            sum2+=dArr[i][dArr.length-1-i];
        }
        System.out.println("左上到右下的对角线和为"+sum);
        System.out.println("右上到左下的对角线和为"+sum2);

        //逆序输出
        for (int i = dArr.length-1; i >=0 ; i--) {
            for (int j = dArr[i].length-1; j >=0 ; j--) {

            }
        }
        Arrays.toString(dArr);
    }
    /*
    * 2、 定义一个20*4的二维数组，用来存储某班级20位学生的4阶段的成绩（每一个学生作为行，每一个科目作为列）：这4阶段按存储依次为：初级，中级，高级，就业
            (1)循环给二维数组的每一个元素赋0到100之间的随机整数。
            (2)按照列表的方式输出这些学员的每门课程的成绩。
            格式：
                初级	中级	高级	就业
            同学1：	11	22	33	44
            同学2：	11	22	33	44
            同学3：	11	22	33	44
            ...
            (3)要求编写程序求每个学生的总分，将其保留在另外一个一维数组中,并打印所有的学生总分。
            提示：每一个学生对应一个总分。
    * */
    public static void doubleArray1(){
        int[][] dArr = new int[20][4];
        //表头打印
        System.out.println("\t\t初级"+"\t\t中级"+"\t\t高级"+"\t\t就业");
        for (int i = 0; i <dArr.length ; i++) {
            //行头
            System.out.print("同学"+(i+1)+":");
            for (int j = 0; j <dArr[i].length ; j++) {
                dArr[i][j]=getRand();
                System.out.print("\t"+dArr[i][j]+"\t\t");
            }
            //换行
            System.out.println();
        }

    }
    public static int getRand(){
        return (int)(Math.random()*99+1);
    }
/*
* 3.封装一个方法，public static void printSan()
    用户输三角形的高
    随机传入参数0-9
    打印
              [9]
           [8,  , 3]
        [2,  ,  ,  , 4]
     [3,  ,  ,  ,  ,  , 8]
* */
    public static void printSan(int num){
        int[][]arr = new int[num][];
        for (int i = 0; i <num ; i++) {
            arr[i]=new int[i+1];
            for (int j = 0; j <i+1 ; j++) {
                arr[i][j]=getRand2();
            }
        }
        for (int i = 0; i <num ; i++) {
            for (int j = 0; j <1.5*(num-i) ; j++) {
                System.out.print(" ");
            }
//            for (int j = 0; j <i+1 ; j++) {
//                if (i==0&&j==0){
//                    System.out.print(" ["+arr[i][j]+"]");
//                }else if (j==0){
//                    System.out.print(" ["+arr[i][j]);
//                }else if (j==i){
//                    System.out.print(" "+arr[i][j]+"]");
//                }else {
//                    System.out.print(" "+arr[i][j]);
//                }
//            }
            System.out.println(Arrays.toString(arr[i]));
//            System.out.println();
        }
    }

    public static void printSan2(int num){
        int[][]arr = new int[num][];
        for (int i = 0; i <num ; i++) {
            arr[i]=new int[i+1];
            for (int j = 0; j <i+1 ; j++) {
                arr[i][j]=getRand2();
            }
        }
        for (int i = 0; i <num ; i++) {
            for (int j = 0; j <1.5*(num-i) ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <i+1 ; j++) {
                if (i==0&&j==0){
                    System.out.print(" ["+arr[i][j]+"]");
                }else if (j==0){
                    System.out.print(" ["+arr[i][j]+"");
                }else if (j==i){
                    System.out.print(" "+arr[i][j]+"]");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }


    public static int getRand2(){
        return (int)(Math.random()*10);
    }


}
