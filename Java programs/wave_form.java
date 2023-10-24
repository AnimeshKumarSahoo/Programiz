package CSW.CSW2;

public class wave_form {
	
	static void print(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	static void wave(int arr[]) {
		
		for(int i = 1; i<arr.length; i+=2) {
			if(((i+1)<arr.length)&&arr[i]>arr[i-1]) {
				swap(arr,i,i-1);
//				print(swap(arr,i,i-1));
			}
			if(((i+1)<arr.length)&&arr[i]>arr[i+1]) {
				swap(arr,i,i+1);
//				print(swap(arr,i,i+1));
			}
		}
		print(arr);
	}
	static int[] swap (int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}
	public static void main(String[] args) {
		int arr[] = {80,90,70,95,4,8};
		wave(arr);
	}

}
