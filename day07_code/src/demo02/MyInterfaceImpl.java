package demo02;

public class MyInterfaceImpl implements MyInterfaceA,MyInterfaceB{
    @Override
    public void methodA() {
        System.out.println("覆盖重写A方法");
    }

    @Override
    public void methodB() {
        System.out.println("覆盖重写B方法");
    }

    @Override
    public void methodAbs() {
        System.out.println("覆盖重写AB接口都有的Abs方法");
    }

    @Override
    public void methodDefault() {
        System.out.println("覆盖重写默认方法");
    }
}
