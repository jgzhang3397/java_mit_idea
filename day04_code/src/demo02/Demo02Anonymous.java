package demo02;

import java.util.Scanner;

public class Demo02Anonymous {
    public static void main(String[] args) {
        //普通使用方式
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();

        //匿名对象的方式
//        int num = new Scanner(System.in).nextInt();
//        System.out.println("输入的是: "+ num);
        //一般写法传入参数
//        Scanner sc = new Scanner(System.in);
//        methodParam(sc);
        //使用匿名对象来进行传参
//        methodParam(new Scanner(System.in));
        Scanner sc = methodReturn();
        int num = sc.nextInt();
        System.out.println("Num: = "+ num);
    }
    public static void methodParam(Scanner sc){
        int i = sc.nextInt();
        System.out.println("输入的是： "+ i);
    }

    public static Scanner methodReturn(){
        //一般返回
//        Scanner sc = new Scanner(System.in);
//        return sc;
        //匿名对象返回
        return new Scanner(System.in);
    }
}
