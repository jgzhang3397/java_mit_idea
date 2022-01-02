package demo03;
/*
数组的反转：--> 对称位置交换
[1,2,3,4]
[4,3,2,1]
 */
public class Demo07ArrayReverse {
    public static void main(String[] args) {
        int[] array = {10,21,32,43,55,90,31};
        //遍历打印原数组
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        //换行
        System.out.println("");
        int min = 0;
        int max = array.length - 1;
        int temp = 0;
        /*
        初始化：int min = 0, max == array.length - 1;
        条件判断：min < max
        步进：min++, max--;
         */
        for (int i = 0; i < array.length; i++) {
            if (min < max) {
                temp = array[min];
                array[min] = array[max];
                array[max] = temp;
                min++;
                max--;
            }
            System.out.print(array[i]+" ");
        }
    }
}
