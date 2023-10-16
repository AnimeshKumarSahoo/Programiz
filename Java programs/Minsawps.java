
public class Minsawps {
	public static int minSwaps(int arr[], int size, int val)
	{
	int swapCount = 0;
	int first = 0;
	int second = size - 1;
	int temp;
	while (first < second)
	{
		if (arr[first] <= val)
		first += 1;
		else if (arr[second] > val)
		second -= 1;
		else
		{
		temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
		swapCount += 1;
		}
		}
		return swapCount;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,34,67,32,22};
		int n=arr.length;
		int val=34;
		int c=minSwaps(arr,n,val);
		System.out.println("Min swaps is:"+c);
		System.out.println("Array after the min swaps is:");
		for(int i=0;i<n;i++){
			System.out.println(arr[i]+" ");
		}
		
	
	}

}


    

