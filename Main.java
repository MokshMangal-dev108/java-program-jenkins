import java.util.Date;
import java.util.Random;

public class Main{
    public static void main(String[] args) {
        System.out.println("this is output from java project");
        System.out.println("Hello");
        System.out.println(new Date());
        System.out.println(new Random());
        Student s = new Student();
        s.print();
    }
}