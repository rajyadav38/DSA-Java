package Strings;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        // Strings are  Immutable

        // String Decalaration
        // String Name = "Tony";
        // String Fullname = "Tony Stark";
        // String Sentance = "My name is Tony Stark";

        // Taking input from Usr
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        System.out.println("Your name is : " + name);
        sc.close();
    }
}
