package CSW2;

public class binary_search {
	
	static int binary(int arr[], int key) {
		int lb = 0, ub = arr.length - 1;
		while(ub - lb > 1) {
			int mid = (ub+lb)/2;
			if(key == arr[mid]) {
				return mid ;
				
			}
			else if(key < arr[mid]) {
				ub = mid - 1;
			}
			else if(key > arr[mid]) {
				lb = mid + 1;
			}
			else {
				return -1;
			}
		}
			return -1;
	}

	public static void main(String[] args) {
		int arr[] = {1,3,4,6,7,9,14,17};
		int key = 14;
		if(binary(arr, key) == -1) {
			System.out.print("Not found");
		}
		else
			System.out.print(binary(arr, key));
		
		
	}

}
