package demo07;

public class DemoMain {

    public static void main(String[] args) {
        //首先创建一个笔记本电脑
        Laptop laptop = new Laptop();
        laptop.powerOn();

        //准备一个鼠标，供电脑使用
        //首先进行向上转型
        USB usbMouse = new Mouse();//多态写法
        //参数是USB类型 传递进行的就是USB鼠标
        laptop.useDevice(usbMouse);

        //创建一个USB键盘
        //不使用多态
        Keyboard keyboard = new Keyboard();
        laptop.useDevice(keyboard);//自动发生向上转型 Keyboard --> USB

        laptop.powerOff();
        System.out.println("================");

        //类比强制转换
        method(30.0);//double --> double
        method(30);//int --> double
        int a = 30;
        method(a);//int --> double
    }

    public static void method(double num){
        System.out.println(num);
    }
}
