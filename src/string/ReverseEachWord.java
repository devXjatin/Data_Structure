package string;

public class ReverseEachWord {
    static String reverseEachWord(String str){
        int size = str.length();
        int countWordStart = 0;
        int currentWordEnd = 0;
        String ans ="";
        int i = 0;
        for (; i <size; i++) {
            if(str.charAt(i) == ' '){
                currentWordEnd = i-1;
                String reverseString = "";
                for (int j = currentWordEnd; j >=countWordStart ; j--) {
                    reverseString += str.charAt(j);
                }
                countWordStart= i+1;
                ans += reverseString+" ";
            }

        }
        currentWordEnd = i-1;
        String reverseString = "";
        for (int j = currentWordEnd; j >=countWordStart ; j--) {
            reverseString += str.charAt(j);
        }
        countWordStart= i+1;
        ans += reverseString+" ";
        return ans;
    }

    public static void main(String[] args) {
        String str = "abc def";
        String reverseWord = reverseEachWord(str);
        System.out.println(reverseWord);
    }
}
