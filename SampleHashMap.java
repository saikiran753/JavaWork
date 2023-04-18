import java.util.HashMap;
import java.util.Map;

public class SampleHashMap {
    public static void main(String[] args){
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "Apple");
        hm.put(2, "Banana");
        hm.put(3, "Cat");
        hm.put(4, "Dog");

        for(Map.Entry m : hm.entrySet()){
System.out.println(m.getKey()+ " " + m.getValue());
        }
    }
}