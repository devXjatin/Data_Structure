package priorityqueue;

import java.util.*;

public class PriorityQueue {
    private ArrayList<Integer> heap;

    public PriorityQueue(){
        heap = new ArrayList<>();
    }

    //check arraylist is empty or not
    boolean isEmpty(){
        return heap.size() == 0;
    }

    //return size of the heap
    int size(){
        return heap.size();
    }

    //return min element in priority queue
    int getMin(){
        if(isEmpty()){
            return -1;
        }
        return heap.get(0);
    }

}
