package demo06;

public class Demo01Main {

    public static void main(String[] args) {
        //对象的向上转型 就是： 父类引用指向子类对象
        Animal animal = new Cat();
        animal.eat();
    }
}
