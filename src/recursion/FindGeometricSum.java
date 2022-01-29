package recursion;

public class FindGeometricSum {
    static double geometricSum(double number){
        if(number == 0){
            return 1;
        }
        return geometricSum(number-1)+1/Math.pow(2,number);
    }

    public static void main(String[] args) {
        System.out.println(geometricSum(3));
    }
}
