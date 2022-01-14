package demo09;
/*
super关键字用来访问父类内容，而this关键字用来访问本类内容。用法有三种：
    1. 在本类的成员方法中，访问本类的成员变量。
    2. 在本类的成员方法中，访问本类的另一个成员方法。
    3. 在本类的构造方法中，访问本类的另一个构造方法。
用法3需要注意事项：
    1. this(...) 调用也必须是构造方法的第一个语句，也是唯一一个
    2. super和this两种构造调用，不能同时使用
 */
public class Son extends Father{
    int num = 20;

    public Son(){
        this(122);//本类的无参构造方法调用本类的有参构造方法
       // this(1, 2);
    }

    public Son(int n){
        this(1, 2);
    }

    public Son(int n, int m){

    }

    public void showNum(){
        int num = 10;
        System.out.println(num);//局部变量
        System.out.println(this.num);//本类成员变量
        System.out.println(super.num);//父类成员变量
    }

    public void methodA(){
        System.out.println("aaa");
    }

    public void methodB(){
        this.methodA();
        System.out.println("bbb");
    }
}
