package demo03;

public class Son extends Father {
    int num = 10;

    public void methodSon(){
        int num = 20;
        System.out.println(num);//局部变量
        System.out.println(this.num);//本类成员变量
        System.out.println(super.num);//父类成员变量
    }
}
