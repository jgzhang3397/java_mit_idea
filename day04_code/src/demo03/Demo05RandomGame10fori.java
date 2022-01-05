package demo03;

import java.util.Random;
import java.util.Scanner;

/*
模拟猜数字小游戏：

思路：
    1.用代码产生一个随机数字 Random的nextInt
    2.需要键盘输入：Scanner
    3.获取键盘输入的数字，Scanner的nextInt
    4.得到的两个数字 判断if
        太大 提示太大
        太小 提示太小
        猜中了 游戏结束
    5.重试 循环次数不确定 while（true）

 */
public class Demo05RandomGame10fori {
    public static void main(String[] args) {
        Random r = new Random();
        int randomNum = r.nextInt(100) + 1;

        for (int i = 1; i <= 10; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Bitte geben Sie ihe Nummer ein: -> ");
            int guessNum = sc.nextInt();

            if(guessNum > randomNum ){
                System.out.println("Zu gross");
                System.out.println("Sie haben noch "+ (10 - i) +" mal Chance");
            }else if(guessNum < randomNum ){
                System.out.println("Zu klein");
                System.out.println("Sie haben noch "+ (10 - i) +" mal Chance");
            }else{
                System.out.println("Bingo! Richtig");
                break;
            }

            if(i > 10){
                System.out.println("Sie haben keinen Chance mehr");
                break;
            }
        }
        System.out.println("Exit Game!!");
        System.out.println("RandomNum ist : "+ randomNum);
    }
}
