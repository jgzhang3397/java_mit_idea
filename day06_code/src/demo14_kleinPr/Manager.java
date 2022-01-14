package demo14_kleinPr;

import java.util.ArrayList;

public class Manager extends User{

    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count){
        //创建集合，存储若干个红包的金额
        ArrayList<Integer> redList = new ArrayList<>();

        //检查群主剩余的的钱
        int leftMoney = super.getMoney();
        if(totalMoney > leftMoney){
            System.out.println("余额不足");
            return redList;//返回空集合
        }

        //扣钱，重新设置余额
        super.setMoney(leftMoney - totalMoney);

        //发红包平均拆分成count份
        int avg = totalMoney / count;
        int mod = totalMoney % count;//零头

        //除不开的零头，包在最后一个红包当中
        //下面把红包一个一个放到集合当中
        for (int i = 0; i < count - 1; i++) {
            redList.add(avg);
        }

        //最后一个红包
        int last = avg + mod;
        redList.add(last);

        return redList;
    }
}
