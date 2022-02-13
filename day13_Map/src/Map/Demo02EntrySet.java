package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Map集合遍历的第二种方式：使用Entry对象集合
 *      Map集合中的方法：
 *          Set<Map.Entry<K,V>> entrySet() 返回此映射中包含的映射关系的Set视图
 *
 *      实现步骤：
 *          1. 使用Map集合中的方法entrySet()， 把Map集合中的多个Entry对象取出来，存储到一个Set集合中
 *          2. 遍历Set集合，获取每一个Entry对象
 *          3. 使用Entry对象中的方法getKey()和getValue()获取键和值
 *
 */
public class Demo02EntrySet {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("leo", 175);
        map.put("anna", 165);
        map.put("snowy", 25);

        //1. 使用Map集合中的方法entrySet()， 把Map集合中的多个Entry对象取出来，存储到一个Set集合中
        Set<Map.Entry<String, Integer>> set = map.entrySet();

        //2. 遍历Set集合，获取每一个Entry对象
        //使用迭代器遍历set集合
        Iterator<Map.Entry<String, Integer>> it = set.iterator();
        while (it.hasNext()){
            Map.Entry<String, Integer> entry = it.next();

            //3. 使用Entry对象中的方法getKey()和getValue()获取键和值
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "=" + value);
        }

        System.out.println("=====================");
        //使用增强for循环遍历set集合
        for (Map.Entry<String, Integer> entry : set){
            //3. 使用Entry对象中的方法getKey()和getValue()获取键和值
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "=" + value);
        }

    }
}
