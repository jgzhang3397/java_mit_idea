package day01.demo04;
/*
题目要求：
    比较两个数据是否相等
    参数类型分别是两个byte，两个short，两个int，两个long类型
 */
public class Demo02MethodOverloadSame {
    public static void main(String[] args) {
        //==byte==
        byte a = 10;
        byte b = 20;
        System.out.println(isSame(a, b));
        //==short==
        System.out.println(isSame((short) 10,(short)20));
        //==int==
        System.out.println(isSame(10,20));
        //==long==
        System.out.println(isSame(10L,20L));
        System.out.println(isSame((long) 10,(long) 20));
    }
    public static boolean isSame(byte a, byte b){
        System.out.println("===byte===");
        return  a == b;
    }
    public static boolean isSame(short a, short b){
        System.out.println("===short===");
        boolean result;
        if(a == b)
        {
            result = true;
        }else {
            result = false;
        }
        return result;
    }
    public static boolean isSame(int x, int y){
        System.out.println("===int===");
        if(x == y){
            return true;
        }else {
            return false;
        }
    }
    public static boolean isSame(long x, long y){
        System.out.println("===long===");
        boolean result = x == y ? true : false;
        return result;
    }
}

