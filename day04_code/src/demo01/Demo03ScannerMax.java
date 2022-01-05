package demo01;

import java.util.Scanner;

/*
键盘输入三个int数字，然后求出其最大值
 */
public class Demo03ScannerMax {
    public static void main(String[] args) {
        int a, b, c;
        int max;
        Scanner sc = new Scanner(System.in);
        System.out.println("Value a = ?");
        a = sc.nextInt();
        System.out.println("Value b = ?");
        b = sc.nextInt();
        System.out.println("Value c = ?");
        c = sc.nextInt();
        if(a > b){
            max = a;
        }else {
            max = b;
        }
        if(max > c){
            System.out.println("Max := "+ max);
        }else {
            System.out.println("Max := "+ c);
        }
    }
}
