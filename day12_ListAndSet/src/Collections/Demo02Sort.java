package Collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * - java.util.Collections 是集合工具类，用来对集合进行操作，部分方法如下：
 *      - public static <T> void sort(List<T> list):将集合中的元素按照默认规则排序，就是升序
 *      注释：静态方法可以直接工具类名.方法调用
 *
 *      注意事项：
 *          sort (List<T> list):
 *          被排序的集合里面存储的元素，必须实现Comparable，重写接口中的方法compareTo定义排序的规则
 *      Comparable 接口的排序规则：
 *          自己(this) - 参数：升序
 */
public class Demo02Sort {

    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        Collections.addAll(list01, 1,3,2);

        //public static <T> void sort(List<T> list):将集合中的元素按照默认规则排序，就是升序
        System.out.println(list01);//[1, 3, 2]
        Collections.sort(list01);
        System.out.println(list01);//[1, 2, 3]

        ArrayList<String> list02 = new ArrayList<>();
        Collections.addAll(list02, "a","c","b");

        System.out.println(list02);//[a, c, b]
        Collections.sort(list02);
        System.out.println(list02);//[a, b, c]

        ArrayList<Person> list03 = new ArrayList<>();
        list03.add(new Person("leo", 18));
        list03.add(new Person("anna",20));
        list03.add(new Person("Zara", 12));
        System.out.println(list03);//[Person{name='leo', age=18}, Person{name='anna', age=20}, Person{name='Zara', age=12}]

        Collections.sort(list03);
        System.out.println(list03);
    }
}
