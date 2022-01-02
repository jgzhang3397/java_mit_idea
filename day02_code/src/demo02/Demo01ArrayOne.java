package demo02;
/*
栈（Stack）：
    -->进栈（Stack）：
            int[] array
                  地址值：0x666 赋值到 int[] array 中
                        System.out.println(array);//地址值 ==> [I@7dc36524
                        array[0] --> 堆中的0
                        array[1] = 10 --> 将10通过栈进入堆 [1] --> 10
                        array[2] = 20 --> 将20通过栈进入堆 [2] --> 20
堆（Heap）：
    -->进栈（Stack）：
            new int[3] //三个空间 [0]       [1]     [2]
                       //其默认值：0         0       0
                       //其地址值：0x666
方法区（Method Area):
    public static void main(String[] args) --> 进栈（Stack)
 */
public class Demo01ArrayOne {
    public static void main(String[] args) {
        int[] array = new int[3];//动态初始化

        System.out.println(array);//地址值 ==> [I@7dc36524
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println("==========");

        //改变数组中元素的内容
        array[1] = 10;
        array[2] = 20;
        System.out.println(array);//地址值 ==> [I@7dc36524
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
    }
}
