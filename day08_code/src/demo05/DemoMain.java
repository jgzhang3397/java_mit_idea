package demo05;

/**
 * 如果接口的实现类（或者是父类的子类）只需要使用唯一的一次
 * 那么这种情况下可以省略该类的定义，而改为使用匿名内部类
 *
 * 匿名内部类的定义格式：
 * 接口名称 对象名 = new 接口名称(){
 *     //覆盖重写所以的抽象方法
 * };
 *
 * 对格式"new 接口名称(){...};"进行解析：
 * 1. new代表创建对象的动作
 * 2. 接口名称就是匿名内部类需要实现的哪个接口
 * 3. {...}这才是匿名内部类的内容
 *
 * 注意事项：
 *      1. 匿名内部类 在创建对象时，只能使用唯一一次，多次创建的话需要创建实现类
 *      2. 匿名对象 在调用方法时，只能调用唯一一次，调用多次方法，必须创建对象
 *      3. 匿名内部类是省略了实现类/子类名称，匿名对象是省略了对象名称
 *      强调：匿名内部类和匿名对象不是一回事！！！
 */
public class DemoMain {

    public static void main(String[] args) {
        //使用多态，左父右子
//        MyInterface impl = new MyInterfaceImpl();
//        impl.method();

        //使用匿名内部类, 但不是匿名对象，对象名称就是objA
        MyInterface objA = new MyInterface() {
            @Override
            public void method1() {
                System.out.println("匿名内部类实现了方法111A");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类实现了方法222A");
            }
        };
        objA.method1();
        objA.method2();
        System.out.println("=============================");

        //使用匿名内部类, 而且省略了对象名称，也就是匿名对象
        new MyInterface() {
            @Override
            public void method1() {
                System.out.println("匿名内部类实现了方法111B");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类实现了方法222B");
            }
        }.method1();
        //要想调用method2,必须重写匿名内部类
        new MyInterface() {
            @Override
            public void method1() {
                System.out.println("匿名内部类实现了方法111B");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类实现了方法222B");
            }
        }.method2();
    }
}
