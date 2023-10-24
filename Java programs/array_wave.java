public class array_wave {
	static void wave(int arr[]) {
		for(int i = 0; i<arr.length; i+=2) {
			if(((i+1)<arr.length)&&arr[i]<arr[i+1])
				swap(arr,i,i+1);
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	static int[] swap (int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}
	public static void main(String[] args) {
		int arr[] = {3,8,4,1,6,7,9};
		wave(arr);
	}
}
