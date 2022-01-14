package demo10;

public class Son extends Father{
    int num = 20;

    public void showNum(){
        int num = 30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }

    @Override
    public void method() {
        super.method();
        System.out.println("子类方法");
    }
}
