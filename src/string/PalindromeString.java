package string;

public class PalindromeString {
    //check given string is palindrome or not
    static boolean isPalindromeString(String str){
        String reverseString = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverseString += str.charAt(i);
        }

        return str.equals(reverseString);
    }
    public static void main(String[] args) {
        String str = "abcdcba";
        boolean isPalindrome = isPalindromeString(str);
        if(isPalindrome){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }
    }
}
