package demo04;
/*
一个方法可以有0, 1,多个参数，但是只能有0，1个返回值，不能有多个返回值
如何返回多个结果数据：
        使用数组作为返回值类型

任何数据类型都能作为方法的参数类型，或者返回值类型

数组作为方法的参数，传递进去的其实是数组的地址值
数组作为方法的返回值，返回的也是数组的地址值
    都需要其下标解引用
 */
public class Demo02ArrayReturn {
    public static void main(String[] args) {
        int[] result = calculate(10,20,30);
        System.out.println("main方法接收到的返回值数组是：");
        System.out.println(result);
        System.out.println("Sum: "+ result[0]);
        System.out.println("Sum: "+ result[1]);
    }
    public static int[] calculate(int a, int b, int c){
        int sum = a + b + c;
        int avg = sum/3;

        int[] array = new int[2];
        array[0] = sum;
        array[1] = avg;
        System.out.println("方法内部数组是：");
        System.out.println(array);
        return array;
    }
}
