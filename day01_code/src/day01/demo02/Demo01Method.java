package day01.demo02;
/** 方法定义格式：
* public static void 方法名称()
* {
*       方法体
* }
*
* 调用格式：
* 方法名称();
*
* 注意事项：
* 1.方法定义的先后顺序无所谓
* 2.方法定义不能嵌套，并联
* */
public class Demo01Method {
    public static void main(String[] args) {
        printMethod();
    }
    public static void printMethod()
    {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
