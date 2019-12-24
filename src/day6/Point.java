package day6;
/*
* 1、定义一个“点”（Point）类用来表示三维空间中的点（有三个坐标：x，y，z）。
每一个点都需要存储一份x，y，z的值,要求如下：

1）提供可以设置三个坐标的构造方法和可以设置两个坐标(x，y)（另一个坐标z默认为0）的构造方法。-- 要求使用到this
2）提供可以计算一个“点”到另外一个"点"的距离的方法。-- 要求使用到this
-- 两个点-（一个点利用this表示，另一个点用参数传入）
-- 距离计算公式-自己查询
-- 计算平方根的方法：Math.sqrt();
3）提供比较两个点是否相等的方法（利用this）
*/
public class Point {
    int x;
    int y;
    int z;

    public static void main(String[] args) {
        Point p2 = new Point(3,4);
        Point p1 = new Point(0,0);
        System.out.println("距离为"+p1.pointDistance(p2));
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        this.z = 0;
    }

    public double pointDistance(Point p){
        double distance=0;
        distance = Math.sqrt(Math.pow(x-this.x,2)+Math.pow(y-this.y,2)+Math.pow(z-this.z,2));
        return distance;
    }


    public void samePoint (Point p){
        if (p.x==this.x&&p.y==this.y&&p.z==this.z){
            System.out.println("两点相等");
        }else{
            System.out.println("两点不相等");
        }
    }
}
