package demo02;
/*
在父子类的继承关系中，如果成员变量重名，则创建子类对象时，两种访问方式：
    直接通过子类对象访问成员变量:
        等号左边是谁，就优先用谁，没有则向上找
    间接通过成员方法访问成员变量:
        该方法属于谁，就优先用谁，没有则向上找

 */
public class Demo01ExtendsField {

    public static void main(String[] args) {
        Father fa = new Father();//创建父类对象
        System.out.println(fa.numFa);//只能使用父类的东西，没有子类的内容

        Son son = new Son();
        System.out.println(son.numFa);//10
        System.out.println(son.numSon);//20
        System.out.println("================");

        //等号左边是谁，就优先用谁，没有则向上找
        System.out.println(son.numSame);//200
        System.out.println(son.numFa);//10
        System.out.println("================");

        //方法属于子类，优先用子类，没有再向上找
        son.methodSon();//200
        //方法属于父类
        son.methodFa();//100
    }
}
