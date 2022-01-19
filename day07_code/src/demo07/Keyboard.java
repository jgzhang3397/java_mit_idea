package demo07;

public class Keyboard implements USB{
    @Override
    public void open() {
        System.out.println("open Keyboard");
    }

    @Override
    public void close() {
        System.out.println("close Keyboard");
    }

    public void type(){
        System.out.println("keyboard type");
    }
}
