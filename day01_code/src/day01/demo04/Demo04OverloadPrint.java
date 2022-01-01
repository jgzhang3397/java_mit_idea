package day01.demo04;
//数据类型：
//  基本类型：byte short int long float double char boolean
//  引用类型：string
//  调用输出语句println就是重载
public class Demo04OverloadPrint {
    public static void main(String[] args) {
        myPrint(100);
        myPrint("hello" );

    }
    public static void myPrint(byte num){
        System.out.println(num);
    }
    public static void myPrint(short num){
        System.out.println(num);
    }
    public static void myPrint(int num){
        System.out.println(num);
    }
    public static void myPrint(long num){
        System.out.println(num);
    }
    public static void myPrint(float num){
        System.out.println(num);
    }
    public static void myPrint(double num){
        System.out.println(num);
    }
    public static void myPrint(char ch){
        System.out.println(ch);
    }
    public static void myPrint(boolean is){
        System.out.println(is);
    }
    public static void myPrint(String str){
        System.out.println(str);
    }
}
