package demo01;
/*
java.lang.String代表字符串
    程序中所有双引号字符串都是String类的对象
    字符串特点：
        字符串内容不可改变
        字符串可共享使用
        字符串效果相当于char[]字符数组，但底层是byte[]字节数组
    字符串的三种构造方法：
        1.public String():创建空白数组，不含任何内容
        2.public String(char[] array):根据字符数组的内容来创建对应的字符串
        3.public String(byte[] array):根据字节数组的内容来创建对应的字符串
        直接创建：
        String str = "hello";//右边直接用双引号

 */
public class Demo01String {
    public static void main(String[] args) {
        //1.
        String str1 = new String();
        System.out.println("String1: "+ str1);

        //2.
        char[] charArr = {'A', 'B', 'C'};
        String str2 = new String(charArr);
        System.out.println("String2: " + str2);

        //3.
        byte[] byteArr = {97, 98, 99};
        String str3 = new String(byteArr);
        System.out.println("String3: " + str3);

    }
}
