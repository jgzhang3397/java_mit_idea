package demo04;
/*
代码中体现多态性，其实就是一句话，父类引用指向子类对象

格式：
   1.  父类名称 对象名 = new 子类名称();

   2.  接口名称 对象名 = new 实现类名称();
 */
public class Demo01Multi {

    public static void main(String[] args) {
        //多态写法
        Father obj = new Son();
        obj.method();
        obj.methodFather();
    }
}
