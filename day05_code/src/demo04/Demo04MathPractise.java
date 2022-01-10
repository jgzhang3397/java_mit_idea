package demo04;
/*
题目：输出打印在范围[-10.8, 5.9]内绝对值大于6小于2.1的整数

分析：
    1. for循环
    2. -10.8可以转换成-10
        2.1 Math.ceil向上取整
        2.2 强转成int（int）
    3. int型 num++
    4. Math.abs得到绝对值
    5. 计数器counter
 */
public class Demo04MathPractise {
    public static void main(String[] args) {
        double min = -10.8;
        double max = 5.9;
        int counter = 0;
        for(int i = (int) Math.ceil(min); i<max; i++){
            int abs = Math.abs(i);
            //if(Math.abs(6)< i || i< Math.abs(2.1)){}//Error
            if(abs > 6 || abs < 2.1){
                counter ++;
                System.out.print(i+" ");
            }
        }
        System.out.println("\nSum = : "+ counter);
    }
}
