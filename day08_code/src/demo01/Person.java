package demo01;
/*
对于成员变量来说，如果使用final关键字修饰，这个变量也照样是不可变的

1.由于成员变量有默认值，使用final后必须手动赋值，不再给默认值了
2.对于final的成员变量，要么直接赋值，要么使用构造方法赋值，二者选其一
3.必须保证类中的所以重载的构造方法，都最终会对final的成员变量进行赋值
 */
public class Person {

    private final String name /* = "Snowyball"*/ ;

    public Person() {
        this.name = "Snowy";
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
}
