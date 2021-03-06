package demo06_threadSafe.Solution03_Syn_StaticMethod;

/**
 * 解决线程安全问题的第三种方法，使用静态同步方法
 *
 * 使用步骤：
 *      1.把访问了共享数据的代码抽取出来，放到一个方法中
 *      2.在方法上添加synchronized修饰符
 *
 * 格式：
 *      定义方法的格式
 *
 *      修饰符 static synchronized 返回值类型 方法名(参数列表){
 *          可能会出现线程安全问题的代码(访问了共享数据的代码)
 *      }
 *
 */
public class RunnableImpl implements Runnable{
    //定义一个多线程的票源
    //方法是静态的，变量也得是静态的
    private static int ticket = 100;

    //设置线程任务：买票
    @Override
    public void run() {
        System.out.println("this: "+this);
        //使用while循环，让卖票操作重复进行
        while (true)
        {
            payTicketStatic();
        }
    }

    /*
        静态同步方法
        锁对象是谁？
        不能是this
        this是创建对象之后产生的，静态方法优先于对象
        静态方法的锁对象是本类的class属性--> class文件对象(反射)
     */
    public static /*synchronized*/ void payTicketStatic(){
        synchronized (RunnableImpl.class) {
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
}
