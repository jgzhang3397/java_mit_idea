package demo02;

public class Demo04PhoneParam {
    public static void main(String[] args) {
        Phone ip = new Phone();
        ip.brand = "iphone";
        ip.price = 8388.0;
        ip.color = "gold";

        method(ip);
    }
    public static void method(Phone phone)
    {
        System.out.println(phone.brand);
        System.out.println(phone.price);
        System.out.println(phone.color);
    }

}
