package demo01;
/*
分割字符串的方法：
    public String[] split(String regex): 按照参数的规则，将字符串切割成若干部分
注意事项：
    split方法的参数是一个"正则表达式"。regular expression
    如果按照'.'进行切割，需要固定表达式'\\.'
 */
public class Demo07StringSplit {
    public static void main(String[] args) {
        String str1 = "aaa,bbb,ccc";
        String[] arrays1 = str1.split(",");
        for (int i = 0; i < arrays1.length; i++) {
            System.out.println(arrays1[i]);
        }
        System.out.println("=================");

        String str2 = "aaa bbb ccc";
        String[] arrays2 = str2.split(" ");
        for (int i = 0; i < arrays2.length; i++) {
            System.out.println(arrays2[i]);
        }
        System.out.println("=================");

        String str3 = "xxx.yyy.zzz";
        String[] arrays3 = str3.split("\\.");
        for (int i = 0; i < arrays3.length; i++) {
            System.out.println(arrays3[i]);
        }
    }
}
