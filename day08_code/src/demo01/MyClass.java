package demo01;
/*
当final关键字修饰一个类时，格式：
    public final class 类名称{
        //...
    }
    含义：
        这个类不能有任何子类，太监类
        如果一个类是final的，则其中所有成员方法都不能覆盖重写
 */
public final class MyClass /*extends Object*/{

    public void method(){
        System.out.println("方法执行！");
    }
}
