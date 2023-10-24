public class max_path_sum {

	static void max_path(int arr1[], int arr2[]) {
		int i = 0, j = 0, sum1 = 0, sum2 = 0, result = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				sum1 += arr1[i];
				i++;
			} else if (arr1[i] > arr2[j]) {
				sum2 += arr2[j];
				j++;
			} else {
				result += Math.max(sum1, sum2);
				result += arr1[i];
				sum1 = 0;
				sum2 = 0;
				i++;
				j++;
			}
		}
		while (i < arr1.length) {
			sum1 += arr1[i];
			i++;
		}
		while (j < arr2.length) {
			sum2 += arr2[j];
			j++;
		}
		result += Math.max(sum1, sum2);

		System.out.println("The max sum is : " + result);
	}

	public static void main(String[] args) {
		int arr1[] = { 12, 13, 18, 20, 22, 26, 70 };
		int arr2[] = { 11, 15, 18, 19, 20, 26, 30, 31 };
		max_path(arr1, arr2);
	}

}
