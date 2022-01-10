package demo02;

import java.util.Scanner;

/*
题目：
    键盘输入一个字符串，并且统计其中各个字符出现的次数
    种类有；大写字母，小写字母，数字，其他
思路：
    1. 键盘输入，Scanner
    2. 输入字符串，String str = sc.next();
    3. 定义四个变量，代表四种字符
    4. 对字符串遍历检查，String --> char[], 方法就是toCharArray();
    5. 遍历char[]字符数组，对当前字符的种类进行判断，并且四个变量++；
    6. 打印输出4个变量，分别代表四种字符出现的次数
 */
public class Demo02StringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben Sie einmal String ein:->");
        String input = sc.next();

        int upCounter = 0;
        int lowCounter = 0;
        int numberCounter = 0;
        int otherCounter = 0;

        char[] charArray = input.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if('A'<= charArray[i] && charArray[i] <= 'Z'){
                upCounter ++;
            }else if('a'<= charArray[i] && charArray[i] <= 'z'){
                lowCounter ++;
            }else if('1'<= charArray[i] && charArray[i] <= '9'){
                numberCounter ++;
            }else{
                otherCounter++;
            }
        }
        System.out.println("upCounter := "+ upCounter);
        System.out.println("lowCounter := "+ lowCounter);
        System.out.println("numberCounter := "+ numberCounter);
        System.out.println("otherCounter := "+ otherCounter);
    }
}
