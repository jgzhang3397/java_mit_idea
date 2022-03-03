package demo05_Collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * java.util.Collections 是集合工具类，用来对集合进行操作，部分方法如下：
 *      - public static <T> boolean addAll(Collection<T> c, T... elements):往集合中添加一些元素
 *      - public static void shuffle(List<?> list) : 打乱集合顺序
 */
public class Demo01Collections {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //往集合中添加多个元素
        /*
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        */

        //public static <T> boolean addAll(Collection<T> c, T... elements):往集合中添加一些元素
        Collections.addAll(list, "a", "b", "c", "d");
        System.out.println(list);//[a, b, c, d]

        //public static void shuffle(List<?> list) : 打乱集合顺序
        Collections.shuffle(list);
        System.out.println(list);
    }
}
