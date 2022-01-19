package demo07;

public class Laptop {

    public void powerOn(){
        System.out.println("Laptop power on");
    }

    public void powerOff(){
        System.out.println("Laptop power off");
    }

    //使用USB设备的方法，使用接口作为方法的参数
    public void useDevice(USB usb){
        usb.open();//打开设备
        if(usb instanceof Mouse){
            Mouse mouse = (Mouse) usb;//向下转型
            mouse.click();
        }else if(usb instanceof Keyboard){//先判断
            Keyboard keyboard = (Keyboard) usb;//向下转型
            keyboard.type();;
        }
        usb.close();//关闭设备
    }
}
