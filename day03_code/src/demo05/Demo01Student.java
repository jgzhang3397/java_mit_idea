package demo05;

public class Demo01Student {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("Lukas");
        stu1.setAge(100);
        System.out.println("Name : "+stu1.getName()+" , Age : "+stu1.getAge());
        System.out.println("=====================");

        Student stu2 = new Student("Qiuqiu", 80);
        System.out.println("Name : "+ stu2.getName()+" , Age : "+ stu2.getAge());
        stu2.setAge(20);
        System.out.println("Name : "+ stu2.getName()+" , Age : "+ stu2.getAge());
    }
}
