package day01.demo04;
/*
方法重载（overload）：多个方法名称一样，参数列表不一样
    对于功能类似的方法，因参数列表不同，需要方法重载
与下列因素相关：
    参数个数不同
    参数类型不同
    参数的多类型顺序不同
与下列因素无关：
    参数名称无关
    返回值类型无关
 */
public class Demo01MethodOverload {
    public static void main(String[] args) {
        /*System.out.println(sumTwo(10,20));
        System.out.println(sumThree(10,20,30));
        System.out.println(sumFour(10,20,30,40));*/

        //Overload
        System.out.println(sum(10,20));
        System.out.println(sum(10,20,30));
        System.out.println(sum(10,20,30,40));
    }
    //===参数的多类型顺序不同===
    public static int sum(int a, double b){
        return (int)(a + b);
    }
    //===参数类型不同===
    public static int sum(double a, double b){
        return (int)(a + b);
    }
    //===参数个数不同===
    public static int sum(int a, int b){
        System.out.println("===2===");
        return a + b;
    }
    public static int sum(int a, int b, int c){
        System.out.println("===3===");
        return a + b + c;
    }
    public static int sum(int a, int b, int c, int d){
        System.out.println("===4===");
        return a + b + c + d;
    }
}
