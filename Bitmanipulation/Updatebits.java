package Bitmanipulation;

import java.util.Scanner;

public class Updatebits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        // oper 1 : set | oper = 0 : clear
        int n = 5; //0101
        int pos = 1; 

        int bitMask = 1 << pos;

        if(oper == 1) {
            //set 
            int Newnumber = bitMask | n;
            System.out.println(Newnumber);
        } else {
            //clear
            int newBitMask = ~(bitMask);
            int Newnumber = newBitMask & n;
            System.out.println(Newnumber);
        }
        sc.close();
    }
}
