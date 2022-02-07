package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * java.util.List接口 extends Collection接口
 * List接口的特点：
 *      1.有序的集合，存储元素和取出元素的顺序是一致的(存储123，取出123)
 *      2.有索引，包含了一些带索引的方法
 *      3.允许存储重复的元素
 *
*  List接口中带索引特有的方法
 *      public void	add(int index, E element): 将指定的元素，添加到该集合中的指定位置
 *      public E	get(int index)：返回集合中指定位置的元素
 *      public E	remove(int index)：移除列表中指定位置的元素，返回的是被移除的元素
 *      public E	set(int index, E element)：用指定元素替换集合中指定位置的元素，返回值是替换前的元素
 *
 * 注意事项：
 *      操作索引是，一定要防止索引越界异常
 */
public class Demo01List {

    public static void main(String[] args) {
        //创建一个List集合对象，多态
        List<String> list = new ArrayList<>();
        //使用add方法添加元素
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        //打印集合
        System.out.println(list);//[a, b, c, d], 不是地址，重写了toString方法

        //public void	add(int index, E element)
        list.add(4, "e");
        System.out.println(list);

        //public E	remove(int index)
        String removeE = list.remove(2);
        System.out.println("removeE: "+ removeE);
        System.out.println(list);

        //public E	set(int index, E element)
        String setE = list.set(2, "D");
        System.out.println("setE: "+ setE);
        System.out.println(list);

        //List集合遍历的3种方式
        //1. 使用普通的for循环
        for (int i = 0; i < list.size(); i++) {
            //public E	get(int index)
            String s = list.get(i);
            System.out.println(s);
        }
        System.out.println("=================");

        //2. 使用迭代器进行遍历
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }
        System.out.println("==================");

        //3. 增强for循环
        for (String s : list) {
            System.out.println(s);
        }

        //IndexOutOfBoundsException
//        String s = list.get(4);
//        System.out.println(s);

    }
}
