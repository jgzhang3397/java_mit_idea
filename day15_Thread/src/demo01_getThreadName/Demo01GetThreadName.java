package demo01_getThreadName;

/**
 * 线程的名称：
 *      主线程: main
 *      新线程: Thread-0
 *             Thread-1
 *             Thread-2
 *             ....
 */
public class Demo01GetThreadName {

    public static void main(String[] args) {
        //创建Thread类的子类对象
        MyThread myThread = new MyThread();
        myThread.start();//Thread-0 | Thread[Thread-0,5,main]

        new MyThread().start();//Thread-1 | Thread[Thread-1,5,main]
        new MyThread().start();//Thread-2 | Thread[Thread-2,5,main]

        //链式编程
        System.out.println(Thread.currentThread().getName());//main
    }
}
