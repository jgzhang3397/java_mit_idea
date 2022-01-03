package demo03;

public class Demo03Person {
    public static void main(String[] args) {
        Person person = new Person();
//        System.out.println(person.show());
        person.show();

        person.name = "Snowy";
//        person.age = 18;
        person.setAge(20);
        person.show();
    }
}
