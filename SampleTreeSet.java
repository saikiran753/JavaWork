import java.util.Iterator;
import java.util.TreeSet;

public class SampleTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>();
        ts.add(11);
        ts.add(12);
        ts.add(13);
        ts.add(14);

        System.out.println("Lowest value = " + ts.pollFirst());
        System.out.println("Highest value = " + ts.pollLast());
    }

}
