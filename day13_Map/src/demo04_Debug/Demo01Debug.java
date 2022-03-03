package demo04_Debug;
/**
 * Debug调试程序：
 *      可以让代码逐行指向，查看代码执行的过程，调试程序中出现的bug
 * 使用方式：
 *      在行号的右边，鼠标左键单击，添加断点(每个方法的第一行，哪里有bug添加到哪里)
 *      右键，选择debug执行
 * 执行程序：
 *      f8：逐行执行程序 step over
 *      f7: 进入到方法中 step into
 *      shift + f8：跳出方法 step out
 *      resume program: 跳到下一个断点，如果没有下一个断点，那么就结束程序
 *      command + f2 : 退出debug模式，stop
 *      Console:切换到控制台
 */
public class Demo01Debug {

    public static void main(String[] args) {
        /*int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);*/

        /*for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }*/

        print();
    }

    private static void print() {
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
    }
}
