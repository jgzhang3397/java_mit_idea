package demo03;
/*
静态代码块格式：
    public class 类名称{
        static{
            //静态代码块内容
        }
    }

    特点：当第一次用到本类时，静态代码块执行唯一一次
    静态内容总是优先于非静态，所以静态代码块比构造方法先执行

    静态代码块的典型用途：
        用来一次性的对静态成员变量进行赋值
 */
public class Demo04StaticPerson {

    public static void main(String[] args) {
        Person one = new Person();

        Person two = new Person();
    }
}