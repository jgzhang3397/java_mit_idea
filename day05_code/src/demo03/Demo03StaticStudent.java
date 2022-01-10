package demo03;

public class Demo03StaticStudent {
    public static void main(String[] args) {
        Student.room = "E101";

        Student one = new Student("Leo", 30);
        Student two = new Student("Lukas", 32);

        System.out.println("Name: "+ one.getName());
        System.out.println("Age: "+ one.getAge());
        System.out.println("Classroom: "+ Student.room);

        System.out.println("=======================");

        System.out.println("Name: "+ two.getName());
        System.out.println("Age: "+ two.getAge());
        System.out.println("Classroom: "+ Student.room);
    }
}
