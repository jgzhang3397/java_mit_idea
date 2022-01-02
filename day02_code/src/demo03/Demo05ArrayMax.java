package demo03;
/*
求一个数组中的最大元素
 */
public class Demo05ArrayMax {
    public static void main(String[] args) {
        int[] array = {101,25,34,490};
//        int max = 0;
//        for (int i = 0; i < array.length-1; i++) {
//            if(array[i]>array[i+1]){
//                max = array[i];
//            }else{
//                max = array[i+1];
//            }
//        }
        //Optimierung
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i]>max){
                max = array[i];
            }
        }
        System.out.println("Max: = "+max);
    }
}
