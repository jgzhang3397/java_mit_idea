package demo02;

public class Demo05PhoneReturn {
    public static void main(String[] args) {
        Phone ip = getPhone();
        System.out.println(ip.brand);
        System.out.println(ip.price);
        System.out.println(ip.color);
    }
    public static Phone getPhone(){
        Phone ip = new Phone();
        ip.brand = "iphone";
        ip.price = 8388.0;
        ip.color = "rosagold";
        return ip;
    }

}
