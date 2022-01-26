package string;

public class PrintAllSubString {
    static void printAllSubString(String str){
        int start = 0;
        int size = str.length()-1;
        int totalSubstring = size*(size+1)/2;
        while (start < totalSubstring){
            int end = start;
            while (end <=size){
                System.out.println(str.substring(start,end+1));
                end++;
            }
            end = 0;
            start++;
        }
    }

    public static void main(String[] args) {
        String str = "pqrs";
        printAllSubString(str);
    }
}
