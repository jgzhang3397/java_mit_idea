package demo02;

public class Demo01PhoneOne {
    public static void main(String[] args) {
        //创建对象
        //类名称 对象名 = new 类名称（）；
        Phone ip = new Phone();
        System.out.println(ip.brand);//null
        System.out.println(ip.price);//0.0
        System.out.println(ip.color);//null
        System.out.println("===============");

        ip.brand = "iphone";
        ip.price = 8388.0;
        ip.color = "black";
        System.out.println(ip.brand);
        System.out.println(ip.price);
        System.out.println(ip.color);
        System.out.println("================");

        ip.call("Anna");
        ip.sendMessage(3, "Snowy");

    }
}
