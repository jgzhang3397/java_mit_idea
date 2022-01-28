package demo06StringBuilder;

/**
 * StringBuilder 和 String 可以相互转换：
 *      String->StringBuilder: 可以使用StringBuilder的构造方法
 *          StringBuilder(String str）构造一个字符串生成器，并初始化为指定的字符串内容
*       StringBuilder -> String: 使用StringBuilder 的 toString方法
 *          public String toString(): 将当前StringBuilder对象转换为String对象
 */
public class Demo03StringBuilderMethod {

    public static void main(String[] args) {
        //String -> StringBuilder
        String str = "hello";
        System.out.println("str: "+str);

        //向StringBuilder中添加数据
        StringBuilder bu = new StringBuilder(str);
        bu.append(" world");
        System.out.println("bu: " + bu);

        //StringBuilder -> String
        String string = bu.toString();
        System.out.println("s: " + string);

        //StringBuilder reserve();  反转内容
        bu.reverse();
        System.out.println("reverse_bu: "+ bu);
    }
}
