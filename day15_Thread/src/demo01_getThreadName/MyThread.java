package demo01_getThreadName;

/**
 * 获取线程的名称：
 *      1.使用Thread类中的方法getName()
 *          String getName()返回该线程名称
 *      2.可以先获取到当前正在执行的线程，使用线程中的方法getName()获取线程的名称
 *          static Thread currentThread() 返回对当前正在执行的线程对象的引用
 */
public class MyThread extends Thread{

    @Override
    public void run() {
        /*//获取线程名称
        String name = getName();
        System.out.println(name);*/

        /*Thread t = Thread.currentThread();
        System.out.println(t);
        String name = t.getName();
        System.out.println(name);*/

        //链式编程
        System.out.println(Thread.currentThread().getName());
    }
}
