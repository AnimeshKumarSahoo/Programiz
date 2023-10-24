public class Q5_a {
	
	static void reverse(int n, int i , int j) {
		int arr [] = new int [64];
		int temp = n;
		for(int x= 63; x>=0;x--) {
			arr[x] = temp%2;
			temp/=2;
		}
		int k = arr[j];
		arr[j]= arr[i];
		arr[i] = k;
		for(int x = 0; x<arr.length; x++)
			System.out.print(arr[x]);
	}
	public static void main(String[] args) {
//		int n = 6, i = 60, j = 63;
//		reverse(n,i,j);

	}

}
