package demo06_threadSafe.Safe_Problem;

/**
 * 实现买票案例
 *      线程安全问题解决：
 *          一个线程在访问共享数据时，其他线程只能等待
 *              线程同步机制：
 *                  1.同步代码块 Synchronized code block
 *                  2.同步方法
 *                  3.静态同步方法
 *                  4.Lock锁
 */
public class RunnableImpl implements Runnable{
    //定义一个多线程的票源
    private int ticket = 100;

    //设置线程任务：买票
    @Override
    public void run() {
        //使用while循环，让卖票操作重复进行
        while (true)
        {
            //先判断票是否存在
            if(ticket>0){

                //提高安全问题出现的概率，让程序睡眠
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //票存在，卖票 ticket--
                System.out.println(Thread.currentThread().getName()+"--->正在卖第"+ticket+"张票");
                ticket --;
            }
        }
    }
}
