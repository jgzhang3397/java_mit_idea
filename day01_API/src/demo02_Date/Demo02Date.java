package demo02_Date;

import java.util.Date;

public class Demo02Date {

    public static void main(String[] args) {

        methodDate01();
        System.out.println("==========");
        methodDate02();
        System.out.println("==========");
        methodDate03();
    }

    /*
     Date类的成员方法：
        long getTime() 把日期转换成毫秒（相当于System.currentTimeMillis()）
     */
    private static void methodDate03(){
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);//1642752510872
    }

    /*
    Date 类的带参数构造方法：
        Date（long date）：传递毫秒值，把毫秒转换为Date日期
     */
    private static void methodDate02(){
        Date date = new Date(0L);
        System.out.println(date);//Thu Jan 01 01:00:00 CET 1970
    }

    /*
    Date 类的空参数构造方法：
        Date() 获取的就是当前系统的日期和时间
     */
    private static void methodDate01(){
        Date date = new Date();
        System.out.println(date);//Fri Jan 21 08:59:53 CET 2022
    }
}
