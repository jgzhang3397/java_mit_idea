package demo02;
/*
创建对象的标准格式：
    类名称 对象名 = new 类名称（）；
匿名对象就是只有右边的对象，没有左边的名字和赋值运算符
    使用建议：如果有个对象只需要使用一次，可以使用匿名对象
 */
public class Demo01Anonymous {
    public static void main(String[] args) {
        Person one = new Person();
        one.name = "Lukas";
        one.showName();
        System.out.println("============");

        //匿名对象 只能用一次
        new Person().name = "Snowy";
        new Person().showName();//null

    }
}
