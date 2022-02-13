package Map;

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.Map<k,v>集合
 * Map集合的特点：
 *  1.Map集合是一个双列集合，一个元素包含两个值(一个key,一个value)
 *  2.Map集合中的元素，key和value的数据类型可以相同，也可以不同
 *  3.Map集合中的元素，key是不允许重复的，value是可以允许重复的
 *  4.Map集合中的元素，key和value是一一对应的
 *
 * java.util.HashMap<k,v>集合 implements Map<k,v>接口
 * HashMap集合的特点：
 *      1.HashMap集合底层是哈希表：查询速度特别快
 *              1. jdk1.8版本前：哈希表 = 数组 + 链表
 *              2. jdk1.8版本后：哈希表 = 数组 + 链表
 *                          如果链表的长度超过了8位，就是：
 *                          哈希表 = 数组 + 红黑树（提高查询速度）
 *      2.HashMap集合是一个无序的集合，存储元素和取出元素的顺序有可能不一样
 *
 * java.util.LinkedHashMap<k,v>集合 implements Map<k,v>接口
 * LinkedHashMap的特点：
 *      1. LinkedHashMap集合底层是哈希表+链表(保证迭代的顺序)
 *      2. LinkedHashMap集合是一个有序的集合，存储元素和取出元素的顺序是一致的
 *
 */
public class Demo01Map {

    public static void main(String[] args) {
        //show01();
        //show02();
        //show03();
        show04();
    }

    /*
        boolean containsKey(Object key): 判断集合是否包含指定的键
            包含返回true
            不包含返回false
     */
    private static void show04() {
        Map<String, Integer> map = new HashMap<>();
        map.put("leo", 175);
        map.put("anna", 165);
        map.put("snowy", 25);

        boolean leo = map.containsKey("leo");
        System.out.println(leo);//true

        boolean leno = map.containsKey("leno");
        System.out.println(leno);//false
    }

    /*
        public V get(Object key): 根据指定的键，在Map集合中获取对应的值
            返回值：
                key存在，V返回对应的value的值
                key不存在，V返回null
     */
    private static void show03() {
        Map<String, Integer> map = new HashMap<>();
        map.put("leo", 175);
        map.put("anna", 165);
        map.put("snowy", 25);

        Integer leo = map.get("leo");
        System.out.println("leo: "+ leo);//leo: 175

        Integer leon = map.get("leon");
        System.out.println("leon: "+ leon);//leon: null
    }

    /*
        public V remove(Object key): 把指定的键值对元素 在Map集合中删去，返回被删除元素的值
            返回值：V
                key存在，V返回被删除的值
                key不存在，V返回null
     */
    private static void show02() {
        //创建Map集合对象
        Map<String, Integer> map = new HashMap<>();
        map.put("leo", 175);
        map.put("anna", 165);
        map.put("snowy", 25);
        System.out.println(map);//{leo=175, anna=165, snowy=25}

        Integer v1 = map.remove("leo");
        System.out.println("v1:" + v1);//v1:175
        System.out.println(map);//{anna=165, snowy=25}

        Integer v2 = map.remove("leon");
        System.out.println("v2:" + v2);//v2:null
        System.out.println(map);//{anna=165, snowy=25}


    }

    /*
        public V put(K key, V value): 把指定的键与指定的值添加到Map集合中
            返回值：V
                存储键值对时，key不重复，返回值V是null
                存储键值对时，key重复，会使用新的value替换map中重复的value，返回被替换的value的值

     */
    private static void show01() {
        //创建Map集合对象，多态
        Map<String, String > map = new HashMap<>();

        String v1 = map.put("leo", "snowy1");
        System.out.println("v1: "+v1);//null

        String v2 = map.put("leo", "snowy2");
        System.out.println("v2: "+v2);//snowy1

        System.out.println(map);//{leo=snowy2}

        map.put("lukas", "snowy");
        map.put("anna","snowy");
        map.put("luna","dio");
        System.out.println(map);

    }
}
