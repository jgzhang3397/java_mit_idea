package demo01;
/*
当final关键字修饰一个方法时，这个方法就是最终方法，不能被覆盖重写
格式：
    public final 返回值类型 方法名(参数列表){
        方法体
    }
注意事项：
对于类和方法来说，final关键字和abstract不能同时使用，产生矛盾
 */
public abstract class Father {

    public final void method(){
        System.out.println("父类方法执行！");
    }

    public abstract /*final*/ void methodAbs();
}
