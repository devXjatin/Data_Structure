package string;

public class RemoveConsecutiveDuplicates {
    static String removeConsecutive(String str){
        String ans = String.valueOf(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i) != str.charAt(i-1)){
                ans += str.charAt(i);
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        String str = "aadddggghhhaa";
        System.out.println(removeConsecutive(str));
    }
}
