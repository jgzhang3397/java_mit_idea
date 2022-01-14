package demo14_kleinPr;

import java.util.ArrayList;

public class MainRedPacket {
    public static void main(String[] args) {
        Manager manager = new Manager("Manager", 100);

        Member one = new Member("Leo", 0);
        Member two = new Member("Snowy", 10);
        Member three = new Member("Anna", 20);

        manager.show();
        one.show();
        two.show();
        three.show();
        System.out.println("===============");

        //群主发三个红包，总共20$
        ArrayList<Integer> redlist = manager.send(20, 3);

        //收红包三个人
        one.receive(redlist);
        two.receive(redlist);
        three.receive(redlist);

        manager.show();//100 - 20 = 80
        //6, 6, 8 随机分给三个人
        one.show();
        two.show();
        three.show();

    }
}
