package demo02;
/*
定义一个类，来模拟"手机"事物
    属性：品牌，价格，颜色
    行为：打电话，发短信
对应到java类中
    成员变量（属性）：
        String brand;
        double price;
        String color;
    成员方法（行为）：
        public void call(String who){}
        public void sendMessage(int num, String who){}
 */
public class Phone {
    //成员变量（属性）：
    String brand;
    double price;
    String color;

    //成员方法（行为）：
    public void call(String who){
        System.out.println("Call to "+ who);
    }
    public void sendMessage(int num, String who){
        System.out.println("Send "+ num + " messages to "+ who);
    }
}
