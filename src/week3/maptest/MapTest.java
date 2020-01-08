package week3.maptest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*

        名字               年龄        地址             工资

      张三丰             18            春熙路,      6000
      赵云               19            天府广场    8000
      张辽               20           布鲁明顿    9000
      张飞               20            布鲁明顿    9000

2、创建perosn对象表示上述的（ 名字     年龄   地址）数据，并添加到map中存储
   （key用person对象，value用（工资））

3、a）把map容器对象中键为（赵云       19     天府广场）的值【工资】增加5000元。
   b）把键为（  张辽   20  布鲁明顿）的键值对删除，
   再检查是否有（  张辽   20  布鲁明顿）这个键的键值对是否存在
4、两种方式打印map中所有人的【名字】和【工资】
5、一种方式求出map中所有人的【平均工资】
* */
public class MapTest {
    public static void main(String[] args) {
        HashMap<Person,Integer> map = new HashMap<>();
        Person zy = new Person("赵云",19,"天府广场");
        Person zl = new Person("张辽",20,"布鲁明顿");
        map.put(new Person("张三丰",18,"春熙路"),6000);
        map.put(zy,8000);
        map.put(zl,9000);
        map.put(new Person("张飞",20,"布鲁明顿"),9000);
        System.out.println(map);
        map.put(zy,map.get(zy)+5000);
        map.remove(zl);
        Set<Person> set = map.keySet();
        Iterator<Person> it = set.iterator();
        int sum = 0,count = 0;
        while(it.hasNext()){
            Person i = it.next();
            System.out.println("key："+i+" value:"+map.get(i));
            sum+=map.get(i);
            count++;
        }

        Set<Map.Entry<Person,Integer>> set2 = map.entrySet();
        Iterator<Map.Entry<Person,Integer>> it2 = set2.iterator();

        while(it2.hasNext()) {
            Map.Entry<Person,Integer> entry = it2.next();
            System.out.println(entry);
//            System.out.println("key："+entry.getKey()+" value:"+entry.getValue());
        }

        System.out.println("平均值为:"+sum/count);
    }

}
