package demo02;

public class Demo02ArrayTwo {
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

        int[] arrayB = new int[3];//动态初始化

        System.out.println(arrayB);//地址值 ==> [I@35bbe5e8
        System.out.println(arrayB[0]);
        System.out.println(arrayB[1]);
        System.out.println(arrayB[2]);
        System.out.println("==========");

        arrayB[1] = 100;
        arrayB[2] = 200;
        System.out.println(arrayB);//地址值 ==> [I@35bbe5e8
        System.out.println(arrayB[0]);
        System.out.println(arrayB[1]);
        System.out.println(arrayB[2]);

    }
}
