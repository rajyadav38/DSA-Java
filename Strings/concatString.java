package Strings;

public class concatString {
    public static void main(String[] args) {
        // Concatenation
        String firstName = "Tony";
        String lastName = "Stark";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        // for String length
        System.out.println(fullName.length());

        // CharAt one character at a time
        for(int i = 0; i < fullName.length(); i ++) {
            System.out.println(fullName.charAt(i));
        }
    }
}
