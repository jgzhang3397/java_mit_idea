package demo04;

public class Demo01Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Papa";
        person.sayHello("du");

        System.out.println(person);//地址值
    }
}
