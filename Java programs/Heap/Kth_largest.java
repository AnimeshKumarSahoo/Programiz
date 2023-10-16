package Heap;
import java.util.PriorityQueue;
public class Kth_largest {
    public static int kthlargest(int arr[],int k){
PriorityQueue<Integer> pq=new PriorityQueue<>();
for(int i=0;i<k;i++){
    pq.add(arr[i]);
}
for(int i=k;i<arr.length;i++){
    if(pq.peek()<arr[i]){
        pq.remove();
        pq.add(arr[i]);
    }
}
return pq.peek();
    }
    public static void main (String args[]){
        int arr[]={12,23,45,67,89};
        int k=3;
        int res=kthlargest(arr,k);
        System.out.println("Kth largest element is:"+res);
    }
    
}
