package demo02;

public abstract class MyInterfaceAbstract implements MyInterfaceA, MyInterfaceB{
    @Override
    public void methodA() {

    }

    @Override
    public void methodDefault() {
        System.out.println("默认方法重写");
    }

    @Override
    public void methodB() {

    }
}
