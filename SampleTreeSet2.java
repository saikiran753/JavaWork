import java.util.TreeSet;

public class SampleTreeSet2 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("A");
        ts.add("B");
        ts.add("C");
        ts.add("D");
        ts.add("E");

        System.out.println("Initial Set = " + ts);
        System.out.println("Subset = " + ts.subSet("A", "D"));
        System.out.println("Headset = " + ts.headSet("C"));
        System.out.println("Tailset = " + ts.tailSet("D"));
        System.out.println("Descending set = " + ts.descendingSet());
    }

}
