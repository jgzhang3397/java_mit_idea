package demo07;

public class Son extends Father{

    public Son(){
       // super();//隐藏的方法调用，调用父类无参构造方法
        super(10);//调用父类重载的构造方法
        System.out.println("子类构造方法调用");
    }

    public void method(){
//        super();//错误写法，只有子类构造方法，才能调用父类构造方法
    }

}
