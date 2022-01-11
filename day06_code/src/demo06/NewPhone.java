package demo06;

public class NewPhone extends OldPhone{

    @Override
    public void show() {
        super.show();
        System.out.println("show the profi");
        System.out.println("show the name");
    }
}
