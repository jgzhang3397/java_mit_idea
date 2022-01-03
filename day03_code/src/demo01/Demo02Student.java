package demo01;
//import demo01.Student;
/*
通常情况下，一个类不能直接使用，需要根据类创建一个对象，才能使用

1.导包，也就是指出需要使用的类，在什么位置
    import 包名称.类名称
    import demo01.student
    对于和当前类属于同一个包的情况，可省略导包语句

2.创建，格式。
    类名称 对象名 = new 类名称（）；
    Student stu = new Student();
3.使用：两种情况
    使用成员变量: 对象名.成员变量名
    使用成员方法: 对象名.成员方法名（参数）

注意事项：
    如果成员变量没有赋值，将存在一个默认值，规则和数组一样
 */
public class Demo02Student {
    public static void main(String[] args) {
        //1.导包
        //此处省略

        //2.创建，格式
        Student stu = new Student();

        //3.使用 --> 成员变量
        System.out.println(stu.name);//null
        System.out.println(stu.age);//0
        System.out.println("================");

        //赋值
        stu.name = "Snowy";
        stu.age = 3;
        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println("================");

        //3.使用 --> 成员方法
        stu.eat();
        stu.sleep();
        stu.study();

    }
}
