package day2;

public class Random {
    public static void main(String[] args) {
        // 公式(int)(Math.random()*(max-min+1))+min
        //取[0,100]  [20,80]
        int rand = (int)(Math.random()*100+1);
        while (true){
            rand = (int)(Math.random()*61)+20;
            System.out.println(rand);
        }
    }
}
