package demo06StringBuilder;

import java.util.Locale;

/**
 * StringBuilder 类的成员方法：
 *      public StringBuilder append{...}: 添加任意类型数据的字符串形式，并返回当前对象自身
 *      参数：
 *          可以是任意数据类型
 */
public class Demo02StringBuilderMethod {

    public static void main(String[] args) {
        //创建StringBuilder对象
        StringBuilder bu1 = new StringBuilder();

        //使用append()方法往StringBuilder中添加数据
        //StringBuilder bu2 = bu1.append("abc");

        //append()方法返回的是this，调用方法的对象bu1
//        System.out.println(bu1);//abc
//        System.out.println(bu2);//abc
//        System.out.println(bu1 == bu2);//true，==比较两个的地址

        /*//使用append()方法不需要接收返回值
        bu1.append("abc");
        bu1.append(1);
        bu1.append(true);
        bu1.append(3.14);
        System.out.println(bu1);//abc1true3.14*/

        /*
        链式编程：方法的返回值是一个对象，可以根据对象继续调用方法
         */
        System.out.println("abc".toLowerCase().toUpperCase().toLowerCase().toUpperCase());//小写/大写
        bu1.append("abc").append(1).append(true).append(3.40).append('a');
        System.out.println(bu1);

    }
}
