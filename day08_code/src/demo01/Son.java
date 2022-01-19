package demo01;

public class Son extends Father{
    @Override
    public void methodAbs() {

    }

    //错误写法，子类不能覆盖重写父类的final方法
//    @Override
//    public void method() {
//        System.out.println("子类覆盖重写父类方法");
//    }
}
