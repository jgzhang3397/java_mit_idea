package demo04;
/*
当方法的局部变量和类的成员变量重名时，根据就近原则，优先使用局部变量
如果需要访问本类的成员变量，需要使用格式：
    this.成员变量名

    通过谁调用的方法，谁就是this
 */
public class Person {
    String name;//mein Name..

    //参数name是对方的名字
    //成员变量name是自己的名字 this.name
    public void sayHello(String name){
        System.out.println("Hello "+ name+", Mein Name ist : " + this.name);

        System.out.println(this);//地址值
    }

}
