package day9.homework;

import java.util.Arrays;

public class HomeWorkTest {
    public static void main(String[] args) {
        arrayPractice();
        arrayPractice1();
        arrayPractice2();
        arrayPractice3();
    }
    public static  void arrayPractice(){
        Object[] arr = new Object[10] ;
        //填入对象
        for (int i = 0; i <10 ; i++) {
            if (i<5){
                arr[i]= new Person("工具人"+(i+1)+"号",i+15);
            }else {
                arr[i]= new Cat("工具猫"+(i-4)+"号","颜色"+(i-5));
            }
        }
        //遍历输出
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i].toString());
        }
    }
    public static  void arrayPractice1(){
        int[] arr ={11,22,33,44,44,55,66,66};
        int evenNumber = 0;
        int oddNumber = 0;
        //遍历数组判断奇数和偶数
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]%2==0){
                evenNumber++;
            }else {
                oddNumber++;
            }
        }
        System.out.println("奇数有:"+oddNumber+"个\t偶数有:"+evenNumber+"个");
    }

    public static  void arrayPractice2(){
        int[] arr ={22,11,33,66,66};
        int sum = 0;
        int temp = 0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
        }
        //数组排序后数组头尾即是最大和最小
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if (arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("数组和为"+sum+"\t最大值为："+arr[4]+"\t最小值为："+arr[0]);
    }

    public static  void arrayPractice3(){
        int[] oldArr={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
        int count = 0;
        for (int i = 0; i <oldArr.length ; i++) {
            if (oldArr[i]!=0){
                count++;
            }
        }
        int[] newArr = new int[count];
        for (int i = 0,j=0; i <oldArr.length ; i++) {
            if (oldArr[i]!=0){
                newArr[j]=oldArr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(newArr));

    }

}
