package demo03_Thread;

/**
 * 主线程：执行主(main)方法的线程
 *      JVM执行main方法，main方法会进入到栈内存
 *      JVM会找操作系统开辟一条main方法通向cpu的执行路径
 *      cpu就可以通过这个路径来执行main方法
 *      而这个路径有一个名字，叫主(main)线程
 *
 * 单线程程序：java程序中只有一个线程
 *          执行main方法开始，从上到下依次执行
 */
public class Demo01MainThread {

    public static void main(String[] args) {
        //执行main方法开始，从上到下依次执行
        Person p1 = new Person("leo");
        p1.Run();

        Person p2 = new Person("lukas");
        p2.Run();
    }
}
