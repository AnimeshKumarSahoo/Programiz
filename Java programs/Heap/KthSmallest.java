package Heap;
import java.util.Collections;
import java.util.PriorityQueue;
public class KthSmallest {
    public static int kthlargest(int arr[],int k){
PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
for(int i=0;i<k;i++){
    pq.add(arr[i]);
}
for(int i=k;i<arr.length;i++){
    if(pq.peek()>arr[i]){
        pq.remove();
        pq.add(arr[i]);
    }
}
return pq.peek();
    }
    public static void main (String args[]){
        int arr[]={12,23,67,89,90};
        int k=3;
        int res=kthlargest(arr,k);
        System.out.println("Kth smallest element is:"+res);
    }
    
}


