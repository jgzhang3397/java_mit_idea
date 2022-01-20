package demo01_Object;

import java.util.Random;

public class Demo02Equals {

    public static void main(String[] args) {
        /**
         * Person类默认继承了Object类，所以可以使用Object类的equals方法
         * boolean equals(Object obj) 指示其他某个对象是否与此对象"相等.
         *
         * Object类equals方法的源码：
         *      public boolean equals(Object obj) {
         *              return (this == obj);
         *      }
         *      参数：
         *          Object obj：可以传递任意的对象
     *          方法体：
         *          ==： 比较运算符，返回的就是一个布尔值 true，false
         *          基本数据类型： 比较的是值
         *          引用数据类型： 比较的是两个对象的地址值
     *          this? 哪个对象调用的方法，方法中的this就是那个对象；p1调用的equals方法，所以this==p1
     *          obj？传递过来的参数p2
     *          this == obj --> p1 == p2

         */
        Person p1 = new Person("Lukas", 15);
        Person p2 = new Person("Lukas", 15);
       // Person p2 = new Person("Anna", 21);

        System.out.println(p1);//demo01_Object.Person@35bbe5e8
        System.out.println(p2);//demo01_Object.Person@2c8d66b2

        //p1 = p2; //把p2的地址值赋给p1
        boolean equals = p1.equals(p2);
        System.out.println(equals);//false | true
        System.out.println("====================");

        //特殊情况，优化代码，增加效率
        Random random = new Random();
        boolean equals1 = p1.equals(null);
        //boolean equals1 = p1.equals(p1);
        //boolean equals1 = p1.equals(random);
        System.out.println(equals1);//false

    }
}
