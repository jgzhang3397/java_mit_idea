package day01.demo02;
/*
void 方法：
        1.有参数：
        2.无参数：
 */
public class Demo03MethodParam {
    public static void main(String[] args) {
        method01(10,5);
    }
    //1.有参数：
    public static void method01(int x, int y){
        int result = x * y;
        System.out.println("Result = : "+result);
        method02();
    }
    //2.无参数：
    public static void method02()
    {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World" + i);
        }
    }
}
