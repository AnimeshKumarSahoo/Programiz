import java.util.Arrays;

public class Insertionsort {
public static void sort(int arr[]){
    for(int i=0;i<arr.length;i++){
        int temp=arr[i];
        int j=i-1;
        while(j>=0 && arr[j]>temp){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=temp;
    }
}

    public static void main (String args[]){
int arr[]={1,2,5,8,3,9};
System.out.println("Before insertion sort"+Arrays.toString(arr));
Insertionsort ob=new Insertionsort();

ob.sort(arr);
System.out.println("After insertion sort"+Arrays.toString(arr));
    }
}
