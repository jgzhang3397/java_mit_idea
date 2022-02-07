package List;

import java.util.LinkedList;

/**
 * java.util.LinkedList集合 implements List 集合
 * LinedList集合的特点：
 *      1.底层是一个链表结构：查询慢，增删快
 *      2.里面包含了大量操作首尾元素的方法
 *      注意：使用LinedList集合特有的方法，不能使用多态
 *
 *      -public void	addFirst(E e): Inserts the specified element at the beginning of this list.
 *      -public void	addLast(E e): Appends the specified element to the end of this list.
 *      -public E	getFirst(): Returns the first element in this list.
 *      -public E	getLast() : Returns the last element in this list.
 *      -public E	removeFirst(): Removes and returns the first element from this list.
 *      -public E	removeLast(): Removes and returns the last element from this list.
 *      -public E	pop() : 从此列表所表示的堆栈处弹出一个元素
 *      -public void	push(E e) ： 将元素推入此列表所表示的堆栈, 等效addFirst
 *      -public boolean isEmpty()：如果列表不包含元素，则返回true
 */
public class Demo02LinkedList {

    public static void main(String[] args) {
        //show01();
        //show02();
        show03();
    }

    /*
        -public E	removeFirst(): Removes and returns the first element from this list.
        -public E	removeLast(): Removes and returns the last element from this list.
        -public E	pop() : 从此列表所表示的堆栈处弹出一个元素, 相当于removeFirst
     */
    public static void show03(){
        //创建LinkedList集合对象
        LinkedList<String> linked = new LinkedList<>();
        //使用add方法往集合中添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);//[a, b, c]

        //String removeFirst = linked.removeFirst();
        String removeFirst = linked.pop();
        System.out.println("removeFist: "+ removeFirst);
        System.out.println(linked);

        String removeLast = linked.removeLast();
        System.out.println("removeLast: "+ removeLast);
        System.out.println(linked);

    }

    /*
        public E	getFirst()
        public E	getLast()
     */
    public static void show02(){
        //创建LinkedList集合对象
        LinkedList<String> linked = new LinkedList<>();
        //使用add方法往集合中添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);//[a, b, c]

        if(linked.isEmpty()==false){//防止抛出NoSuchElementException异常
            String first = linked.getFirst();
            System.out.println(first);//a

            String last = linked.getLast();
            System.out.println(last);//c
        }
    }

    /*
        -public void	addFirst(E e)
        -public void	addLast(E e)
        -public void	push(E e)
     */
    public static void show01(){
        //创建LinkedList集合对象
        LinkedList<String> linked = new LinkedList<>();
        //使用add方法往集合中添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);//[a, b, c]

        //linked.addFirst("www");
        linked.push("www");
        System.out.println(linked);//[www, a, b, c]

        linked.addLast("com");
        System.out.println(linked);//[www, a, b, c, com]
    }
}
