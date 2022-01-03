package demo03;
/*
问题描述：
    定义Person的年龄时，无法阻止不合理的数被设置进来，比如 age = -20；
    解决办法：
        使用private关键字将需要保护的成员变量进行修饰
注意事项：
    使用private关键字后，在本类中随意访问
    但是超过了本类范围内就不能直接访问

间接访问private成员变量：Getter 和 Setter方法要定义
    注意事项：
        书写规格：setXxx 和 getXxx
        对于Getter：不能有参数，返回值类型和成员变量对应
        对应Setter：不能有返回值：参数类型和成员变量对应
 */
public class Person {

    String name;
    private int age;

    public void show(){
        System.out.println("Mein Name ist: "+name);
        System.out.println("Ich bin "+ age + " Jahre alt.");
    }

    //这个成员方法，专门用于向age设置数据,可用判断其大小，使其成为合理数据
    public void setAge(int num){
        if(num<100 && num>=0){
            age = num;
        }else{
            System.out.println("error!");
        }
    }
    public int getAge(){
        return age;
    }
}
