package demo06;

public class Demo01Phone {

    public static void main(String[] args) {
        OldPhone oldPhone = new OldPhone();
        oldPhone.show();
        oldPhone.call();
        oldPhone.send();

        System.out.println("============");

        NewPhone newPhone = new NewPhone();
        newPhone.show();
        newPhone.call();
        newPhone.send();
    }
}
