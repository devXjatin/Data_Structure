package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class RemoveDuplicates {

    static ArrayList<Integer> removeDuplicates(int[] arr){
        HashMap<Integer, Boolean> map = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(!map.containsKey(arr[i])){
                al.add(arr[i]);
                map.put(arr[i], true);
            }
        }
        return al;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 2, 5, 6, 1, 4, 4, 5,};
        ArrayList<Integer> output = removeDuplicates(arr);
        System.out.println(output);
    }
}
