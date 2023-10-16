package Queue;
import java.util.Queue;
import java.util.LinkedList;
public class JosephusProblem {
public static int result(Queue<Integer> q,int k) {
	while(q.size()!=1) {
		int j=1;
		while(j<k) {
			int temp=q.peek();
			q.add(temp);
			q.remove();
			j++;
		}
		q.remove();
	}
	return q.peek();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Queue<Integer> q=new LinkedList<>();
int n=5;
int k=2;
int i=1;
while(i<=n) {
	q.add(i);
	i++;
}
int ele=result(q,k);
System.out.println("The element which is saved is:"+ele);

	}

}


    

