package week2.lottery;

public class Ticket {
    private int[] redball;
    private int blueball;
    public Ticket() { }

    public int[] getRedball() {
        return redball;
    }

    public void setRedball(int[] redball) {
        this.redball = redball;
    }

    public int getBlueball() {
        return blueball;
    }

    public void setBlueball(int blueball) {
        this.blueball = blueball;
    }


    //测试区
    public static void main(String[] args) {

    }




    //获取随机红球
    public void getRandomNum(){
        int[] rb = new int[6];
        //遍历赋值
        for (int i = 0; i <rb.length ; i++) {
            boolean flag = true;
            int r = produceRedBall();
            //查重
            for (int j:rb) {
                if (j==r){
                    flag = false;
                }
            }
            //如果重复重新赋值
            if (flag){
                rb[i]=r;
            }else {
                i--;
            }
        }
        redball = rb;
    }
    public int produceRedBall(){
        return (int)(Math.random()*33+1);
    }
    //随机获取蓝球
    public int[] produceBlueBall(){
        int[] b = {(int)(Math.random()*16+1)};
        return b ;
    }

}
