package demo02;

public class Demo03ArraySame {
    public static void main(String[] args) {
        int[] arrayA = new int[3];//动态初始化

        System.out.println(arrayA);//地址值 ==> [I@7dc36524
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);
        System.out.println("==========");

        arrayA[1] = 10;
        arrayA[2] = 20;
        System.out.println(arrayA);//地址值 ==> [I@7dc36524
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);
        System.out.println("==========");

        //将arrayA数组的地址值，赋值给arrayB数组，在堆中不需要重新开辟一片空间
        int[] arrayB = arrayA;//动态初始化

        System.out.println(arrayB);//地址值 ==> [I@7dc36524
        System.out.println(arrayB[0]);
        System.out.println(arrayB[1]);
        System.out.println(arrayB[2]);
        System.out.println("==========");

        arrayB[1] = 100;
        arrayB[2] = 200;
        System.out.println(arrayB);//地址值 ==> [I@7dc36524
        System.out.println(arrayB[0]);
        System.out.println(arrayB[1]);
        System.out.println(arrayB[2]);
        
    }
}
