package demo04;

public class Demo02Student {
    public static void main(String[] args) {
        Student stu1 = new Student("lena", 29);//有参
        Student stu2 = new Student();//无参数
        System.out.println("Name: "+ stu1.getName() +", age =: "+ stu1.getAge());
        System.out.println("====================");

        stu2.setName("Lena");
        stu2.setAge(19);
        System.out.println("Name: "+ stu2.getName() +", age =: "+ stu2.getAge());
        System.out.println("====================");

        stu1.setName("Lukas");
        stu1.setAge(99);
        System.out.println("Name: "+ stu1.getName() +", age =: "+ stu1.getAge());
    }
}
