package demo04;
/*
题目：
    定义一个数组，用来存储3个Person对象
 */
public class Demo01Array {
    public static void main(String[] args) {
        // 创建一个长度为3的数组，存放Person类的对象
        Person[] array = new Person[3];
        //System.out.println(array[0]);

        Person one = new Person("Lukas", 20);
        Person two = new Person("Nina", 23);
        Person three = new Person("Luna", 24);

        //将one地址值赋值到数组9号元素位置
        array[0] = one;
        array[1] = two;
        array[2] = three;

//        System.out.println(one);
//        System.out.println(two);
//        System.out.println(three);
        System.out.println(array[1].getName());
    }
}
