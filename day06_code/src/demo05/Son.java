package demo05;

public class Son extends Father{

    @Override
    public void method() {
       // super.method();
        System.out.println("子类方法执行！");
    }

    @Override
    public String methodStr() {
        return null;
    }
}
