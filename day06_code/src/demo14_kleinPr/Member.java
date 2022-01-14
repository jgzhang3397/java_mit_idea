package demo14_kleinPr;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User{

    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list){
        //从多个红包中随便抽取一个，给我自己
        //随机获取一个集合当中的索引编号
        //int index = new Random().nextInt(list.size());
        int index = 0;
        int size = list.size();
        Random random = new Random();
        index = random.nextInt(size);

        //根据索引，从集合中删去，并得到被删除的红包，给我自己
        int delta = list.remove(index);

        //当前成员自己本来就有的钱
        int money = super.getMoney();

        //加上红包的钱 set回去
        super.setMoney(money + delta);

    }
}
