package demo05;
/*
方法覆盖重写的注意事项：
    1. 必须保证父子类之间的方法的名称相同，参数列表也相同 建议加@Override，检测有效性
    2. 子类方法的返回值必须【小于等于】父类方法的返回值范围
        拓展：java.lang.Object类是所有类的公共最高父类（祖宗类），java.lang.String 就是Object的子类
    3. 子类方法的权限必须【大于等于】父类方法的权限修饰符
        拓展：public > protected > (default) > private
        提示：(default) 不是关键字，是什么都不写，留空
 */
public class Demo01Override {
}
