package arrayList;
import java.util.ArrayList;
import java.util.Collections;
public class AL {
   public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    
    // add elements
    list.add(0);
    list.add(2);
    list.add(3);

    System.out.println(list);

    // get element
    int element = list.get(1);
    System.out.println(element);

    // add element in Between 
    list.add(1, 1);
    System.out.println(list);

    // set element 
    list.set(0  , 5);
    System.out.println(list);

    // Delete element 
    list.remove(3);
    System.out.println(list);

    // Size of ArrayList
    int size = list.size();
    System.out.println(size);

    // Loops
   for(int i = 0; i<list.size(); i++) {
    System.out.print(list.get(i));
   }
   System.out.println();

   //sorting
   Collections.sort(list);
   System.out.println(list);
   } 
}
