package demo03;

import java.util.Random;
import java.util.Scanner;

/*
获取随机数字 范围：[1, n]

 */
public class Demo03Random {
    public static void main(String[] args) {
        int n = 5;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Bitte geben Sie n ein: ");
//        n = sc.nextInt();
        for (int i = 0; i < 100; i++) {
            Random r = new Random();
            n = r.nextInt(n) + 1;
            System.out.println(n);
        }

    }
}
