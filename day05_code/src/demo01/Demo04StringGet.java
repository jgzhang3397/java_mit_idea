package demo01;
/*
String中与获取相关的方法：
    1. public int length(): 获取当前字符串长度
    2. public String concat (String str):将当前字符串与参数字符串拼接并返回
    3. public char charAt(int index): 获取指定索引位置的单个字符（从0开始）
    4. public int indexOf(String str): 查找参数字符串在原本字符串第一次出现的索引位置，如果根本没有返回-1
 */
public class Demo04StringGet {
    public static void main(String[] args) {
        //1.
        int length = "ahhdccdbjsbcbdubcb".length();
        System.out.println("length = " + length);
        System.out.println("==============");
        //2.
        String str1 = "Hello ";
        String str2 = "World";
        String str3 = str1 + str2;
        String str4 = str1.concat(str2);
        System.out.println(str1);//Hello
        System.out.println(str2);//World
        System.out.println(str3);//Hello World
        System.out.println(str4);//Hello World
        System.out.println("=================");

        //3.
        char ch = "hello".charAt(1);
        System.out.println(ch);
        System.out.println("=================");

        //4.
        int index = "HelloWorldHelloWorld".indexOf("llo");//2
        System.out.println(index);

        String string = "abc";
        System.out.println(string.indexOf("hello"));//-1

    }
}
