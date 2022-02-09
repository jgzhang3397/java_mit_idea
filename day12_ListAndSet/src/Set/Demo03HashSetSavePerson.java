package Set;

import java.util.HashSet;

/**
 * HashSet存储自定义类型元素
 *      set集合保存元素唯一：
 *          存储的元素(String, Integer, ....Student, Person...), 必须重写hashCode方法和equals方法
 *
 *      要求：
 *          同名同年龄的人，视为同一人，只能存储一次
 */
public class Demo03HashSetSavePerson {

    public static void main(String[] args) {
        //创建一个HashSet集合存储Person
        HashSet<Person> set = new HashSet<>();
        Person p1 = new Person("Anna", 19);
        Person p2 = new Person("Anna",20);
        Person p3 = new Person("Anna", 19);
        // '|..' 表示重写后
        System.out.println(p1.hashCode());//2109957412 | 63415572
        System.out.println(p3.hashCode());//901506536 | 63415572
        System.out.println(p1==p3);//false,比较两个元素的地址值 | false
        System.out.println(p1.equals(p3));//false  | true
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);
    }
}
