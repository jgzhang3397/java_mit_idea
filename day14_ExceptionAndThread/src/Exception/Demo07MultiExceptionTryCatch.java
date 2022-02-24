package Exception;

import java.util.List;

/**
 * 多个异常使用捕获又该如何处理
 * 1.多个异常分别处理
 * 2.多个异常一次捕获，多次处理
 * 3.多个异常一次捕获一次处理
 */

public class Demo07MultiExceptionTryCatch {
    public static void main(String[] args) {
        //1.多个异常分别处理
        //Test01();

        //2.多个异常一次捕获，多次处理
        //Test02();

        //3.多个异常一次捕获一次处理
        Test03();

    }

    private static void Test03() {

        try{
            int [] arr = {1, 2, 3};
            System.out.println(arr[3]);//ArrayIndexOutOfBoundsException

            List<Integer> list = List.of(1,2,3);
            System.out.println(list.get(3));//ArrayIndexOutOfBoundsException
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    private static void Test02() {

        /*
            一个try多个catch注意事项：
                catch 里面定义的异常变量，如果有子父类关系，那么子类的异常变量必须写在上面，否则就会报错
                ArrayIndexOutOfBoundsException extends IndexOutOfBoundsException
         */
        try{
            int [] arr = {1, 2, 3};
            System.out.println(arr[3]);//ArrayIndexOutOfBoundsException

            List<Integer> list = List.of(1,2,3);
            System.out.println(list.get(3));//ArrayIndexOutOfBoundsException
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }

    }

    public static void Test01(){

        try{
            int [] arr = {1, 2, 3};
            System.out.println(arr[3]);//ArrayIndexOutOfBoundsException
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }

        try{
            List<Integer> list = List.of(1,2,3);
            System.out.println(list.get(3));//ArrayIndexOutOfBoundsException
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }

    }
}
