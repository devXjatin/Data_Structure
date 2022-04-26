package recursion3;

public class PrintSubsequence {
    static int counter =0;
    static void printSubsequence(String str, String outputSoFar){
        if(str.length() ==0){
            System.out.print(outputSoFar+" ");
            counter++;
            return;
        }
        //we choose to not include first character
        printSubsequence(str.substring(1), outputSoFar);
        //we choose to include first character
        printSubsequence(str.substring(1), outputSoFar+str.charAt(0));

    }

    static void printSubsequence(String str){
        printSubsequence(str, "");
    }

    public static void main(String[] args) {
        printSubsequence("xyz");
//        System.out.println();
        System.out.println(counter);
    }
}
