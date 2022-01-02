package demo01;
/*
访问数组元素的格式：数组名称[索引值]
                索引值从0开始，一直到数组长度-1结束
 */
public class Demo03ArrayUse {
    public static void main(String[] args) {
        //静态初始化的省略格式
        int[] array = {10,20,30};

        //直接打印数组名称，得到的是数组对应的：内存地址哈希值
        System.out.println(array);//[I@7dc36524

        //直接访问
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println("===================");

        //间接访问，将其交给变量
        int num = array[1];
        System.out.println(num);
    }
}
