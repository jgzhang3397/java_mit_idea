package Exception.ZiFuClassExcep;
/**
 * 子父类异常：
 *      - 如果父类抛出了多个异常，子类重写父类方法时，抛出和父类相同的异常或者是父类异常的子类或者不抛出异常
 *      - 父类方法没有抛出异常，子类重写父类该方法时也不可抛出异常，此时子类产生该异常，只能捕获处理，不能声明抛出
 *
 * 注意：
 *      父类异常时什么样，子类异常就什么样
 */
public class Fu {

    public void show01() throws NullPointerException, ClassCastException{}

    public void show02() throws IndexOutOfBoundsException{}

    public void show03() throws IndexOutOfBoundsException{}

    public void show04(){}

    public void show05(){}
}

class Zi extends Fu{
    //子类重写父类方法时，抛出和父类相同的异常
    @Override
    public void show01() throws NullPointerException, ClassCastException{}

    //或者是父类异常的子类
    @Override
    public void show02() throws ArrayIndexOutOfBoundsException{}

    //或者不抛出异常
    @Override
    public void show03() {}

    //父类方法没有抛出异常，子类重写父类该方法时也不可抛出异常
    @Override
    public void show04() /*throws Exception*/{}

    //此时子类产生该异常，只能try catch捕获处理，不能throws Exception声明抛出
    @Override
    public void show05() {
        try{
            throw new RuntimeException("运行期异常");
        }catch (RuntimeException e){
            e.printStackTrace();
        }
    }
}
