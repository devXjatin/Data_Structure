package string;

public class PalindromeString {
    //check given string is palindrome or not
    static boolean isPalindromeString(String str){

        //Approach 1
       /* String reverseString = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverseString += str.charAt(i);
        }

        return str.equals(reverseString);*/

        //Approach 2
        int start = 0;
        int end = str.length()-1;
        while(start<end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }else{
                start++;
                end--;
            }
        }
        return true;
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
