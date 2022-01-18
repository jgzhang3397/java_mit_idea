package demo05;
/*
在多态的代码中，成员方法的访问规则是：
    看new的是谁，就优先用谁，没有则向上找
口诀：
    编译看左，运行看右
对比：
    成员变量：编译看左边，运行还看左边
    成员方法：编译看左边，运行看右边
 */
public class Demo02MultiMethod {

    public static void main(String[] args) {
        Father obj = new Son();//多态

        obj.method();//父子都有，优先用子
        obj.methodFather();//子类没有，父类有，向上找的父类

        //编译看左边，左边是Father, Father当中没有methodSon方法，所以编译报错
//        obj.methodZi();

    }
}
