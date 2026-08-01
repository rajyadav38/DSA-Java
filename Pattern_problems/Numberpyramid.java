package Pattern_problems;

public class Numberpyramid {
    public static void main(String[] args) {
        int n = 5;

        for(int i =1; i<= n; i++) {
            //spaces
            for(int j =1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //Number -> print Row no. Row times
            for(int j =1; j<=i; j++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }
}
