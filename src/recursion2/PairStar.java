package recursion2;

public class PairStar {
    static String pairStar(String str){
        if(str.length() <= 1){
            return str;
        }
        String ans = "";
        if(str.charAt(0) == str.charAt(1)){
            ans += str.charAt(0)+"*";
        }else{
            ans+=str.charAt(0);
        }
        return ans +pairStar(str.substring(1));
    }

    public static void main(String[] args) {
        String str = "aaaa";
        System.out.println(pairStar(str));
    }
}
