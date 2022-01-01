package day01.demo03;
/*
题目要求：
    定义一个方法，用来打印指定次数的Helloworld
 */
public class Demo03MethodPrint {
    public static void main(String[] args) {
        printCount(10);
    }
    /*
    三要素：
        返回值：void
        方法名：printCount
        参数列表：int num
     */
    public static void printCount(int num){
        for (int i = 0; i < num; i++) {
            System.out.println("Hello World "+ (i+1));
        }
    }
}
