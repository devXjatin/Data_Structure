package arrays;

import java.util.Scanner;

public class LinearSearch {
    static int linearSearch(int[] arr, int element){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == element){
                return i+1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int [] arr = {10, 34, 50, 23, 25};
        System.out.println("Enter the number you want to search: ");
        int searchElement = scn.nextInt();
        int searchElementLocation = linearSearch(arr, searchElement);
        System.out.println(searchElementLocation);
    }
}
