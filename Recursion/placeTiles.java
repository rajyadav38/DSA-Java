package Recursion;

public class placeTiles {

    public static int placeTile(int n , int m) {
        if(n == m) {
            return 2;
        }

        if(n < m) {
            return 1;
        }

        //vertically
        int vertPlacement = placeTile(n-m, m);

        //horizontally 
        int horplacement = placeTile(n-1, m);

        return vertPlacement + horplacement;
    }
    public static void main(String[] args) {
        int n = 4 , m = 2;
        System.out.println(placeTile(n, m));
    }
}
