package Stack;
import java.util.Scanner;
public class Stackusingarray {
public int capacity=1000;
private int[]data;
private int top=-1;
public Stackusingarray() {
	data=new int[capacity];
}
public Stackusingarray(int size) {
	data=new int[capacity];
	capacity=size;
}
public boolean isEmpty() {
	return (top==-1);
}
public  int size() {
	return (top+1);
}
public void print() {
for (int i = top; i > -1; i--) {
System.out.print(" " + data[i]);
}
}
public  void push(int value) throws IllegalStateException {
if (size() == data.length) {
throw new IllegalStateException("StackOvarflowException"); }
top++;
data[top] = value;
}
public int pop() {
if (isEmpty()) {
throw new IllegalStateException("StackEmptyException"); }
int topVal = data[top];
top--;
return topVal;
}
//public int top() throws IllegalStateException {
//if (isEmpty()) {
//throw new IllegalStateException("StackEmptyException"); }
//return data[top];

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the stack");
		int size=sc.nextInt();
		Stackusingarray ob=new Stackusingarray(size);
		for(int i=0;i<size;i++) {
			ob.push(sc.nextInt());
		}
		ob.print();
		ob.pop();
		System.out.println();
		ob.print();
		// TODO Auto-generated method stu
	}

}


    

