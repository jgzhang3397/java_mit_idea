package demo05;

import java.util.ArrayList;
import java.util.Random;

/*
题目：
    用一个大集合存入20个随机数1 ~ 100，然后筛选其中的偶数元素，放到小集合中
    要求使用自定义方法实现筛选
        分析：
            1. 需要创建一个大集合，用来存储int数字：<Integer>
            2. 随机数字就用Random nextInt
            3. 循环20次，把随机数字放在大集合：for循环，add方法
            4. 定义一个方法，用来筛选
            筛选：
                方法三要素：
                    返回值类型：ArrayList 小集合（参数数量不定）
                    方法名称：getSmallList
                    参数列表：ArrayList 大集合（20个随机数）
            5. 判断：if语句 num%2 == 0
            6. 如果是偶数，放在小集合中，否则不放

 */
public class Demo04ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> bigList = new ArrayList<>();

        Random r = new Random();

        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100) + 1;
            bigList.add(num);
        }
        System.out.println(bigList);

        //4. 定义一个方法，用来筛选
        ArrayList<Integer> smallList = getSmallList(bigList);
        System.out.println(smallList);
        //遍历
        for (int i = 0; i < smallList.size(); i++) {
            int num = smallList.get(i);
            System.out.print(num + " ");
        }
    }
    public static ArrayList<Integer> getSmallList(ArrayList<Integer> bigList){
        ArrayList<Integer> smallList = new ArrayList<>();

        for (int i = 0; i < bigList.size(); i++) {
            int num = bigList.get(i);
            if(num % 2 == 0){
                smallList.add(num);
            }
        }
        System.out.println("Insgamt : "+smallList.size() + " mal gerade zahl." );
        return smallList;
    }
}
