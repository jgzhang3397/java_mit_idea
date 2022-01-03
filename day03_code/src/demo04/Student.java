package demo04;
/*
构造方法是专门用来创建对象的方法，当我们通过关键字new来创建对象时，就是在调用构造方法
格式：
    public 类名称（参数类型 参数名称）{
        方法体
    }
注意事项：
    1.构造方法的名称必须和所在的类名称完全一样，包括大小写
    2.构造方法不要写返回值，包括void
    3.构造方法不能return返回值
    4.如果没有编写构造方法，编译器默认一个构造方法，没有参数
        public Student(){}
    5.一旦编写至少一个构造方法，编译器不再产生默认构造方法
    6.构造方法也可用重载
        重载：方法名称相同，参数列表不同
 */
public class Student {
    private String name;
    private int age;
    public Student (){
        System.out.println("无参数构造方法实现");
    }
    public Student(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("全参构造方法实现");
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}
