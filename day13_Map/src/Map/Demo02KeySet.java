package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Map集合的第一张遍历方式，通过键找值的方式
 *      Map集合中的方法：
 *          Set<K> keySet() 返回此映射中包含的键的Set视图
 *      实现步骤：
 *          1.使用Map集合中的方法keySet(), 把Map集合所有的Key取出来，存储到一个Set集合中
 *          2.遍历Set集合，获取Map集合中的每一个key
 *          3.通过Map集合中的方法get(key), 通过key 找到 value
 */
public class Demo02KeySet {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("leo", 175);
        map.put("anna", 165);
        map.put("snowy", 25);

        //1.使用Map集合中的方法keySet(), 把Map集合所有的Key取出来，存储到一个Set集合中
        Set<String> set = map.keySet();

        //2.遍历Set集合，获取Map集合中的每一个key
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String key = iterator.next();

            //3.通过Map集合中的方法get(key), 通过key 找到 value
            Integer value = map.get(key);
            System.out.println(key + "=" + value);
        }

        System.out.println("==================");
        //使用增强for遍历Set集合
        for (String key : set/*map.keySet()*/){
            //3.通过Map集合中的方法get(key), 通过key 找到 value
            Integer value = map.get(key);
            System.out.println(key + "=" + value);
        }
    }
}
