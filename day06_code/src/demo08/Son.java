package demo08;
/*
super关键字的用法：
    1. 在子类的成员方法中，访问父类的成员变量
    2. 在子类的成员方法中，访问父类的成员方法
    3. 在子类的构造方法中，访问父类的构造方法
 */
public class Son extends Father{
    int num = 20;

    //3.
    public Son(){
        super();
    }
    //1.
    public void methodSon(){
        System.out.println(super.num);//父类num
    }
    //2.
    @Override
    public void method() {
        super.method();//访问父类的method
        System.out.println("子类方法");
    }
}
