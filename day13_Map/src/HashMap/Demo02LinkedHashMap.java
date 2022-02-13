package HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/**
 * java.util.LinkedHashMap<K,V> extends HashMap<K, V>
 *     Map接口的哈希表和链表实现，具有可预知的迭代顺序
 *     底层原理：
 *          哈希表+链表(记录元素的顺序)
 */
public class Demo02LinkedHashMap {

    public static void main(String[] args) {

        show01();//HashMap存取无序，key不能重复
        System.out.println("=============");
        show02();//LinkedHashMap存取有序，key不能重复
    }

    private static void show02() {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("a","a");
        map.put("c","c");
        map.put("b","b");
        map.put("a","d");
        System.out.println(map);//{a=d, c=c, b=b}
    }

    private static void show01() {
        HashMap<String, String> map = new HashMap<>();
        map.put("a","a");
        map.put("c","c");
        map.put("b","b");
        map.put("a","d");
        System.out.println(map);//{a=d, b=b, c=c}
    }
}
