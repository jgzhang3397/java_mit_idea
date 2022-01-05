package demo01;

import java.util.Scanner;

//import java.lang.String;
/*
Scanner 类功能，可以实现键盘输入数据，到程序中

引用类型一般的使用步骤：
    1.导包 -- import 包路径.类名称
                如果需要使用的目标类和当前类在同一个包下，可省略不写
                只有java.lang包下的内容不需要导包 例如：String
    2.创建
        类名称 对象名 = new 类名称（）；
    3.使用
        对象名.成员方法名（）
            获取键盘输入的int数字：int num = sc.nextInt();
            获取键盘输入的一个字符床：String str = sc.next();
 */
public class Demo01Scanner {
    public static void main(String[] args) {
        //String str = "oo";
        while (true){
            Scanner sc = new Scanner(System.in);//System.in := 从键盘输入
            int num = sc.nextInt();
            System.out.println("int: ==> "+ num);
            String str = sc.next();
            System.out.println("String: ==> "+ str);
        }
    }
}
