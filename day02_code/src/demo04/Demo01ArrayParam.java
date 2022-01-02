package demo04;
/*
数组可以作为方法的参数。
当调用方法是，向方法的小括号进行传参，传进出的是数组的地址值
 */
public class Demo01ArrayParam {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50};
        System.out.println("main里的数组array是：");
        System.out.println(array);
        printArray(array);
        System.out.println("====aaa====");
        printArray(array);
        System.out.println("====bbb====");

    }
    //需要定义一个方法
        /*
        三要素
        返回值类型：void
        方法名称：printArray
        参数列表；int[] array
         */
    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("函数内部array是");
        System.out.println(array);
    }
}
