package Stack;
import java.util.Arrays;
public class Stockspanproblem{
public static void calculateSpan(int price[],int n,int s[])
	{
	s[0]=1;
	for (int i=1;i<n;i++) {
		s[i]=1;
	 for(int j=i-1;(j>=0)&&(price[i]>=price[j]);j--)
	 {
        s[i]++;
    }
	}
	}
static void printArray(int arr[])
{
    System.out.println(Arrays.toString(arr));
}
public static void main(String[] args) {
int price[]= {6,5,4,3,2,4,5,7,9};
int s[]=new int[price.length];
calculateSpan(price,price.length, s);
printArray(s);  
}
}
