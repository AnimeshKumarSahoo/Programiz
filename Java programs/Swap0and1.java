public class Swap0and1 {
	public static int Partition(int arr[],int n) {
		int left=0;
		int right=n-1;
		int c=0;
		while(left<right) {
			while(arr[left]==0) {
				left+=1;
			}
			while(arr[right]==1) {
				right-=1;
			}
			if(left<right) {
				swap(arr,left,right);
				c++;
			}
		}
		return c;
	}
	public static void swap( int arr[],int left,int right) {
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
int arr[]= {0,1,1,1,0,0,1};
int n=arr.length;
int count=Partition(arr,n);
printer(arr,n);
System.out.println("The minimum no of swaps required is:"+count);
}
	

}


    

