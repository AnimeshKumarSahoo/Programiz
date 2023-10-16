
public class Oddcount {
public static void oddcount(int arr[],int size) {
	int i;
	System.out.println("Odd occurances of the elements are:");
	for(i=0;i<size;i++) {
		int c=0;
		for(int j=0;j<size;j++) {
			if(arr[i]==arr[j]) {
				c++;
			}
		}
    
		if(c%2==1) {
			System.out.print(arr[i]+" ");
		}
	}

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,1,1,2,3,3,3,4};
int size=arr.length;
oddcount(arr,size);

	}

}


    

