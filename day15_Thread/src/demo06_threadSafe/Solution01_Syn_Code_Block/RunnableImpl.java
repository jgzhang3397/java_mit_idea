package demo06_threadSafe.Solution01_Syn_Code_Block;

/**
 * 解决线程安全问题的第一种方法，使用同步代码块
*  *      格式:
*  *          synchronized(锁对象){
*  *              可能会出现线程安全问题的代码(访问了共享数据的代码)
*  *          }
*  *
*  *      注意：
*  *          1. 通过代码块中的锁对象，可以使用任意的对象
*  *          2. 但是必须保证多个线程使用的锁对象是同一个
*  *          3. 锁对象作用：
*  *              把同步代码块锁住，只让一个线程在同步代码块中执行
 */
public class RunnableImpl implements Runnable{
    //定义一个多线程的票源
    private int ticket = 100;

    //创建一个锁对象
    /*
        同步中的线程，没有执行完毕不会释放锁对象
        同步外的线程，没有锁对象进不去同步代码块执行
     */
    Object obj = new Object();

    //设置线程任务：买票
    @Override
    public void run() {
        //使用while循环，让卖票操作重复进行
        while (true)
        {
            //同步代码块
            synchronized (obj) {
                //先判断票是否存在
                if (ticket > 0) {

                    //提高安全问题出现的概率，让程序睡眠
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    //票存在，卖票 ticket--
                    System.out.println(Thread.currentThread().getName() + "--->正在卖第" + ticket + "张票");
                    ticket--;
                }
            }
        }
    }
}
