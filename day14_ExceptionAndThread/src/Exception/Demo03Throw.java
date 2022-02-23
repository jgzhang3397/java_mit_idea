package Exception;

import java.util.Arrays;

/**
 * throw关键字：
 *      作用：
 *          可以使用throw关键字在指定的地方抛出指定的异常
 *      使用格式：
 *          throw new xxxException("异常产生的原因");
 *      注意：
 *          1. throw关键字必须写在方法的内部
 *          2. throw关键字后面new的对象必须是Exception或者Exception的子类对象
 *          3. throw关键字抛出指定的异常对象，我们就必须处理这个异常对象
 *              throw关键字后面创建的是RuntimeException或者是其子类对象，可以不处理，交给JVM
 *              throw关键字后面创建的是编译异常（写代码时报错），就必须处理这个异常：throws/(try...catch)
 */
public class Demo03Throw {

    public static void main(String[] args) {
        //int[] arr = {1,2,3};
        int[] arr = new int[3];
        int i = getElement(arr, 2);
        System.out.println(i);
        System.out.println(Arrays.toString(arr));
    }
    /*
        定义一个方法，获取数组指定索引处的元素
        参数：
            int[] arr
            int index
        工作中我们首先必须对方法传递过来的参数进行合法性校验
        如果参数不合法，那么我们就必须使用抛出异常的方式，告知方法的调用者，传递的参数有问题
     */
    public static int getElement(int[] arr, int index){
        /*
            可以对传递过来的参数数组，进行合法性校验
            如果数组arr的值是null
            就抛出空指针异常NullPointerException，告知方法的调用者main"传递的数组的值为null"
            NullPointerException是运行期异常，默认交给JVM处理
         */
        if(arr == null){
            throw new NullPointerException("传递的数组的值为null");
        }

        /*
            如果index的范围不在数组的索引范围内
            那么就抛出数组索引越界访问，告知方法的调用者"传递的索引超过了数组的使用范围"
            ArrayIndexOutOfBoundsException是运行期异常，默认交给JVM处理
         */
        if(index<0 || index>arr.length-1){
            throw new ArrayIndexOutOfBoundsException("传递的索引超过了数组的使用范围");
        }

        int ele = arr[index];
        return ele;
    }
}
