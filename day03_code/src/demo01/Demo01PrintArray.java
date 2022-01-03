package demo01;

import java.util.Arrays;

/*
面向过程：实现一个功能，具体到每一个步骤
面向对象：实现一个功能，找到能实现该功能的方法
================
类是对一类事物的描述，是抽象的
对象是一类事物的实例，是具体的
类是对象的模版，对象是类的实体
 */
public class Demo01PrintArray {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60};
        //面向过程：
        //打印输出[10, 20, 30, 40, 50, 60]
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if(i<array.length-1){
                System.out.print(array[i]+", ");
            }else {
                System.out.println(array[i]+"]");
            }
        }
        //面向对象
        System.out.println(Arrays.toString(array));
    }
}
