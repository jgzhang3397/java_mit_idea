package demo03;
/*
所有引用类型变量，都可以赋值为一个null值，代表虚空，啥也没有

数组必须进行new 初始化才能使用其元素
如果只是赋值一个null，没有进行new的创建
将发生：空指针异常--> NullPointerException

原因：忘了new
解决：补上new
 */
public class Demo02ArrayNull {
    public static void main(String[] args) {
        int[] array = null;
        //array = new int[3];
        System.out.println(array[0]);//NullPointerException
    }
}
