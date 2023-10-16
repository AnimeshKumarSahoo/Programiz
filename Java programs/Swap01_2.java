public class Swap01_2 {
	public static void Partition(int[] arr, int size) {
		int left = 0,count=0;
		int right = size - 1;
		int i = 0;
		while (i <= right) {
		if (arr[i] == 0) {
		swap(arr, i, left);
		count++;
		i += 1;
		left += 1;
		} else if (arr[i] == 2) {
		swap(arr, i, right);
		count++;
		right -= 1;
		}
		else {
			i+=1;
		}
		}
	}
		public static void swap(int arr[],int left,int right) {
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
		}
		public static void printer(int arr[],int n) {
			System.out.println("The sorted array is:");
			for(int i=0;i<n;i++) {
				System.out.println(arr[i]+" ");
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,1,1,2,0,2,2};
		int n=arr.length;
		Partition(arr,n);
		printer(arr,n);
	}

}


    

