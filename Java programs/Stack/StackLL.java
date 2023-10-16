package Stack;
public class StackLL {
   private Node head = null;
	private int size = 0;
	class Node {
	private int value;
	private Node next;
	public Node(int v, Node n) {
	value = v;
	next = n;
	}
	}
	public int size() {
	return size;
	}
	public boolean isEmpty() {
	return size == 0;
	}
	public int peek() throws IllegalStateException {
	if (isEmpty()) {
	throw new IllegalStateException("StackEmptyException");
	}
	return head.value;
	}
	public void push(int value) {
	head = new Node(value, head);
	size++;
	}
	public int pop() throws IllegalStateException {
		if (isEmpty()) {
		throw new IllegalStateException("StackEmptyException");
		}
		int value = head.value;
		head = head.next;
		size--;
		return value;
		}
		public void print() {
		Node temp = head;
		while (temp != null) {
		System.out.print(temp.value + " ");
		temp = temp.next;
		}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackLL s = new StackLL();
		s.push(1); 
		s.push(2);
		s.push(3);
		s.print();
		System.out.println();
		int res=s.size();
		System.out.println("The size of the stack is:"+res);
		System.out.println();
        System.out.println(s.pop());
		System.out.println(s.pop());
		//System.out.println(s.pop());
		//
		s.print(); 
		}
		}
	

        