package day5;
/*
* 5.图形 Draw 类
属性：星号的个数（count） 、行数（lines）
方法：输出直角三角形(drawTrian()) 、 输出矩形(drawRec()) 及平行四边形(drawPra())
测试方法
* */
public class Draw {
    int count;
    int lines;
    public Draw(int count,int lines){
        this.count = count;
        this.lines = lines;

    }
    //输出直角三角形
    public void drawTrian(){
        int dcount = 0;
        for (int y = 1;y <= lines;y++){
            for (int x = 1;x < 2*y;x++){
                if (dcount<=count){
                    System.out.print("*");
                    dcount++;
                    }
            }
            System.out.println();
        }
    }
    //输出矩形
    public void drawRec(){
        int dcount = 0;
        for (int i = 0; i <lines ; i++) {
            for (int j = 0; j <4 ; j++) {
                    if (dcount<=count){
                    System.out.print("*");
                    dcount++;
                    }
            }
            System.out.println();
        }
    }
    //输出平行四边形
    public void draPra(){
        int dcount = 0;
        for (int i = 0; i <lines ; i++) {


            for (int x=1;x<i;x++){
                    System.out.print(" ");
            }
            for (int j = 0; j <4 ; j++) {
                if (dcount<=count){
                    System.out.print("*");
                    dcount++;
                }
            }
            System.out.println();
        }
    }
}
