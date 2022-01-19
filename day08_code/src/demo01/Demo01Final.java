package demo01;
/*
final修饰字表示最终，不可改变

常见四种方法：
    1. 修饰一个类
    2. 修饰一个方法
    3. 修饰一个局部变量
    4. 修饰一个成员变量
 */
public class Demo01Final {

    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1);//10;
        num1 = 20;
        System.out.println(num1);//20;

        final int num2 = 100;
        System.out.println(100);//100
//        num2 = 200;//error 不能改变
//        num2 = 100;//error

        //正确写法，只要保证有唯一一次赋值
        final int num3;
        num3 = 30;

        //对于基本数据类型，不可改变的是变量当中的数据不可改变
        //对于引用数据类型，不可改变的是变量当中的地址值不可改变
        Student student1 = new Student("Snowy");
        System.out.println(student1);
        System.out.println(student1.getName());
        student1 = new Student("Anna");
        System.out.println(student1);
        System.out.println(student1.getName());
        System.out.println("=================");

        final Student student2 = new Student("Snowwwball");
        //错误写法， final的引用类型变量，其中的地址不可改变
//        student2 = new Student("Snnnnow");
        System.out.println(student2.getName());
        student2.setName("Snowybaby");
        System.out.println(student2.getName());


    }
}
