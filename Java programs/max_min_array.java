package CSW.CSW2;
//import java.util.*;

public class max_min_array {
	
	static void print(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	static void max_min(int arr[]) {
		int[] a = new int[arr.length];
		int begin = 0, end = arr.length-1, i =0;
		while(i<arr.length) {
			if(i%2==0) {
				a[i] = arr[end];
				end--;
			}
			else {
				a[i] = arr[begin];
				begin++;
			}
			i++;
		}
		print(a);
	}
	
//	static void max_min(int arr[]) {
//		List a = Arrays.asList(arr);
//		int begin = 0, end = a.size()-1, i =0;
//		while(i<a.size()) {
//			if(i%2==0) {
//				a.set(end, i);
//				end--;
//			}
//			else {
//				a.set(begin, i);
//				begin++;
//			}
//			i++;
//		}
//		a.toArray();
//	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		max_min(arr);

	}

}
