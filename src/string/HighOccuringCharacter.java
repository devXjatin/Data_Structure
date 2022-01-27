package string;

public class HighOccuringCharacter {
    static char highOccuringCharacter(String str){
        if(str.length() == 0){
            return 0;
        }
        int[] frequency = new int[256];
        int maxFrequency = Integer.MIN_VALUE;
        for (int i = 0; i < str.length(); i++) {
            ++frequency[str.charAt(i)];
            maxFrequency = Math.max(maxFrequency, frequency[str.charAt(i)]);
        }
        char ans = '\0';
        for (int i = 0; i < str.length(); i++) {
            if(maxFrequency == frequency[str.charAt(i)]){
                ans = str.charAt(i);
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "aabbcddaa";
        System.out.println((char)highOccuringCharacter(str));
    }
}
