package day01.demo02;
/*
题目要求：
    定义一个方法，求两个数字之和
        1.有返回值:
        2.无返回值：只能单独调用
 */
public class Demo04MethodReturn {
    public static void main(String[] args) {
        int num = getSum(10, 20);
        System.out.println("Sum = : "+ num);
        System.out.println("==============");
        printSum(10, 10);
    }
//    1.有返回值
    public static int getSum(int x, int y){
        int result = x + y;
        return result;
    }
//    2.无返回值
    public static void printSum(int x, int y){
        int result = x + y;
        System.out.println("Result = "+ result);
    }
}
