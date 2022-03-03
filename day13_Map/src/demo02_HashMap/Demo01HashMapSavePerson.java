package demo02_HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    HashMap存储自定义类型的键值
    Map集合保证Key是唯一的；
        作为key的元素，必须重写hashCode方法和equals方法，以保证key唯一
 */
public class Demo01HashMapSavePerson {

    public static void main(String[] args) {
        //show01();
        show02();
    }

    /*
        HashMap存储自定义类型键值
        key:Person类型
            Person类必须重写hashCode方法和equals方法，以保证key唯一
        value:String类型
            value可以重复
     */
    private static void show02() {
        //创建HashMap集合
        HashMap<Person,String> map = new HashMap<>();
        //往集合里添加元素
        map.put(new Person("Xi",60),"China");
        map.put(new Person("Baden",75),"America");
        map.put(new Person("Merkel",78),"Germany");
        map.put(new Person("Xi",60),"TheWorld");
        //使用entrySet和增强for循环遍历Map集合
        Set<Map.Entry<Person, String>> set = map.entrySet();
        for(Map.Entry<Person,String> entry : set){
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"-->"+value);
        }
    }

    /*
        HashMap存储自定义类型键值
        key:String类型
            String类重写hashCode方法和equals方法，以保证key唯一
        value:Person类型
            value可以重复（同名同年龄的人视为同一个）
     */
    private static void show01() {
        //创建HashMap集合
        HashMap<String, Person> map = new HashMap<>();
        //往集合中添加元素
        map.put("China", new Person("Lee", 19));
        map.put("Germany",new Person("Sonja", 20));
        map.put("France",new Person("Nikos",19));
        map.put("China",new Person("Liu",19));

        //使用keySet加增强for循环遍历Map集合
        Set<String> set = map.keySet();
        for(String key : set){
            Person value = map.get(key);
            System.out.println(key+"-->"+value);
        }

    }
}
