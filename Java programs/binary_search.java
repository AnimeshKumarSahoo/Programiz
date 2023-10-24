public class binary_search {

    static int bin_sea(int arr[], int lb, int ub, int key) {
        if (ub < lb)
            return -1;
        else {
            int mid = (lb + ub) / 2;
            if(key==arr[mid])
                return mid;
            else if (key < mid)
                return (bin_sea(arr, lb, mid - 1, key));
            else 
                return (bin_sea(arr, mid+1, ub, key));
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,5,7,8,9};
        int key = 5;
        System.out.println(bin_sea(arr, 0, arr.length-1, key));
    }
}
