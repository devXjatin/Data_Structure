package recursion2;

public class removeConsecutive {
    static String removeConsecutive(String str){
        if(str.length() <=1){
            return str;
        }
        if(str.charAt(0) == str.charAt(1)){
            return removeConsecutive(str.substring(1));
        }
        else{
            return str.charAt(0) + removeConsecutive(str.substring(1));
        }

    }

    public static void main(String[] args) {
        System.out.println(removeConsecutive("aabbccdda"));
    }
}
