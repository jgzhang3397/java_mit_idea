package demo03;
/*
这个子接口有四个方法：
    methodA 来源接口A
    methodB 来源接口B
    methodCommon 同时来源接口A和B
    method 来源自己
 */
public interface MyInterface extends MyInterfaceA, MyInterfaceB{

    public abstract void method();

    @Override
    default void methodDefault() {
        System.out.println("子接口覆盖重写");
    }
}
