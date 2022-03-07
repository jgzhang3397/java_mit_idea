package demo07_WaitAndNotify;

/**
 * 进入到TimeWaiting(计时等待)有两种方式
 *      1.使用sleep(long m)方法，在毫秒值结束之后，线程睡醒进入到Runnable/Blocked状态
 *      2.使用wait(long m)方法，在wait方法如果在毫秒值结束之后，还没有被notify唤醒，就会自动醒来
 *        线程睡醒进入到Runnable/Blocked状态
 *
 *   唤醒的方法：
 *      void notify() 唤醒在此对象监视器上等待的单个线程
 *      void notifyAll() 唤醒在此对象监视器上等待的多个线程
 */
public class Demo02WaitAndNotify {

    public static void main(String[] args) {
        //创建锁对象，保证唯一
        Object obj = new Object();

        //创建一个顾客线程(消费者)
        new Thread() {
            @Override
            public void run() {
                //死循环
                while (true) {
                    //保证等待和唤醒的线程只能有一个执行，需要使用同步技术
                    synchronized (obj) {
                        System.out.println("顾客1告诉老板要的包子的种类和数量：");

                        //调用wait方法，放弃cpu执行，进入到waiting状态(无限等待)
                        try {
                            //obj.wait(5000);
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //唤醒之后的代码


                        System.out.println("顾客1的包子已经做好了，开吃！");

                        System.out.println("======================\n");
                    }
                }
            }
        }.start();

        //创建一个顾客线程(消费者)
        new Thread() {
            @Override
            public void run() {
                //死循环
                while (true) {
                    //保证等待和唤醒的线程只能有一个执行，需要使用同步技术
                    synchronized (obj) {
                        System.out.println("顾客2告诉老板要的包子的种类和数量：");

                        //调用wait方法，放弃cpu执行，进入到waiting状态(无限等待)
                        try {
                            //obj.wait(5000);
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //唤醒之后的代码


                        System.out.println("顾客2包子已经做好了，开吃！");
                        System.out.println("====================\n");
                    }
                }
            }
        }.start();


        //创建老板的线程(生产者)
        new Thread(){
            @Override
            public void run() {
                while (true){
                    //花了5s做包子
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    //保证等待和唤醒的线程只能有一个执行，需要使用同步技术
                    synchronized (obj){
                        System.out.println("老板做好包子了，顾客来吃包子喽！");
                        //调用notify方法, 唤醒顾客吃包子
                        //obj.notify();//如果有多个等待线程，随机唤醒一个
                        obj.notifyAll();//唤醒所有等待的线程
                    }
                }
            }
        }.start();
    }
}
