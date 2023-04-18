import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SampleArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Hi");
        list1.add("Hello");
        list1.add("Good Morning");
        list1.remove("Hi");
        Collections.sort(list1);
        Iterator itr = list1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
