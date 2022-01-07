package demo01;
/*
字符串的截取方法：
    public String substring(int index): 截取从参数位置到字符串末尾，返回新字符串
    public String substring(int begin, int end): 截取 begin 和 end 中间的字符串
    备注：[begin end),包含左边 不包含右边
 */
public class Demo05SubString {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String substring = str1.substring(3);
        System.out.println(substring);//lo World
        System.out.println(str1);//Hello World

        String substring1 = str1.substring(4, 8);
        System.out.println(substring1);//o Wo

        /*
        下面这种写法字符串内容仍没有改变
        strA保存的是地址值
        本来是Hello的0x666
        后来变成Java的0x999
         */
        String strA = "Hello";
        System.out.println(strA);//Hello
        strA = "Java";
        System.out.println(strA);//Java

    }
}
