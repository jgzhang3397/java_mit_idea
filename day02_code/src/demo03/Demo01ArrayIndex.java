package demo03;
/*
如果访问数组元素时，索引编号不存在，会发生数组索引越界异常
ArrayIndexOutOfBoundsException

解决办法：
    抛出异常
 */
public class Demo01ArrayIndex {
    public static void main(String[] args) {
        int[] array = {10, 20, 30};

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        //错误写法
        //发生数组索引越界异常
        System.out.println(array[3]);
    }
}
