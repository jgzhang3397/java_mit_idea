package day01.demo03;
/*
注意事项：
    1.不能嵌套
    2.顺序无所谓
    3.方法需要调用才能进行
    4.return 返回值
    5.返回值类型要对应
    6.void 方法，只能return；或者不写
    7.一个方法可以有多个return，但同时只能一个可以执行
 */
public class Demo04MethodNotice {
    public static void main(String[] args) {

    }
    //6. ...
    public static void method01(){
        return;
    }
    public static void method02(){
        ;
    }
    //7. ...
    public static int getMax(int x, int y)
    {
        if(x > y){
            return x;
        }else {
            return y;
        }
    }

}
