package demo01;
/*
==进行对象地址的比较，要是比较内容需要使用equals方法和equalsIgnoreCase方法：

public boolean equals(Object obj):参数可以是任何内容，只有参数是一个字符串且内容相同时才给true，否则给false

注意事项：
1.任何对象都能用Object接收
2.对称性：a.equals(b) == b.equals(a)
3.推荐常量在前，变量在后 如"abc".equals(str1);

public boolean equalsIgnoreCase(String string):忽略大小写，进行内容比较
 */
public class Demo03StringEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";

        char[] charArr = {'H','e','l','l','o'};
        String str3 = new String(charArr);

        System.out.println(str1.equals(str2));//true
        System.out.println(str1.equals(str3));//true
        System.out.println(str2.equals("Hello"));//true
        System.out.println("Hello".equals(str2));//true

        String str4 = "hello";
        System.out.println("Hello".equals(str4));//false
        System.out.println("==================");

        String str5 = null;
        //System.out.println(str5.equals("abc"));//不推荐 NullPointerException
        System.out.println("abc".equals(str5));//推荐
        System.out.println("=================");

        String strA = "Java";
        String strB = "java";
        System.out.println(strA.equalsIgnoreCase(strB));//true
        System.out.println(strA.equals(strB));//false
    }
}
