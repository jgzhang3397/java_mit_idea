package demo04Calendar;

import java.util.Calendar;

/**
 *  java.util.Calendar 类 ，日历类
    Calendar 类 是抽象类，里面提供了很多操作日历字段的方法(YEAR, MONTH, DAY_OF_MONTH, HOUR)
    Calendar 类无法直接创建对象使用，里面提供一个静态方法叫getInstance(),该方法返回了Calendar的子类对象
    static Calendar getInstance() 使用默认时区和语言环境获得一个日历
 */
public class Demo01Calendar {

    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
        System.out.println(instance);
    }
}
