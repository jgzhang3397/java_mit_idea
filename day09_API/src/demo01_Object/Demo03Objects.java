package demo01_Object;

import java.util.Objects;

public class Demo03Objects {

    public static void main(String[] args) {
        //String st1 = "abc";
        String st1 = null;
        String st2 = "aaa";

//        boolean equals = st1.equals(st2);//NullPointerException null不能调用方法，抛出空指针异常
//        System.out.println(equals);

        /**
         * Objects类的equals方法：对两个对象进行比较，防止空指针异常
         *      public static boolean equals(Object a, Object b) {
         *         return (a == b) || (a != null && a.equals(b));
         *      }
         *
         *
         */
        boolean equals = Objects.equals(st1, st2);
        System.out.println(equals);
    }
}
