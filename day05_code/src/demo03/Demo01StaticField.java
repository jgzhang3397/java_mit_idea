package demo03;

public class Demo01StaticField {
    public static void main(String[] args) {
        Student one = new Student("Leo", 19);
        one.room = "E101";
        System.out.println("Name:= "+ one.getName()+" , Age:= "+one.getAge()
                            + " Classroom:= "+one.room + " Id: = " + one.getId());
        Student two = new Student("Snowy", 20);
        System.out.println("Name:= "+ two.getName()+" , Age:= "+two.getAge()
                             + " Classroom:= "+two.room + " Id: = " + two.getId());

    }
}
