import java.util.ArrayList;
import java.util.Iterator;

public class SampleArrayList {
    public static void main(String[] args) {
        ArrayList<Student> list1 = new ArrayList<Student>();
        Student s1 = new Student(1, "sai", "potti");
        Student s2 = new Student(2, "Dilip", "potti");
        list1.add(s1);
        list1.add(s2);
        for (Student s : list1) {
            System.out.println(s.rno + " " + s.fname + " " + s.lname);
        }

    }
}

class Student {
    int rno;
    String fname, lname;

    public Student(int rno, String fname, String lname) {
        this.rno = rno;
        this.fname = fname;
        this.lname = lname;
    }

}
