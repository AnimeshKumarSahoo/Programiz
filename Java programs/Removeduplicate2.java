

import java.util.Arrays;
public class Removeduplicate2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {20,10,10,50,40};
		int size=arr.length;
		int k=remove(arr,size);
		for(int i=0;i<k;i++) {
		System.out.print((arr[i]+" "));
	}
	}
		public static int remove(int arr[],int size){
			int j=0;
			Arrays.sort(arr);
			for(int i=1;i<size;i++) {
				if(arr[i]!=arr[j]) {
					arr[j]=arr[i];
                    j++;
				}
			}
			int k=j+1;
			return k;
			}	

}


    

