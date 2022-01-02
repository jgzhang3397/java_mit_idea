package demo03;
/*
求一个数组中的最小元素
 */
public class Demo06ArrayMin {
    public static void main(String[] args) {
        int[] array = {101,25,34,490};
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i]<min){
                min = array[i];
            }
        }
        System.out.println("Min: = "+min);
    }
}
