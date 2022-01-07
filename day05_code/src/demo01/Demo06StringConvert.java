package demo01;
/*
String中与转换相关的方法：
    1.public char[] toCharArray():将当前字符串拆分字符数组作为返回值
    2.public byte[] getBytes(): 获取当前字符串的底层字节数组
    3.public String replace(CharSequence oldString, CharSequence newString):
        将所有出现的老字符串替换成新字符串，返回替换后的结果新字符串
 */
public class Demo06StringConvert {
    public static void main(String[] args) {
        //1.
        String str1 = "Hello";
        char[] chars = str1.toCharArray();
        System.out.println(chars.length);//5
        System.out.println(chars[1]);//e
        System.out.println("==============");

        //2.
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("==============");

        //3。
        String lang1 = "你妈逼的，操你妈逼 傻逼东西";
        String lang2 = lang1.replace("妈逼","**");
        lang2 = lang2.replace("傻逼","**");
        lang2 = lang2.replace("操","*");
        System.out.println(lang2);//你**的，*你** **东西



    }
}
