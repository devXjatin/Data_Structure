package string;

public class ReverseString {
    static String reverseString(String str){
        String reverseString = "";
        for (int i = str.length()-1;  i>=0; i--) {
            reverseString += str.charAt(i);

        }
       return reverseString;
    }

    public static void main(String[] args) {
        String str = "abcdef";
        String reverseString = reverseString(str);
        System.out.println(reverseString);
    }
}
