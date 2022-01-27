package string;

public class CheckPermutation {
    static boolean checkPermutation(String str1, String str2){
        //if the length of string is not equal return false
        if(str1.length() != str2.length()){
            return false;
        }

        //size of array 256 is because we have only 256 characters
        int[] frequency = new int[256];

        //count how many character appear in string 1 and update the count value at their ASCII index by +1
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            ++frequency[ch];
        }

        //count how many character appear in string 2 and update the count value at their ASCII index by -1
        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            --frequency[ch];
        }

        //if all the value in frequency array is zero then string is permutated otherwise not
        for (int i = 0; i < frequency.length; i++) {
            if(frequency[i] != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "baedc";
        System.out.println(checkPermutation(str1, str2));

    }
}
