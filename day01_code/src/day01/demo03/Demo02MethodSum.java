package day01.demo03;
/*
题目要求：
    定义一个方法，求1～100所以数字的和
 */
public class Demo02MethodSum {
    public static void main(String[] args) {
        System.out.println("Result = : "+ getSum());
    }
    /*
    三要素：
        返回值：int
        方法名称：getSum
        参数列表：无
     */
    public static int getSum() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
}
