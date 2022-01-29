package demo02_Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
java.util.Iterator接口：迭代器（对集合进行遍历）
    两个常用方法：
        boolean hasNext() ：判断集合中是否还有下一个元素，有返回true，没有返回false
        E next()：返回迭代的下一个元素
            取出集合中的下一个元素
        Iterator迭代器，是一个接口，无法直接使用，需要使用Iterator接口的实现类对象
        Collection接口有一个方法iterator(),其方法返回值就是迭代器实现类对象
             Iterator<E> iterator() 返回在此 collection 的元素上进行迭代的迭代器。

    迭代器的使用步骤（重点）：
        1.使用集合中的方法iterator()获取迭代器的实现类对象，使用Iterator接口接收(多态)
        2.使用Iterator接口中的方法hasNext判断是否存在下一个元素
        3.使用Iterator接口中的方法next取出集合中的下一个元素
 */
public class Demo01Iterator {

    public static void main(String[] args) {
        //创建集合对象
        Collection<String> coll = new ArrayList<>();

        //添加元素
        coll.add("lukas");
        coll.add("leno");
        coll.add("kobe");
        coll.add("james");
        coll.add("ivar");

        /*
        1.使用集合中的方法iterator()获取迭代器的实现类对象，使用Iterator接口接收(多态)
            注意：
                Iterator<E> 接口也是有泛型的，迭代器的泛型跟着集合走，集合是什么泛型，迭代器就是什么泛型
         */
        //多态    接口          实现类对象
        Iterator<String> it = coll.iterator();

        /*//2.使用Iterator接口中的方法hasNext判断是否存在下一个元素
        boolean b = it.hasNext();
        System.out.println(b);//true

        //3.使用Iterator接口中的方法next取出集合中的下一个元素
        String s = it.next();
        System.out.println(s);//lukas

        //重复。。。
        b = it.hasNext();
        System.out.println(b);
        System.out.println(it.next());//leo*/

        /*
        重复过程-->使用循环
        不知道具体循环次数 用while循环
        循环结束条件 hasNext 的返回值为false
         */
        while (it.hasNext()){
            String e = it.next();
            System.out.println(e);
        }
        System.out.println("========================");
        //for循环
        for (Iterator<String> it2 = coll.iterator(); it2.hasNext();){
            String e = it2.next();
            System.out.println(e);
        }
    }
}
