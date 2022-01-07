package demo01;
/*
1.对于引用类型来说 == 进行的是地址的比较
2.双引号直接写的字符串在常量池中，new的不在池当中
 */
public class Demo02String {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        char[] charArr = {'a', 'b', 'c'};
        String str3 = new String(charArr);

        System.out.println(str1 == str2);//true
        System.out.println(str1 == str3);//false
        System.out.println(str2 == str3);//false
    }
}
