package demo13;

public class DemoMain {

    public static void main(String[] args) {
//        Animal animal = new Animal();//抽象类 不能直接new对象
//        Dog dog = new Dog();//也是抽象类

        DogGolden golden = new DogGolden();
        golden.eat();
        golden.sleep();
        System.out.println("============");

        DogWhite white = new DogWhite();
        white.eat();
        white.sleep();

    }
}
