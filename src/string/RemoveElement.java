package string;

public class RemoveElement {
    static String removeElement(String str, char ch){
        String ans = "";
        if(str.length() == 0){
            return "";
        }
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ch){
                ans += str.charAt(i);
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        String str = "aaabbbcccdddaa";
        System.out.println(removeElement(str, 'a'));
    }
}
