package hashmap;

import java.util.HashMap;

public class ExtractUniqueCharacter {

    static String extractCharacter(String str){
        HashMap<Character, Boolean> map = new HashMap<>();
        String output ="";
        for (int i = 0; i < str.length(); i++) {
            if(!map.containsKey(str.charAt(i))){
                output+=str.charAt(i);
                map.put(str.charAt(i), true);
            }

        }
        return output;
    }

    public static void main(String[] args) {
        String str = "ababacd";
        String output = extractCharacter(str);
        System.out.println(output);
    }
}
