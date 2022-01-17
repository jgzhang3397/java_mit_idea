package demo01;
/*
接口定义抽象方法。

格式：
    public abstract 返回值类型 方法名称(参数列表);
注意事项：
    1. 接口中的抽象方法，修饰符必须是两个固定的关键字：public abstract
    2. 这两个关键字修饰符，可以选择性省略
    3. 方法三要素可以随意定义。

 */
public interface MyInterfaceAbstract {

    //抽象方法
    public abstract void methodAbs1();

    //省略格式：
    public void methodAbs2();
    abstract void methodAbs3();
    void methodAbs4();

}
