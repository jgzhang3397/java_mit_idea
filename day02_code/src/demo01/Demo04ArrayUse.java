package demo01;
/*
使用动态初始化，其元素有默认值
    默认值：
        整数类型：0
        浮点类型：0.0
        字符类型：'\u0000'
        布尔类型：false
        引用类型：null
静态初始化也有默认值，系统立即替换成大括号中的具体数值
============================================
java 的内存需要划分成5个部分：
    栈内存（stack):存放的是方法中的局部变量,方法运行都在栈中
        局部变量：方法的参数，方法{}内部的变量
        作用域：一旦超出作用域，立即从栈内存消失
    堆内存（Heap）：new 出来的东西，都在堆中
        堆内存里的东西都有一个地址值：16进制
        堆内存里的数据，都有默认值。规则：
                                    默认值：
                                        整数类型：0
                                        浮点类型：0.0
                                        字符类型：'\u0000'
                                        布尔类型：false
                                        引用类型：null
    方法区(Methode Area)：存储.class相关信息，包含方法的信息
    本地方法栈(Native Method Stack）：与操作系统有关
    寄存器(pc Register): 与CPU相关
 */
public class Demo04ArrayUse {
    public static void main(String[] args) {
        //动态数组初始化
        int[] array = new int[3];

        System.out.println(array);//内存地址值
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println("=================");

        array[1] = 123;
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
    }
}
