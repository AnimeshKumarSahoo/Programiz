
import java.util.Arrays;
public class Missingnumber_sorting {
public static void missing(int arr[],int size) {
	Arrays.sort(arr);
	int value=arr[0];
	int i=0;
	System.out.println("Missing numbers are:");
	while(i<size) {
		if(value==arr[i]) {
			value+=1;
			i+=1;
		}
		else {
			System.out.println(value);
			value+=1;
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,3,4,5,6,9};
int size=arr.length;
missing(arr,size);
	}

}


    

