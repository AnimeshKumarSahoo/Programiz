package DSA;
public class Binarysearch {
    public static int binarySearch(int arr[], int left, int right, int item){
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == item)
                return mid;
            if (arr[mid] < item)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }
    public static void main(String args[]){
        int[ ] array = {10, 20, 30, 40, 50, 60, 70, 80};
        int item = 20;
        int size = array.length;
        int position = binarySearch(array, 0, size-1, item);
        if(position == -1)
            System.out.println("Element not found");
        else
            System.out.println("The value " + item + " found at position: " + position);

    }
}
