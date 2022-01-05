package demo01;

import java.util.Scanner;

/*
键盘输入两个int数字，然后求和
 */
public class Demo02ScannerSum {
    public static void main(String[] args) {
        int a ;
        int b ;
        int sum;
        while (true)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Bitte geben Sie die Value a: ");
            a = sc.nextInt();
            System.out.println("Bitte geben Sie die Value b: ");
            b = sc.nextInt();
            sum = a + b;
            System.out.println("Sum : = "+ sum);
        }
    }
}
