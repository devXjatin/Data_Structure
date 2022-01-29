package recursion1;

public class SumOfDigits {
    static int sumOfDigits(int number){
        if(number == 0){
            return 0;
        }
        return number%10 + sumOfDigits(number/10);
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits(9));
    }
}
