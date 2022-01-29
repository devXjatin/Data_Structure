package recursion2;

public class RemoveXFromString {
   static String removeX(String str){
       if(str.length() == 0){
           return "";
       }
       String ans = "";
       if(str.charAt(0) != 'x'){
           ans+=str.charAt(0);
       }
       return ans+removeX(str.substring(1));
   }

    public static void main(String[] args) {
        String str = "abxcxxa";
        System.out.println(removeX(str));
    }
}
