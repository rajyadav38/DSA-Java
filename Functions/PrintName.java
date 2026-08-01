package Functions;

import java.util.Scanner;

public class PrintName {

    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write your Name: ");
        String name = sc.next();
        printMyName(name); //Calling my Function

        sc.close();
    }
}
