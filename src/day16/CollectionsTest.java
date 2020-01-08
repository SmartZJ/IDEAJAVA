package day16;

import java.util.*;

/**
 赛车比赛，10辆车比赛3次，每次的前5名得分分别是10,9,8,7,6，剩下车辆得分3，
 打印3次比赛之后得分前5的车辆，以名次-车辆存入集合
 */
public class CollectionsTest {
    public static void main(String[] args) {
        //新建比赛对象
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < 10 ; i++) {
            cars.add(new Car("car"+(i+1)));
        }
        //比赛
        for (int i = 0; i <3 ; i++) {
            Collections.shuffle(cars);
            for (int j = 0; j <10 ; j++) {
                if (j<5){
                    cars.get(j).setScore(10-j);
                    System.out.println("第"+(j+1)+"名\t"+cars.get(j).getName());
                }else {
                    cars.get(j).setScore(3);
                }
            }
            System.out.println("=====第"+(i+1)+"次比赛=====\n");
        }
        //排序
        Collections.sort(cars);
        HashMap<String,Car> map = new HashMap<>();
        for (int i = 1; i <6 ; i++) {
            map.put("第"+i+"名",cars.get(i-1));
        }
        Set<String> set = map.keySet();
        for (String s:set) {
            System.out.println("名次："+s+"\t分数："+map.get(s));
        }

    }


}
