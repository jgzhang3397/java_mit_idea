package demo07Integer;

import java.util.ArrayList;

/**
 * 自动装箱与自动拆箱：
 *      基本类型的数据和包装类之间可以自动的相互转换
 *      JDK1.5之后出现的新特性
 */
public class Demo02Integer {

    public static void main(String[] args) {
        /*
    自动装箱：直接把int类型的整数赋值给包装类
    Integer int1 = 1; 就相当于 Integer int1 = new Integer(1)

     */
        Integer int1 = 1;

    /*
    自动拆箱：int1是包装类，无法直接参与运算，可以自动转换为基本类型的数据，再参与计算
    int1 + 2; 就相当于int1.intValue() + 3 = 3;
    int1 = int1 + 2; 就相当于int1 = new Integer(3) 自动装箱
     */
        int1 = int1 + 1;
        System.out.println(int1);

        //ArrayList集合无法直接存储整数，可以存储Integer包装类
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);//自动装箱 list.add(new Integer(1));

        //Integer a = list.get(0);
        int /* Integer */ a = list.get(0); //自动拆箱 list.get(0).intValue();
    }
}
