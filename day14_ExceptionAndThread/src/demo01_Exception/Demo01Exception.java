package demo01_Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.lang.Throwable类 是java 语言中所有错误或异常的超类
 *  Exception：编译期异常，进行编译（写代码） java程序出现的问题
 *      RuntimeException: 运行期异常，java程序运行过程中出现的问题
 *
 *      异常相当于程序的小毛病，把异常处理掉，程序可以继续执行
 *
 *  Error：相当于程序得了癌症无法治愈，必须修改源代码，人生重开
 */
public class Demo01Exception {

    public static void main(String[] args) /*throws ParseException*/ {
        //Test01();
        //Test02();
        Test03();
        System.out.println("Coding continue....");
    }

    public static void Test01(){
        // Exception：编译期异常，进行编译（写代码） java程序出现的问题
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//用来格式化日期
        Date date = null;//把字符串格式的日期，解析为Date格式的日期
        try {
            date = sdf.parse("2022-0223");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);
    }

    public static void Test02(){
        //RuntimeException: 运行期异常，java程序运行过程中出现的问题
        int[] arr = {1,2,3};
        try{
            //可能会出现异常的代码
            System.out.println(arr[3]);
        }catch (Exception e){

            //异常的处理逻辑
            System.out.println(e);
        }

    }

    public static void Test03(){
        //Error：错误
        /*
        示例：
            OutOfMemoryError: Java heap space
            内存溢出的错误，创建的数组太大了，超过了给JVM分配的内存
         */
        //int[] arr = new int[1024*1024*1024];

        //必须修改代码，即创建小的数组
        int[] arr = new int[1024*1024];
    }
}
