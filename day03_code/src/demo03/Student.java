package demo03;
/*
boolean型，Getter方法写成isXxx, 而setXxx不变
 */
public class Student {
    private String name;
    private int age;
    private boolean male;

    public void setMale(boolean b){
        male = b;
    }
    public boolean isMale(){
        return male;
    }

    public void setName(String str){
        name = str;
    }
    public String getName(){
        return name;
    }

    public void setAge(int num){
        age = num;
    }
    public int getAge(){
        return age;
    }
}
