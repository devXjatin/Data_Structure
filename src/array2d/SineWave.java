package array2d;

public class SineWave {

    //print sine wave
    static void sineWave(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int count = 0;
        for (int i = 0; i < rows; i++) {
            if(i%2==0){
                for (int j = 0; j < cols; j++) {
                    System.out.print(arr[j][i]+" ");
                }
            }else{
                for (int j = cols-1; j >=0 ; j--) {
                    System.out.print(arr[j][i]+" ");

                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr2d = {{1,2,3},{4,5,6},{7,8,9}};
        sineWave(arr2d);
    }
}
