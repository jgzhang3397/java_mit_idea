package demo05;

import java.util.ArrayList;

/*
题目：
    定义以指定格式打印集合的方法（ArrayList类型作为参数），使用{元素@元素@元素}
        System.out.println(list); ==> [10, 20, 30]
        printArrayList(list); ==> {10@20@30}
 */
public class Demo03ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("lina");
        list.add("sonja");
        list.add("anton");

        /*定义方法三要素：
            返回值类型：只是打印，没有运算，void
            方法名称：printArrayList
            参数列表：ArrayList
         */
        printArrayList(list);
    }
    public static void printArrayList(ArrayList<String> list){
        //{10@20@30}
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if(i == list.size() -1){
                System.out.print(name + "}");
            }else{
                System.out.print(name + "@");
            }
        }
    }
}
