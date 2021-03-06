package demo03_ForEach;

import java.util.ArrayList;

/**
 * 增强for循环：底层使用也是迭代器，使用for循环格式，简化了迭代器的书写
 * JDK1.5之后出现的新特性
 * Collection<Element>extends Iterable<Element>:所有单列集合都可以使用增强for
 * public interface Iterable<Type>实现这个接口允许对象成为"foreach"语句的目标
 *
 * 增强for循环：用来遍历集合和数组
 *
 * 格式：
 *      for(集合/数组的数据类型 变量名：集合名/数组名){
 *          sout(变量名):
 *      }
 */
public class Demo01ForEach {

    public static void main(String[] args) {
        demo01();
        System.out.println("=============");
        demo02();
    }

    //使用增强for循环遍历集合
    private static void demo02(){
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        for(String s: list){
            System.out.println(s);
        }
    }

    //使用增强for循环遍历数组
    private static void demo01(){
        int[] arr = {1,2,3,4,5};
        for(int i: arr){
            System.out.println(i);
        }
    }
}
