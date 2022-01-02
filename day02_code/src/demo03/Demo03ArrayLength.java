package demo03;
/*
获取数组的长度：
    数组名称.length
 */
public class Demo03ArrayLength {
    public static void main(String[] args) {
        int[] arrayA = new int[3];

        int[] arrayB = {1,2,3,4,5,6,7,8,9,0};
        int len = arrayB.length;
        System.out.println("Length des ArrayB : "+ len);

        System.out.println("==========================");
        int[] arrayC = new int[3];
        System.out.println(arrayC.length);
        arrayC = new int[5];
        System.out.println(arrayC.length);
    }
}
