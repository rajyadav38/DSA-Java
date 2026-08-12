package HashSet;
import java.util.HashSet;
import java.util.Iterator;
public class Hashing {
    public static void main(String[] args) {
        // Creating
        HashSet<Integer> set = new HashSet<>();

        //Insertion
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        //Size
        System.out.println("the size of Set is: " + set.size());

        // print Elements
        System.out.println(set);

        // Search - contains
        if(set.contains(1)) {
            System.out.println("Set Contains 1");   
        }
        if(!set.contains(6)) {
            System.out.println("does not Contain");   
        }

        // delete 
        set.remove(1);
        if(!set.contains(1)) {
            System.out.println("does not Contain 1 - we deleted");   
        }

        //Iterator // In hashset we do not use i for iteration we use Iterator libaray
        Iterator it = set.iterator();
        
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
 