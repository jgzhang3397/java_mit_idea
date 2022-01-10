package demo04;

import java.util.Arrays;

/*
题目：
    使用Arrays的API，将一个随机字符串中的所有字符升序排序，并倒序打印
 */
public class Demo02ArraysPractise {
    public static void main(String[] args) {
        String str = "ahgegdpy3y38pdubwxqbx2383y";

        char[] charArrays = str.toCharArray();//String --> 数组 toCharArray()

        Arrays.sort(charArrays);//升序排序
        System.out.println(charArrays);

        for (int i = charArrays.length - 1; i >= 0; i--) {
            System.out.print(charArrays[i]);
        }
    }
}
