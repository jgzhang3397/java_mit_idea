package demo05;

import java.util.ArrayList;

/*
题目：
    自定义4个学生对象，添加到集合，并遍历
        思路：
            1.自定义Student学生类，四个部分
            2.创建一个集合，用来存储学生对象。泛型<student>
            3.根据类，创建4个学生对象
            4.将四个学生对象添加到集合中：add
            5.遍历集合：for size get
 */
public class Demo02ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> stu = new ArrayList<>();

        //自定义四个学生对象
        Student one = new Student("Tina", 22);
        Student two = new Student("Luna", 19);
        Student three = new Student("Lukas", 18);
        Student four = new Student("Sonja", 17);

        stu.add(one);
        stu.add(two);
        stu.add(three);
        stu.add(four);

        for (int i = 0; i < stu.size(); i++) {
//            System.out.println(stu.get(i));
            Student student = stu.get(i);
            System.out.println("Name: "+ student.getName()+" ist "+ student.getAge() + " alt.");
        }


    }
}
