package demo06;
/*
向上转型一定是安全的，没有问题，正确的，但是有一个弊端：
    对象一旦向上转型为父类，就无法调用子类原本特有的内容

    解决方案：
        用对象的向下转型来还原
 */
public class Demo01Main {

    public static void main(String[] args) {
        //对象的向上转型 就是： 父类引用指向子类对象
        Animal animal = new Cat();//本来创建的是一只猫
        animal.eat();//猫吃鱼

//        animal.catchMouse();//错误写法

        //向下转型，进行还原动作
        Cat cat = (Cat) animal;
        cat.catchMouse();//猫抓老鼠

        //下面是错误的向下转型
        //本来new的是一只猫，现在非要当成狗
        //错误写法！编译不会报错，但是运行会出现异常
        //java.lang.ClassCastException 类转换异常
        //解决方法：
        Animal animal1 = new Dog();
        Dog dog = (Dog) animal1;
        dog.watchHome();
    }
}
