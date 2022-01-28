package recursion;

public class PrintNumber {
    static void printNumber(int n){
        if(n >0){
            printNumber(n-1);
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        printNumber(6);
    }
}
