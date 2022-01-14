package demo13;
//子类也是抽象类
public abstract class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("狗吃热肉");
    }

//    @Override
//    public void sleep() {
//
//    }
}
