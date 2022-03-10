package demo08_threadCommunication;

/**
 * 等待与唤醒示例分析：
 *      资源类：包子类
 *          设置包子的属性
 *              皮
 *              馅
 *              包子的状态：true（有）false（没有）
 */
public class Baozi {
    //皮
    String pi;
    //馅
    String xian;
    //包子的状态：true（有）false（没有）
    boolean flag = false;
}
