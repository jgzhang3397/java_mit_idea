package demo06_threadSafe.Solution02_Syn_Method;

/**
 * 解决线程安全问题的第二种方法，使用同步方法
 *
 * 使用步骤：
 *      1.把访问了共享数据的代码抽取出来，放到一个方法中
 *      2.在方法上添加synchronized修饰符
 *
 * 格式：
 *      定义方法的格式
 *
 *      修饰符 synchronized 返回值类型 方法名(参数列表){
 *          可能会出现线程安全问题的代码(访问了共享数据的代码)
 *      }
 *
 */
public class RunnableImpl implements Runnable{
    //定义一个多线程的票源
    private int ticket = 100;

    //设置线程任务：买票
    @Override
    public void run() {
        System.out.println("this: "+this);
        //使用while循环，让卖票操作重复进行
        while (true)
        {
            payTicket01();
            //payTicket02();
        }
    }

    /*
        定义一个同步方法
        同步方法也会把方法内部的代码锁住
        只让一个线程执行
        同步方法的锁的对象是谁？
        就是实现类对象 new RunnableImpl()
        也就是this
     */
    public /*synchronized*/ void payTicket01(){
        synchronized (this){
            //先判断票是否存在
            if (ticket > 0) {

                //提高安全问题出现的概率，让程序睡眠
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //票存在，卖票 ticket--
                System.out.println(Thread.currentThread().getName() + "--->正在卖第" + ticket + "张票");
                ticket--;
            }
        }
    }

    public synchronized void payTicket02(){
        //先判断票是否存在
        if (ticket > 0) {

            //提高安全问题出现的概率，让程序睡眠
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //票存在，卖票 ticket--
            System.out.println(Thread.currentThread().getName() + "--->正在卖第" + ticket + "张票");
            ticket--;
        }
    }


}
