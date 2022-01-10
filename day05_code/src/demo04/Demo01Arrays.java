package demo04;

import java.util.Arrays;

/*
java.util.Arrays 是一个与数组相关的工具类，里面提供大量静态方法，用来实现数组常见的操作

public static String toString(数组）：将参数数组变成字符串([e1, e2, e3,...])
public static void sort(数组）：按照默认升序（从小到大）对数组的元素进行排序

注意事项：
    1. 如果是数值，sort默认按照升序从小到大
    2. 如果是字符串，sort默认按照字母升序
    3. 如果是自定义类型，这个自定义的类需要有Comparable或者Comparator接口的支持。（后面学习）
 */
public class Demo01Arrays {
    public static void main(String[] args) {
        int[] intArray = {10, 20, 30};

        //将int[]数组按照默认格式变成字符串
        String intStr = Arrays.toString(intArray);
        System.out.println(intStr);//[10, 20, 30]

        int[] array1 = {2, 1, 6, 3, 5};
        Arrays.sort(array1);
        System.out.println(array1);//数组首元素地址
        System.out.println(Arrays.toString(array1));//[1, 2, 3, 5, 6]

        String[] array2 = {"bdc", "abd", "eaa"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));//[abd, bdc, eaa]
    }
}
