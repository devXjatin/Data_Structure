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

    //insert element in Priority queue
    void insert(int element){
        heap.add(element);

        //up-heapify to maintain the Complete binary tree properties
        int childIndex = heap.size()-1;
        int parentIndex = (childIndex-1)/2;
        while(childIndex>0){
            if(heap.get(childIndex) < heap.get(parentIndex)){
                int temp = heap.get(childIndex);
                heap.set(childIndex, heap.get(parentIndex));
                heap.set(parentIndex, temp);
                childIndex = parentIndex;
                parentIndex = (childIndex-1)/2;
            }else{
                return;
            }
        }
    }

    //remove min from priority queue
    int removeMin(){
        if(isEmpty()){
            return -1;
        }
        int removeElement = heap.get(0);
        heap.set(0, heap.get(heap.size()-1));
        heap.remove(heap.size()-1);

        //Down-heapify to maintain the CBT properties
        int index = 0;
        int minIndex = index;
        int leftChildIndex = 2*index+1;
        int rightChildIndex = 2*index+2;
        while(leftChildIndex < heap.size()){
            if(heap.get(leftChildIndex) <heap.get(minIndex)){
                minIndex = leftChildIndex;
            }
            if(rightChildIndex < heap.size() && heap.get(rightChildIndex) < heap.get(minIndex)){
                minIndex = rightChildIndex;
            }
            if(minIndex == index){
                break;
            }else{
                int temp = heap.get(index);
                heap.set(index, heap.get(minIndex));
                heap.set(minIndex, temp);
                index = minIndex;
                leftChildIndex = 2*index+1;
                rightChildIndex = 2*index+2;
            }
        }
        return removeElement;
    }

}
