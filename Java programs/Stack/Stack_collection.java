package Stack;
import java.util.Stack;
import java.util.ArrayDeque;
public class Stack_collection {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer>stack=new Stack<Integer>();
		int temp1,temp2;
		stack.push(5);
		stack.push(4);
		stack.push(3);
		stack.push(2);
		stack.push(1);
System.out.println("Stack is:"+stack);
System.out.println("Stack size is:"+stack.size());
temp1=stack.pop();
System.out.println("Deleted element in the stack is:"+temp1);
temp2=stack.peek();
System.out.println("Top most element in the stack is:"+temp2);
System.out.println("Stack is empty:"+stack.isEmpty());
ArrayDeque<Integer>stack1=new ArrayDeque<Integer>();
int temp,temp3;
stack.push(5);
stack.push(4);
stack.push(3);
stack.push(2);
stack.push(1);
System.out.println("Stack is:"+stack);
System.out.println("Stack size is:"+stack.size());
temp=stack.pop();
System.out.println("Deleted element in the stack is:"+temp1);
temp3=stack.peek();
System.out.println("Top most element in the stack is:"+temp2);
System.out.println("Stack is empty:"+stack.isEmpty());
}

	}
