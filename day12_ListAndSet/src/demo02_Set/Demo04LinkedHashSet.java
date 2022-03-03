package demo02_Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * java.util.LinkedHashSet集合 extends HashSet集合
 * LinkedHashSet集合特点：
 *      底层是一个哈希表(数组 + 链表/红黑树) + 链表：多了一条链表(记录元素的存储顺序),保证元素有序
 */
public class Demo04LinkedHashSet {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("3");
        set.add("1");
        set.add("2");
        System.out.println(set);//[1, 2, 3],无序的，不允许重复

        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        set1.add("3");
        set1.add("1");
        set1.add("2");
        System.out.println(set1);//[3, 1, 2],有序的，不允许重复
    }
}
