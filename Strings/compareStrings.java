package Strings;

public class compareStrings {
    public static void main(String[] args) {
        // Compare
        String name1 = "Tony";
        String name2 = "Tony";

        // CompareTo Functions return if: 
        //1. S1 = S2 -> 0
        //2. S1 > S2 -> +ve no.
        //3. S1 < S2 -> -ve no.

        if(name1.compareTo(name2) == 0) {
            System.out.println("Strings are equal");
        } else if (name1.compareTo(name2) > 0) {
            System.out.println("String 1 is greater then String 2");
        } else {
            System.out.println("String 1 is less than String 2");
        }

        // Trying == but we don't use it because it fails at some cases

        if(name1 == name2) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        // SubStrings substring(beg , index-1);

        String sentance = "My name is tony Stark";
        String name = sentance.substring(11 , sentance.length());
        System.out.println(name);
    }
}
