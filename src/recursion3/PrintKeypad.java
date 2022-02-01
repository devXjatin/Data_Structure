package recursion3;

public class PrintKeypad {
    private static String[] getString(int n){
        if(n<=1 && n>10){
            System.exit(0);
        }
        if(n==2){
            String[] output = {"a","b","c"};
            return output;
        }
        if(n==3){
            String[] output = {"d","e","f"};
            return output;
        }
        if(n==4){
            String[] output = {"g","h","i"};
            return output;
        }
        if(n==5){
            String[] output = {"j","k","l"};
            return output;
        }
        if(n==6){
            String[] output = {"m","n","o"};
            return output;
        }
        if(n==7){
            String[] output = {"p","q","r","s"};
            return output;
        }
        if(n==8){
            String[] output = {"t","u","v"};
            return output;
        }
        if(n==9){
            String[] output = {"w","x","y","z"};
            return output;
        }
        return new String[]{""};
    }
    private static void printKeypad(int num, String outputSoFar){
        if(num == 0){
            System.out.println(outputSoFar);
            return;
        }
        String[] options = getString(num%10);
        for (int i = 0; i < options.length ; i++) {
            printKeypad(num/10, options[i]+outputSoFar);
        }
    }
    static void printKeypad(int num){
        printKeypad(num, "");
    }

    public static void main(String[] args) {
        printKeypad(23);
    }

}
