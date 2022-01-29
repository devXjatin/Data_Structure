package recursion1;

public class PalindromeString {
    private static boolean palindromeString(String str, int start, int end){
        if(start >= end){
            return true;
        }
        if(str.charAt(start) != str.charAt(end)){
            return false;
        }
        return palindromeString(str, start+1, end-1);

    }
    static boolean palindromeString(String str){
        return palindromeString(str, 0, str.length()-1);
    }

    public static void main(String[] args) {
        System.out.println(palindromeString("racecar"));

    }
}
