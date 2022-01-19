package demo06;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃粑粑");
    }

    public void watchHome(){
        System.out.println("狗看家");
    }
}
