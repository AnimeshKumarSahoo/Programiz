import java.util.Arrays;
public class Medianminandmax {
    public static double median(int arr[], int n){
		// First we sort the array
		Arrays.sort(arr);
		if (n % 2 != 0)
			return (double)arr[n / 2];
		return (double)(arr[(n - 1) / 2] + arr[n / 2]) / 2.0;
	}
    public static void find(int arr[],int low,int high) {
    int max=arr[0],min=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
		 if(arr[i]<min) {
			min=arr[i];
		}
		}
	low=min;
	high=max;
	System.out.println("The maximum element is:"+high+"and the minimum value is:"+low);
    }
	public static void main(String args[])
	{
		int arr[] = {1, 8, 3, 12, 2, 10, 4, 14};
		int n = arr.length;
        int low=0;
        int high=n-1;
        System.out.println("Median of the array is:");
		System.out.println(median(arr, n));
        find(arr, low, high);
	}
}

    

