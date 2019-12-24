package day2;
/**
 * if练习
 * 1.随机生成一个【-20到100】随机数，判断并打印其是奇数还是偶数
 * 2.随机生成一个1-7随机数，判断并打印是工作日还是周末，并打印星期几；
 * 3.随机生成三个1-6随机数，分别判断其是否为大小数，连子，豹子(3个数相同)
 * */
public class If {
    public static void main(String[] args) {
        System.out.println("=====1=====");
        int rand = (int)(Math.random()*121)-20;
        if (rand%2==0){
            System.out.println(rand+"是偶数");
        }else {
            System.out.println(rand+"是奇数");
        }
        System.out.println("=====2=====");
        int rand2 = (int)(Math.random()*7)+1;
        if (rand2<6){
            System.out.println("今天是星期"+rand2+"今天是工作日");
        }else{
            System.out.println("今天是星期"+rand2+"今天是休息日");
        }
        System.out.println("=====3=====");
        int rand3 =(int)(Math.random()*6)+1;
        int rand4 =(int)(Math.random()*6)+1;
        int rand5 =(int)(Math.random()*6)+1;

        System.out.println(rand3+","+rand4+","+rand5);

      if (rand3-2==rand5&&rand4-1==rand5){
          System.out.println(rand3+","+rand4+","+rand5+"是连数");
      }else if(rand3-2==rand4&&rand5-1==rand4){
          System.out.println(rand3+","+rand5+","+rand4+"是连数");
      }else if(rand4-2==rand5&&rand3-1==rand5){
          System.out.println(rand4+","+rand3+","+rand5+"是连数");
      }else if(rand4-2==rand3&&rand5-1==rand3){
          System.out.println(rand4+","+rand5+","+rand3+"是连数");
      }else if(rand5-2==rand3&&rand4-1==rand3){
          System.out.println(rand5+","+rand4+","+rand3+"是连数");
      }else if (rand5-2==rand4&&rand3-1==rand4){
          System.out.println(rand5+","+rand3+","+rand4+"是连数");
      }


       if (rand3<4){
           System.out.println(rand3+"是小数");
       }else {
           System.out.println(rand3+"是大数");
       }
        if (rand4<4){
            System.out.println(rand4+"是小数");
        }else {
            System.out.println(rand4+"是大数");
        }
        if (rand5<4){
            System.out.println(rand5+"是小数");
        }else {
            System.out.println(rand5+"是大数");

        }

        if (rand3==rand4&&rand4==rand5){
            System.out.println(rand3+","+rand4+","+rand5+"是豹子");
        }

//        while (rand2!=1){
//            rand2 = (int)(Math.random()*7)+1;
//            System.out.println(rand2);
//        }
    }
}
