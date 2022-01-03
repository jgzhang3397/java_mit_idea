package demo02;

public class Demo02PhoneTwo {
    public static void main(String[] args) {
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
        System.out.println("===============");

        Phone op = new Phone();
        System.out.println(op.brand);//null
        System.out.println(op.price);//0.0
        System.out.println(op.color);//null
        System.out.println("===============");

        op.brand = "oppo";
        op.price = 3999.0;
        op.color = "pink";
        System.out.println(op.brand);
        System.out.println(op.price);
        System.out.println(op.color);
        System.out.println("================");

        op.call("Lukas");
        op.sendMessage(10, "Polizei");

    }
}
