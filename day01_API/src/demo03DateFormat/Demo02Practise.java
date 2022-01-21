package demo03DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 练习：
 *      使用日期相关的API，计算一个人出生了多少年
 * 分析：
 *      1. 使用Scanner类的方法next，获取出生日期
 *      2. 使用DateFormat类中的方法parse，把字符串的出生日期解析为Date格式
 *      3. 把Date格式的出生日期转换为毫秒值
 *      4. 获取当前的日期，转换为毫秒值
 *      5. 使用当前日期毫秒值 - 出生日期毫秒值
 *      6. 把毫秒值差转换为年(s/1000/60/60/24/365)
 */
public class Demo02Practise {

    public static void main(String[] args) throws ParseException {
        //1.
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的出生日期，格式为yyyy-MM-dd：");
        String birthdayDateString = scanner.next();

        //2.
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = simpleDateFormat.parse(birthdayDateString);

        //3.
        long birthdayDateTime = birthdayDate.getTime();

        //4.
        Date date = new Date();
        long todayTime = date.getTime();

        //5.
        long timeDiff = todayTime - birthdayDateTime;

        //6.
        System.out.println("我的年龄是："+timeDiff/1000/60/60/24/365);
    }
}
