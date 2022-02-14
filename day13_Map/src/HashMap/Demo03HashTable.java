package HashMap;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * java.util.Hashtable<K,V>集合 implements Map<K,V>接口
 *
 * Hashtable ：底层也是一个哈希表，是一个线程安全的集合，是单线程集合，速度慢
 * HashMap: 底层是一个哈希表，是一个线程不安全的集合，是多线程的集合，速度快
 *
 * HashMap集合：可以存储null值，null值
 * Hashtable集合：不可以存储null值，null值
 *
 * Hashtable和Vector集合一样，在jdk1.2版本后被更先进的集合(HashMap,ArrayList)取代了
 * Hashtable的子类Properties 依然活跃在历史的舞台
 * Properties集合是一个唯一和IO流相结合的集合
 */
public class Demo03HashTable {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put(null,"a");
        map.put("b",null);
        map.put(null,null);//null与第一个key null 重合 取代
        System.out.println(map);//{null=null, b=null}

        Hashtable<String,String> table = new Hashtable<>();
        /*table.put(null,"a");//NullPointerException
        table.put("b",null);//NullPointerException
        table.put(null,null);//NullPointerException*/
    }
}
