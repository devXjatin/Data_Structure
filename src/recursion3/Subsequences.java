package recursion3;

public class Subsequences {
    static String[] findSubSequences(String str){
        if(str.length() == 0){
            String[] ans = {""};
            return ans;
        }
        String[] smallAns = findSubSequences(str.substring(1));
        String[] ans = new String[2* smallAns.length];
        int k = 0;
        for (int i = 0; i < smallAns.length; i++) {
            ans[k] = smallAns[i];
            k++;
        }

        //append x with each element
        for (int i = 0; i < smallAns.length ; i++) {
            ans[k] = str.charAt(0)+smallAns[i];
            k++;
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "xyz";
        String[] subSequence = findSubSequences(str);
        for(var val :subSequence){
            System.out.print(val+" ");
        }
    }
}
