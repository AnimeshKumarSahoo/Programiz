public class binary_search_recursion {

	static int binary(int arr[], int key, int lb, int ub, int mid) {
		if (ub < lb) {
			return -1;
		} else {
			mid = (ub + lb) / 2;
			if (key == arr[mid])
				return mid;
			else if (key < arr[mid])
				return binary(arr, key, lb, mid - 1, mid);
			else if (key > arr[mid])
				return binary(arr, key, mid + 1, ub, mid);
			else {
				return -1;
			}
		}

	}

	public static void main(String[] args) {
		int arr[] = { 1, 3, 4, 6, 7, 9, 14, 17 };
		int key = 14;
		key = binary(arr, key, 0, arr.length - 1, 0);
		System.out.println(key);
	}

}
