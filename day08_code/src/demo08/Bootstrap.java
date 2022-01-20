package demo08;
/*
因不知名因素，图片没有加载到运行界面，后续解决！
 */
import red.OpenMode;
import red.RedPacketFrame;

/**
 * 场景说明：
 *      红包发出去，所有人都有红包，最后一个红包给群主自己
 *
 *      任务：
 *      1. 设置一下程序的标题，通过构造方法的字符串参数
 *      2. 设置群主名称
 *      3. 设置分发策略：平均还是随机
 *
 *      红包分为：
 *          普通红包（平均）：totalMoney/totalCount, 余数放在最后一个红包当中
 *          手气红包（随机）：最少1分钱，最多不超过平均数2倍，钱越发越少
 */
public class Bootstrap {

    public static void main(String[] args) {
        MyRed red = new MyRed("我的小项目");

        //设置群主名称
        red.setOwnerName("leo");

//        //普通红包
//        OpenMode normal = new NormalMode();
//        red.setOpenWay(normal);
        //随机红包
        OpenMode random = new RandomMode();
        red.setOpenWay(random);
    }
}
