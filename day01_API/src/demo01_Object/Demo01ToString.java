package demo01_Object;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * java.lang.Object类
 * 类 Object 是类层次结构的根(最顶层)类，每个类都使用Object 作为超(父)类，所有对象(包括数组) 都实现了这个类的方法
 */
public class Demo01ToString {

    public static void main(String[] args) {
        /**
         *  Person类默认继承了Object类，所以可以使用Object类中的toString方法
         *  String toString() 返回该对象的字符串表示
         */
        Person person = new Person("张三", 20);
        String s = person.toString();
        System.out.println(s);//demo01.Person@35bbe5e8 ｜ Person{name='张三', age=20}

        //直接打印对象的名字，其实就是调用对象的toString方法 person = person.toString();
        System.out.println(person);//demo01.Person@35bbe5e8 ｜ Person{name='张三', age=20}

        /**
         * 看一个类是否重写了toString方法，直接打印这个类对应对象的名字即可
         * 如果没有重写toString方法，那么打印的就是对象的地址值
         * 如果重写toString方法，那么就按照重写的方式打印
         */
        Random random = new Random();
        System.out.println(random);//java.util.Random@6cd8737  --> 没有重写toString方法

        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner);//java.util.Scanner[delimiters=\p{javaWhitespace} --> 重写了toString方法

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);//[1, 2] --> 重写了toString方法
    }
}
