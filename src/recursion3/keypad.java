package recursion3;

public class keypad {

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
    static String[] keypad(int num){
        if(num == 0){
            return new String[]{""};
        }
        String[] smallerNumberArray = keypad(num/10);
        String[] singleDigitOutput = getString(num%10);
        String[] output = new String[smallerNumberArray.length*singleDigitOutput.length];
        int k = 0;
        for (int a=0; a<singleDigitOutput.length;a++) {
            for (int i = 0; i < smallerNumberArray.length; i++) {
                output[k] = smallerNumberArray[i]+ singleDigitOutput[a];
                k++;
                System.out.println(smallerNumberArray[i]+singleDigitOutput[a]);
            }
        }
        return output;
    }

    public static void main(String[] args) {
        int num = 23;
        String[] output = keypad(num);
        for(var val: output){
            System.out.print(val+" ");
        }
    }

}
