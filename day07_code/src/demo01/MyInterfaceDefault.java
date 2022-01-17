package demo01;
/*
接口定义默认方法：
    格式：
    public default 返回值类型 方法名称(参数列表){
        方法体
    }
备注：接口中的默认方法，可以解决接口升级的问题
 */
public interface MyInterfaceDefault {

    //抽象方法
    public abstract void methodAbs();

    //当新添加一个抽象方法，需要实现类里继续覆盖重写

    //解决：新添加一个默认方法
    public default void methodDefault(){
        System.out.println("新添加的默认方法");
    }
}
