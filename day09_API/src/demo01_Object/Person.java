package demo01_Object;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 直接打印对象的地址值没有意义，需要重写Object类的toString方法
     * 打印对象的属性(name, age)
     * @return
     */
//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }

    /**
     * Object类的equals方法默认比较的是两个对象的地址值，没有意义
     * 所以需要重写equals方法，比较两个对象的属性值(name, age）
     *      对象的属性值一样，返回true，否则返回false
 *      问题：
     *      隐含一个多态
     *      Object obj = p2 = new Person("Anna", 21);
     *      多态弊端：无法使用子类特有的内容(属性，方法)
     *      解决：可以使用向下转型(强转)把Object类型转换成Person
     * @return
     */

  /*  @Override
    public boolean equals(Object obj){
        //增加一个判断，传递的参数是this(p1) 本身，直接返回true，提高程序效率
        if(obj==this){
            return true;
        }

        //增加一个判断，传递的参数obj是null，直接返回false，提升程序的效率
        if(obj==null){
            return false;
        }

        //增加一个判断，是否Person类型在转换，防止类型转换异常ClassCastException

        if(obj instanceof Person){
            //使用向下转型(强转)把Object类转型为Person
            Person person = (Person) obj;
            //比较两个对象的属性，一个是调用方法的this(p1),一个就是person(p2);
            boolean bool = this.name.equals(person.name) && this.age == person.age;
            return  bool;
        }

        //不是Person类型直接返回false
        return false;
    }*/

    /**
        推荐版本
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    /**
    默认重写版本
     */
    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        //getClass() != o.getClass() 使用反射技术，判断o是否为Person类型 等于== obj instanceof Person
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
