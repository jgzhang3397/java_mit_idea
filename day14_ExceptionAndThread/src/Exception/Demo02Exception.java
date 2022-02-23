package Exception;

/**
 * 异常的产生解析（分析异常是怎么产生的，如何处理异常）
 * step1:
 *  访问了数组中的3索引二数组不存在，JVM就会检测出程序异常：
 *      JVM：
 *          1. JVM根据异常产生的原因创建一个异常对象，这个异常对象包含了异常产生的（内容，原因，位置）
 *              new ArrayIndexOutOfBoundsException("3");
 *          2. 在getElement方法中，没有异常处理逻辑(try...catch)，JVM就会把异常对象抛给方法的调用者main处理
 *
 * step2:
 *  main方法接收到了这个异常对象，main方法也没有异常的处理逻辑，继续把对象抛给main方法的调用者JVM处理
 *
 * step3:
 *  JVM收到了这个异常对象，做了两件事情：
 *      1. 把异常对象(内容，原因，位置)以红色字体打印在控制台
 *      2. JVM会终止当前正在执行的java程序--> 中断处理
 *
 */
public class Demo02Exception {

    public static void main(String[] args) {
        //创建int类型的数组，并赋值
        int[] arr = {1,2,3};
        int e = getElement(arr, 3);
        System.out.println(e);
    }

    /*
        定义一个方法，获取数组指定索引处的元素
        参数：
            int[] arr
            int index
     */
    public static int getElement(int[] arr, int index){
        int ele = arr[index];
        return ele;
    }
}
