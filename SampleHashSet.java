import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SampleHashSet {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Hi");
        list1.add("Hello");

        HashSet<String> set = new HashSet<String>(list1);
        set.add("Namastheyy");
        Iterator<String> i = set.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

    }
}
