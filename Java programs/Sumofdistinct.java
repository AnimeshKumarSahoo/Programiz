import java.util.Arrays;
public class Sumofdistinct {
public static void SumD(int arr[],int size) {
	int sum=0;
	Arrays.sort(arr);
	for(int i=0;i<size-1;i++) {
		if(arr[i]!=arr[i+1]) {
			sum+=arr[i];
		}
	}
	sum+=arr[size-1];
	System.out.println(sum);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,2,3,3,5};
int size=arr.length;
System.out.println("Sum of the distinct elements is:");
SumD(arr,size);
	}

}


    

