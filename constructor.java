import java.util.objects;
class Student{

    int a=5;
}
public class constructor {
    int a;
    public static void main (String[]args){
        Student s = new Student();
        Student s1 = new Student();

        System.out.println(s.equals(s1));

    }
}
