public class Quicksort {
    static void swap(int[] arr, int start, int end)
    {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    public static int partition(int lb,int ub,int arr[]){
        int pivot=arr[lb];
        int start=lb;
        int end=ub;
        while(start<end){
            while(arr[start]<pivot){
                start++;
            }
            while(arr[end]>pivot){
                end--;
            }
            if(start<end){
                swap(arr,arr[start],arr[end]);
            }
        }
        swap(arr,arr[lb],arr[end]);
   return end;
}
      public  static void quicksort(int[] arr, int lb, int ub){
        if(lb<ub){
            int loc=partition(lb, ub, arr);
            quicksort(arr,lb,loc-1);
            quicksort(arr,loc+1,ub);
        }
        }
        static void printArray(int[] arr, int size)
        {
            for (int i = 0; i < size; i++)
                System.out.print(arr[i] + " ");
     
            System.out.println();
        }
        public static void main(String args[]){
            int arr[]={1,4,5,6,7,3};
            int n=arr.length;
            System.out.println("Array before sorting");
          for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]+" ");}
            quicksort(arr,0,n-1);
            System.out.println("Array after quick sort:");
            printArray(arr,n);

    }
}

    

