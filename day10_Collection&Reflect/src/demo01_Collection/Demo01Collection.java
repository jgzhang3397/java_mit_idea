package demo01_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * java.util.Collection接口
 *  所有单列集合的最顶层接口，里面定义了所有单列集合共性的方法
 *  任意的单列集合都可以使用Collection接口中的方法
 *
 *  共性的方法：
 *      public boolean add(E e): 把给定的对象添加到当前集合中
 *      public void clear():    清空集合中的所有元素
 *      public boolean remove(E e):把给定的对象在当前集合中删除
 *      public boolean contains(E e):判断当前集合中是否包含给定的对象
 *      public boolean isEmpty():判断当前集合是否为空
 *      public int size():返回集合中元素的个数
 *      public Object[] toArray():把集合中的元素，存储到数组中
 */
public class Demo01Collection {

    public static void main(String[] args) {
        //创建集合对象，使用多态
//        Collection<String> coll = new ArrayList<>();//多态：接口指向实现类
        Collection<String> coll = new HashSet<>();
        System.out.println(coll);//重写了toString方法 []

        /*
        public boolean add(E e): 把给定的对象添加到当前集合中
        返回值是boolean值，一般返回true，可以不用接收
         */
        boolean b1 = coll.add("leo");
        System.out.println("b1= " + b1);//b1= true
        System.out.println(coll);//[leo]

        coll.add("snowy");
        coll.add("anna");
        coll.add("lukas");
        System.out.println(coll);//[leo, snowy, anna, lukas]

        /*
        public boolean remove(E e):把给定的对象在当前集合中删除
        返回值是boolean值，集合中存在元素，删除元素，返回true
                         集合中不存在元素，删除失败，返回false
         */
        boolean b2 = coll.remove("leo");
        System.out.println("b2: "+b2);//b2: true

        boolean b3 = coll.remove("wuhan");
        System.out.println("b3: "+b3);//b3: false
        System.out.println(coll);//[snowy, anna, lukas]

        /*
        public boolean contains(E e):判断当前集合中是否包含给定的对象
        包含返回true，不包含返回false
         */
        boolean b4 = coll.contains("lukas");
        System.out.println("b4: "+ b4);//true

        boolean b5 = coll.contains("leo");
        System.out.println("b5: "+ b5);//false

        /*
        public boolean isEmpty():判断当前集合是否为空
        集合为空，返回true
        集合不为空， 返回false
         */
        boolean b6 = coll.isEmpty();
        System.out.println("b6: "+ b6);//false

        /*
        public int size():返回集合中元素的个数
         */
        int size = coll.size();
        System.out.println("size = "+ size);//3

        /*
        public Object[] toArray():把集合中的元素，存储到数组中
         */
        Object[] obj = coll.toArray();
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);
        }

        /*
        public void clear():    清空集合中的所有元素
         */
        coll.clear();
        System.out.println(coll);//[]
        System.out.println(coll.isEmpty());//true
    }
}
