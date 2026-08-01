package Bitmanipulation;

public class Setbits {
    public static void main(String[] args) {
        int n = 5; //0101
        int pos = 1;
        int bitMask = 1<<pos;

        int Newnumber = bitMask | n;
        System.out.println(Newnumber);

    }
}
