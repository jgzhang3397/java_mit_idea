package demo06;
/*
如何才能知道一个父类引用的对象 本来是一个什么子类？

格式：
    对象 instanceof 类名称
    这将会得到一个boolean值结果，也就是判断前面的对象能不能当作后面类型的实例
 */
public class Demo02Instanceof {

    public static void main(String[] args) {
        Animal animal = new Cat();//本来是一只猫
        animal.eat();//猫吃鱼

        //用子类特有方法，需要向下转型
        //判断animal是不是cat
        if(animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.catchMouse();//猫抓老鼠
        }
        //判断animal是不是dog
        if(animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.watchHome();
        }

        giveMeAPet(new Dog());
    }

    public static void giveMeAPet(Animal animal){
        if(animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }else if(animal instanceof Dog){//不能只用else 三个以上子类不适用
            Dog dog = (Dog) animal;
            dog.watchHome();
        }
    }
}
