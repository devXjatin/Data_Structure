package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MaximumFrequenceyNumber {

    static int maximumFrequency(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
                continue;
            }
            map.put(arr[i],1);
        }
        int max = Integer.MIN_VALUE;
        int value = Integer.MIN_VALUE;
        var entries = map.entrySet();
        var iterator = entries.iterator();
        while(iterator.hasNext()){
            var singleEntry = iterator.next();
//            System.out.println(singleEntry);
            if(value< singleEntry.getValue()){
                max = singleEntry.getKey();
                value=singleEntry.getValue();
            }
        }
        return max;

    }

    public static void main(String[] args) {
        int[] arr= {2, 12, 2 ,11, 12, 2, 1, 2, 2, 11, 12, 2, 6, };
        System.out.println(maximumFrequency(arr));
//        maximumFrequency(arr);
    }
}
