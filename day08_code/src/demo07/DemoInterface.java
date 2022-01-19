package demo07;

import java.util.ArrayList;
import java.util.List;

/**
 * java.util.List 是 ArrayList 所实现的接口
 */
public class DemoInterface {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        List<String> result = addNames(list);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    public static List<String> addNames(List<String> list){
        list.add("snowy");
        list.add("leo");
        list.add("lukas");
        return list;
    }
}
