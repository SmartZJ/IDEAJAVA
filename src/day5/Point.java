package day5;
/*
*6. 定义一个“点”(Point)类用来表示二维空间中的点(有两个坐标)。要求如下：
　　(1) 可以生成具有特定坐标的点对象。
　　(2)提供可以计算该“点”距另外一点距离的方法。
* */
public class Point {
    int x;
    int y;
    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }
    public void pointDistance(Point p1){
        double d = 0;
        d = Math.sqrt( Math.pow((p1.x-x),2)+ Math.pow(p1.y-y,2));
        System.out.println("两点之间的距离为"+d);
    }
}
