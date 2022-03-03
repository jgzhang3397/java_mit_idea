package demo06_threadSafe.Solution04_Lock;

/**
 * 模拟买票案例
 * 创建三个线程，同时开启，对共享的票进行出售
 */
public class Demo01Ticket {

    public static void main(String[] args) {
        // 创建Runnable接口的实现类对象
        Runnable r = new RunnableImpl();
        System.out.println(r);
        
        //创建Thread类对象，构造方法中传递Runnable接口的实现类对象
        Thread t0 = new Thread(r);
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

        //调用start方法开启多线程
        t0.start();
        t1.start();
        t2.start();

    }
}
