package day01.demo02;
/*
方法就是若干语句的功能集合

参数：输入数据input
返回值：输出数据output

定义方法的完整格式：
修饰符 返回值类型 方法名称（参数类型，参数名称，...){
    方法体
    return 返回值
}
修饰符：public static
返回值类型：void, int...
方法名称: 小驼峰
参数类型：input的数据类型
参数名称：input的变量名称
ps: 参数如果有多个，使用逗号进行分隔
方法体：方法的内容
return:
    1.停止当前方法
    2.将其返回值还给调用处
返回值：output

注意：return 后的返回值，要注意方法的返回值类型，保持对应

z.B. 定义一个方法，使其两个int数字相加。三要素：
    返回值类型：int
    方法名称：add
    参数列表：int a, int b

方法的三种调用格式：
    单独调用：方法名称（参数）；
    打印调用：System.out.println(方法名称（参数））；
    赋值调用: 数据类型 变量名称 = 方法名称（参数）；
注意：
    void方法 只能单独调用！！
 */
public class Demo02MethodDefine {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //单独调用
        add(10, 20);
        System.out.println("=================");
        //打印调用
        System.out.println(add(10, 20));
        System.out.println("=================");
        //赋值调用
        int sum = add(a, b);
        System.out.println("Sum = "+sum);
    }
    public static int add(int x, int y) {
        int sum = x + y;
        return sum;
    }
}
