package demo03;
/*
局部变量和成员变量：
    1.定义的位置不一样
    局部变量：方法内部
    成员变量：方法外部，类内部
    2.作用范围不一样
    局部变量：只有方法内可用，出了方法不能用
    成员变量：整个类都能用
    3.默认值不一样
    局部变量：没有默认值，手动进行赋值
    成员变量：和数组一样，有默认值
    4.内存的位置不一样
    局部变量：位于栈内存
    成员变量：位于堆内存
    5.生命周期不一样
    局部变量：方法进栈出生，方法出栈消失
    成员变量：对象创建出生，对象被垃圾回收消失
 */
public class Demo01VariableDiff {
    //成员变量
    String name;

    public void methodA(){
        //局部变量
        int num = 20;
        System.out.println(num);
        System.out.println(name);
    }
    public void methodB(int param){//方法的参数是局部变量
        //参数在方法调用时，必然会被赋值
        System.out.println(param);
        int age;
//        System.out.println(age);//没赋值不能用
//        System.out.println(num);//error
        System.out.println(name);
    }
}
