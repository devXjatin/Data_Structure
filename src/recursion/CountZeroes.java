package recursion;

public class CountZeroes {
    static int countZeroesRec(int number){
        if(number == 0){
            return 0;
        }
        if(number%10 == 0){
            return countZeroesRec(number/10)+1;
        }else{
            return countZeroesRec(number/10);
        }
    }

    public static void main(String[] args) {
        System.out.println(countZeroesRec(10204));
    }
}
