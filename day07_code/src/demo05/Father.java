package demo05;

public class Father {

    int num = 10;

    public void showNum(){
        int num = 11;
    }

    public void method(){
        System.out.println("父类方法");
    }

    public void methodFather(){
        System.out.println("父类特有方法");
    }
}
