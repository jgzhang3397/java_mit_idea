package demo01;
/*
静态初始化数组：

省略格式：
    数据类型[] 数组名称 = {元素1，元素2， ...};
注意事项：
    1.静态初始化没有直接指定长度，但是仍然自动推算得到长度
    2.静态初始化可以拆分两个步骤
    3.动态初始化也可以拆
    4.静态初始化省略格式不能拆
使用建议：
    不确定数组内容：动态初始化
    确定数组内容：静态初始化
 */
public class Demo02Array {
    public static void main(String[] args) {
        //省略格式的静态初始化
        int[] arrayA = {10, 20, 30};

        //2....
        int[] arrayB ;
        arrayB = new int[]{11,22,33};

        //3....
        int[] arrayC;
        arrayC = new int[5];

        //4...
//        int[] arrayD;
//        arrayD = {1,2,3};

    }
}
