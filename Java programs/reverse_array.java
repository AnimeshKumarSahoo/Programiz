public class reverse_array {
	static void reverse(int arr[]) {
		int i = 0, j = arr.length - 1;
		for(;i<=j; i++, j--) {
			arr = swap(arr, i, j);
		}
		for(int x=0; x<arr.length; x++) {
			System.out.print(arr[x] + " ");
		}
	}
	static int[] swap (int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		reverse(arr);
	}

}
