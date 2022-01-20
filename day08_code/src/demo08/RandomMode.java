package demo08;

import red.OpenMode;

import java.util.ArrayList;
import java.util.Random;

public class RandomMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(final int totalMoney, final int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();

        /**
         * 随机分配，可能多，可能少
         * 最少1分钱，最多不超过剩下的2倍
         * 第一次发红包，随机范围是0.01 ~ 6.66
         * 剩下3.34
         * 再发两个
         * 再发范围是0.01~3.34
         *
         * 公式：
         *  1 + random.nextInt(leftMoney / leftCount*2)
         */

        Random r = new Random();

        /**
         * totalMoney:总金额不变
         * totalCount:总份数不变
         * leftMoney:剩下的钱
         * leftCount:剩下的份数
         */
        int leftMoney = totalMoney;
        int leftCount = totalCount;

        for (int i = 0; i < totalCount-1; i++) {
            int money = r.nextInt(leftMoney / leftCount * 2)+1;//红包范围
            list.add(money);

            leftMoney -= money;
            leftCount --;

        }
        list.add(leftMoney);

        return list;
    }
}
