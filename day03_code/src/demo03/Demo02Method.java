package demo03;
/*
面向对象：封装， 继承， 多态

    封装：
        1. 方法就是一种封装
        2. 关键词private也是中封装
 */
public class Demo02Method {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int max = getMax(array);
        System.out.println("Max in array: "+max);

    }
    //封装
    public static int getMax(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i]>max){
                max = array[i];
            }
        }
        return max;
    }
}
