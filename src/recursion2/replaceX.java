package recursion2;

public class replaceX {
    static String replaceX(String str, char c1, char c2){
        if(str.length()==0){
            return "";
        }
        char c;
        if(str.charAt(0) == c1){
            c = c2;
        }else{
            c = str.charAt(0);
        }
        return c+replaceX(str.substring(1), c1, c2);
    }

    public static void main(String[] args) {
        String str = "abcada";
        System.out.println(replaceX(str, 'a', 'x'));
    }
}
