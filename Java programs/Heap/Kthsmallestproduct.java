package Heap;
import java.util.Arrays;
import java.util.PriorityQueue;
public class Kthsmallestproduct {
    public static int KSmallestProduct(int[] arr, int size, int k) {
int product = 1;
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        int i = 0;
        for(int e : arr)
            pq.add(arr[e]);
        while(i<size && i<k){
            product *= pq.remove();
            i++;
        }
        return product;
}
public static void minElements(int arr[] , int value){
   for(int i=0 ; i<arr.length ; i++){
      if(arr[i] < value)
         System.out.println(arr[i]);
   }
}
public static void main (String args[]){
   int arr[]={12,23,67,89,90};
   int k=3;
   int res=KSmallestProduct(arr,arr.length,k);
   System.out.println("Kth smallestproduct element is:"+res);
   minElements(arr, 90);
}
}