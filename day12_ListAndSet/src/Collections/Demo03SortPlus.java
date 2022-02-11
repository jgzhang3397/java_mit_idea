package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *  public static <T> void sort(List<T> list, Comparator <? super T> ):
 *
 *  Comparator和Comparable的区别：
 *      Comparable：自己（this）和别人（参数）比较，自己需要实现Comparable接口，重写比较的规则compareTo方法
 *      Comparator: 相当于找一个第三方的裁判，比较两个
 *
 *
 */
public class Demo03SortPlus {

    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        Collections.addAll(list01, 1,3,2);
        System.out.println(list01);//[1, 3, 2]

        Collections.sort(list01, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //return o1 - o2;//升序排序
                return o2 - o1;//降序排序
            }
        });
        System.out.println(list01);

        ArrayList<Student> list02 = new ArrayList<>();
        list02.add(new Student("leo",20));
        list02.add(new Student("anna",21));
        list02.add(new Student("snowy", 19));
        list02.add(new Student("bob",19));

        Collections.sort(list02, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result =  o1.getAge() - o2.getAge();//按照年龄升序排序
                //如果两个人年龄相等，再使用姓名的第一个字母比较
                if(result == 0){
                    result = o1.getName().charAt(0)-o2.getName().charAt(0);
                }
                return result;
            }
        });

        System.out.println(list02);
    }

}
