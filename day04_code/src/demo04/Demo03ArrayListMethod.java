package demo04;

import java.util.ArrayList;

/*
ArrayList常用方法：
    public boolean add(E e): 向集合中添加元素，参数类型和泛型一样
        对于ArrayList集合来说，add添加动作一定成功，所以返回值可用可不用
        但对于其他集合来说， add添加动作不一定成功
    public E get(int index): 从集合中获得元素，参数是索引编号，返回值就是对应位置的元素
    public E remove(int index): 从集合中删除元素，参数是索引编号，返回值就是被删除掉的元素
    public int size(): 获取集合的尺寸长度，返回值是集合中包含的元素个数
 */
public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);//[]

        //add
        boolean success = list.add("Nina");
        System.out.println(list);//[Nina]
        System.out.println(success);//true

        list.add("Lukas");
        list.add("Snowy");
        System.out.println(list);//[Nina, Lukas, Snowy]

        //get
        String name = list.get(1);
        System.out.println(name);//Lukas

        //remove
        String whoRemoved = list.remove(2);
        System.out.println(whoRemoved);//Snowy
        System.out.println(list);//[Nina, Lukas]

        //size
        int size = list.size();
        System.out.println(size);//2
    }
}
