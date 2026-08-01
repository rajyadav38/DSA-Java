package Functions;

import java.util.Scanner;

public class product {
    public static int calcProduct(int a , int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Product of the two numbers is: " + calcProduct(a, b) );

        sc.close();
    }
}
