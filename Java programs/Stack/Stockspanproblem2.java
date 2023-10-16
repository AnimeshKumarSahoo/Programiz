package Stack;
import java.util.Arrays;
import java.util.Stack;
public class Stockspanproblem2 {
	int top=-1;
	public boolean isEmpty()
	{return top==-1;}
	static int[] calculateSpanUsingStack(int price[],int n,int s[])
	{
	Stack<Integer> stk=new Stack<Integer>();
	stk.push(0);
    s[0]=1;
   for(int i=1;i<price.length;i++)
	{
	while(!stk.isEmpty()&& price[stk.peek()]<=price[i]) 
    {stk.pop();
	}
	s[i] = (stk.isEmpty()) ? (i + 1) : (i - stk.peek());
	stk.push(i);
	}
	return s;
}
	static void printarray(int arr[])
	{
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int price[]= {6,5,4,3,2,4,5,7,9};
int n=price.length;
int s[]=new int[n];
calculateSpanUsingStack(price, n,s);
printarray(s);
	}
    
}
