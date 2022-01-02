package demo01;
/*
数组的概念：一种容器，可以同时存放多个数据值

数组的特点：
    数组是引用数据类型
    数组当中的多个数据，类型必须统一
    数组的长度在程序运行期间不可改变
数组的初始化：
    两种：
        动态初始化：（指定长度）
        静态初始化：（指定内容）
    动态初始化格式：
        数据类型[] 数组名称 = new 数据类型[数组长度];
        z.B.    int[] arrays = new int[10];
    静态初始化格式：
        数据类型[] 数组名称 = new 数据类型[]{e1, e2, ....};
 */
public class Demo01Array {
    public static void main(String[] args) {
        //动态初始化格式：
        //数据类型[] 数组名称 = new 数据类型[数组长度];
        int[] arrayA = new int[300];
        //创建数组，存放10个double类型
        double[] arrayB = new double[10];
        //创建数组，存放5个字符串
        String[] arrayC = new String[5];

        //静态初始化格式：
        //数据类型[] 数组名称 = new 数据类型[]{e1, e2, ....};
        int[] arrayD = new int[]{10,20,30};
        //创建一个数组，装字符串："Hello", "World", "Java";
        String[] arrayE = new String[]{"Hello", "World", "Java"};
    }
}
