package string;

public class CompressString {
    static String compressString(String str){
        if(str.length() == 0){
            return "";
        }
        int currentCharCount = 1;
        String answer = String.valueOf(str.charAt(0));
        for (int i = 1; i <str.length() ; i++) {
            if(str.charAt(i) == str.charAt(i-1)){
                ++currentCharCount;
            }else{
                if(currentCharCount > 1){
                    answer += currentCharCount;
                    currentCharCount = 1;
                }
                answer += String.valueOf(str.charAt(i));
            }
        }
        if(currentCharCount > 1){
            answer += currentCharCount;
        }
        return answer;
    }

    public static void main(String[] args) {
        String str = "aaabbbcccdda";
        System.out.println(compressString(str));
    }
}
