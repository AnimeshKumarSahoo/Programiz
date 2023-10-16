package Queue;
import java.util.ArrayDeque;
public class Convertxy {
public static int convertxy(int X,int Y) {
	int steps=0;
	int index=0;
	int value;
	int arr[]=new int[100];
	ArrayDeque<Integer> que=new ArrayDeque<Integer>();
	que.add(X);
	while(que.size()!=0) {
		value=que.remove();
		arr[index++]=value;
		if(value==Y) {
			for(int i=0;i<index;i++) 
				System.out.print(arr[i]+" ");
				System.out.println();
				return steps;
			}
			steps++;
			if(value<Y) 
				que.add(value*2);
			else
			que.add(value-1);
	}
			return -1;
		}
	public static void main(String[] args) {
int ele=convertxy(2,7);
System.out.println("No of minimum steps required is:"+ele);

	}

}

