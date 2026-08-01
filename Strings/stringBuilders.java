package Strings;

public class stringBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(0));

        // // Set char at index 0
        // sb.setCharAt(0, 'P');
        // System.out.println(sb);

        // insert Char at index
        sb.insert(2, 'n');
        System.out.println(sb);

        // Delete the Extra 'n'
        sb.delete(2, 3);
        System.out.println(sb);

        // Append character
        StringBuilder sb2 = new StringBuilder("h");
        sb2.append("e");
        sb2.append("l");
        sb2.append("l");
        sb2.append("o");


        System.out.println(sb2);
    }
}
