package demo08;

import red.OpenMode;

import java.util.ArrayList;

public class NormalMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();

        int avg = totalMoney/totalCount;//平均值
        int mod = totalMoney%totalCount;//余数

        //注意totalCount - 1 代表 最后一个留给群主
        for (int i = 0; i < totalCount-1; i++) {
            list.add(avg);
        }

        //零头放在最后一个红包里
        list.add(mod + avg);

        return list;
    }
}
