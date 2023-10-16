
import java.util.HashSet;
public class Missing2 {
	public static void missing(int arr[],int size,int upperrange) {
		HashSet<Integer>st=new HashSet<Integer>();
		int i=0;
		while(i<size) {
			st.add(arr[i]);
			i+=1;
		}
		System.out.println("The hash set:"+st);
	 i=1;
     System.out.println("Missing elements are:");
	while(i<=upperrange) {
		if(st.contains(i)==false) {
			System.out.println(i);
		}
			i++;
			
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,3,5,6,7,8};
int size=arr.length;
missing(arr,size,8);

	}

}


    

