package demo02_setThreadName;

public class Demo1SetThreadName {

    public static void main(String[] args) {
        //开启多线程
        MyThread myThread = new MyThread();
        myThread.setName("leo");
        myThread.start();

        //开启多线程
        new MyThread("lukas").start();
    }
}
