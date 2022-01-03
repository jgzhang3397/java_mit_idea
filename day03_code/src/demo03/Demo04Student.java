package demo03;

public class Demo04Student {
    public static void main(String[] args) {
        Student student = new Student();

        student.setName("Anna");
        student.setAge(19);
        student.setMale(false);

        System.out.println("Name : "+ student.getName());
        System.out.println("Age : "+ student.getAge());
        System.out.println("Is man? --> "+ student.isMale());
    }
}
