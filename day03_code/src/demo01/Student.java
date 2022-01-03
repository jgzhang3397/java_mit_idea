package demo01;
/*
定义一个类，用来模拟"学生"事物，两个组成部分：
    属性（是什么）：
        姓名
        年龄
    行为（能做什么）：
        吃饭
        睡觉
        学习
对应到java类中：
    成员变量（属性）：
        String name;
        int age;
    成员方法（行为）：
        public void eat(){}
        public void sleep(){}
        public void study(){}

注意事项：
    成员变量是直接定义在类中，方法外的
    成员方法不需要static关键字
 */
public class Student {
   //成员变量
    String name;
    int age;

    //成员方法
    public void eat(){
        System.out.println("Essen");
    }
    public void sleep(){
        System.out.println("Schlafen");
    }
    public void study(){
        System.out.println("Studieren");
    }
}
