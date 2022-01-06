package demo04;

import java.util.ArrayList;

/*
数组的长度不可以发生改变
但是ArrayList集合的长度可以随意改变

java.util.ArrayList<E>
<E>代表泛型
泛型：装在集合中的所有元素，全部都是统一的类型
注意：泛型只能是引用类型，不能是基本类型

注意事项：
    对于ArrayList集合来说，直接打印得到的不是地址值，而是内容
    如果内容为空，得到的是空的中括号：[]
 */
public class Demo02ArrayList {
    public static void main(String[] args) {
        //创建了一个ArrayList集合，集合名称是list，里面装的全部都是String字符串类型的数据
        //备注：从JDK1.7+开始，右侧的尖括号内部可以不写内容，但是<>本身还要写
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);//[]

        //向集合中添加数据，需要add方法
        list.add("Luna");
        System.out.println(list);//[Luna]

        list.add("Nina");
        list.add("Lukas");
        list.add("Leon");
        System.out.println(list);//[Luna, Nina, Lukas, Leon]
    }
}
