package demo06;

public class demoMain {

    public static void main(String[] args) {
        //创建一个英雄角色
        Hero hero = new Hero();
        hero.setName("盖伦");
        hero.setAge(20);

        //创建一个武器对象
        Weapon weapon = new Weapon("黑切");
        //为英雄配备武器
        hero.setWeapon(weapon);

        hero.attack();

    }
}
