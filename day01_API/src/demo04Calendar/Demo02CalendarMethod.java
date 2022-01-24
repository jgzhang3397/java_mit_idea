package demo04Calendar;

import java.util.Calendar;
import java.util.Date;

/**
 * Calendar 类的成员方法：
 *      - public int get(int field): 返回给定日历字段的值
 *      - public void set(int field, int value): 将给定的日历字段设置为给定值
 *      - public abstract void add(int field, int amount): 根据日历的规则，为给定的日历字段添加或减去指定的时间量
 *      - public Date getTime(): 返回一个表示此Calendar时间值(从历元到现在的毫秒偏移量) 的Date对象
*  成员方法的参数：
 *      int field: 日历类的字段，可以使用Calend类的静态成员变量获取
 *
 */
public class Demo02CalendarMethod {

    public static void main(String[] args) {
        demo01();
        System.out.println("==============");
        demo02();
        System.out.println("==============");
        demo03();
        System.out.println("==============");
        demo04();
    }

    /*
    public Date getTime(): 返回一个表示此Calendar时间值(从历元到现在的毫秒偏移量) 的Date对象
     */

    private static void demo04(){
        //使用getInstance方法获取Calendar对象
        Calendar calendar = Calendar.getInstance();

        Date date = calendar.getTime();
        System.out.println(date);
    }

    /*
    public abstract void add(int field, int amount): 根据日历的规则，为给定的日历字段添加或减去指定的时间量
    参数：
        int field: 传递指定的日历字段(YEAR, MONTH,...)
        int amount: 增加/减少的值
            正数：增加
            负数：减少
     */
    private static void demo03(){
        //使用getInstance方法获取Calendar对象
        Calendar calendar = Calendar.getInstance();

        //把年增加2年
        calendar.add(Calendar.YEAR, 2);

        //把月减少3月
        calendar.add(Calendar.MONTH, -3);

        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);
        int month = calendar.get(Calendar.MONTH);
        System.out.println(month);
        int date = calendar.get(Calendar.DATE);
        System.out.println(date);

    }

    /*
    public void set(int field, int value): 将给定的日历字段设置为给定值
        参数：
            int field : 传递指定的日历字段(YEAR, MONTH, ...)
            int value : 传递的字段设置的具体的值
     */
    private static void demo02(){
        //使用getInstance方法获取Calendar对象
        Calendar calendar = Calendar.getInstance();

        /*//设置年为9999
        calendar.set(Calendar.YEAR, 9999);
        //设置月为9月
        calendar.set(Calendar.MONTH, 9);
        //设置日为9号
        calendar.set(Calendar.DATE, 9);*/

        //同时设置年月日，可以使用set的重载方法
        calendar.set(8888,8,8);

        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);
        int month = calendar.get(Calendar.MONTH);
        System.out.println(month);
        int date = calendar.get(Calendar.DATE);
        System.out.println(date);
    }

    /*
    public int get(int field): 返回给定日历字段的值
        参数：传递指定的日历字段(YEAR, MONTH,...)
        返回值：日历字段代表的具体的值
     */
    private static void demo01(){
        //使用getInstance方法获取Calendar对象
        Calendar calendar = Calendar.getInstance();

        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);
        int month = calendar.get(Calendar.MONTH);
        System.out.println(month+1);
        int date = calendar.get(Calendar.DATE);
        System.out.println(date);
    }
}
