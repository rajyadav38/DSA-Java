package HashSet;
import java.util.*;
public class Hashmap {
    public static void main(String[] args) {
        //country , population
        HashMap<String , Integer> map = new HashMap<>();

        // Insertion
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);
        System.out.println(map);

        //Insertion second case Updation for existing Key
        map.put("China", 180);
        System.out.println(map);

        //Seacrh 
        if(map.containsKey("China")) {
            System.out.println("Key is present in the map");
        } else {
            System.out.println("Key is not present in the map");
        }

        // Gettig the Value for there Keys
        System.out.println(map.get("China")); // Key Exists
        System.out.println(map.get("Indonesia")); // Key don't exists so we get null

        // Iteration over keys and value both
        for(Map.Entry<String , Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // for Key only iteration
        Set<String> keys = map.keySet();
        for(String key : keys) {
            System.out.println(key+ " " + map.get(key));
        }

        // Deletion
        map.remove("China");
        System.out.println(map);
    }
}
