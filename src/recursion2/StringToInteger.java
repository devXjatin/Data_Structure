package recursion2;

public class StringToInteger {
    static int stringToInteger(String str){
        if(str.length() == 1){
            return Integer.parseInt(String.valueOf(str.charAt(0))) ;
        }
         return stringToInteger(str.substring(0,str.length()-1)) * 10 +
                Integer.parseInt(String.valueOf(str.charAt(str.length()-1)));
    }

    public static void main(String[] args) {
        String str ="1234";
        System.out.println(stringToInteger(str));

    }
}
