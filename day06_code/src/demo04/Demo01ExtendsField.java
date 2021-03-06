package demo04;
/*
在父子类的继承关系中，创建子类对象，访问成员方法的规则：
    创建的对象是谁，就优先用谁，如果没有则向上找

重写（Override）
概念：在继承关系中，方法的名称一样，参数列表也一样

重写（Override）： 方法名称一样，参数列表 也一样, 覆盖，覆写
重载（Overload）: 方法名称一样，参数列表 不一样

方法的覆盖重写特点：创建的是子类对象，则优先用子类方法
 */
public class Demo01ExtendsField {

    public static void main(String[] args) {
        Son son = new Son();

        son.methodSon();
        son.methodFa();

        //创建的是new了子类对象，所以优先用子类方法
        son.method();
    }
}
