package Queue;
import java.util.Scanner;

class CNode{
	public int data;
	public CNode next;
	CNode(int d){
		this.data=d;
		this.next=null;
	}
	
}
public class Queueusinglinkedlist {
	static Scanner sc = new Scanner(System.in);
	public static CNode head;
	public static CNode tail;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			
				System.out.println("Enter no of nodes to be created");
				int n=sc.nextInt();
				for(int i=0;i<n;i++) {
				enqueue();
			}
				display();
				System.out.println("Deletion after one node");
				dequeue();
			}
			public static void enqueue(){    
				System.out.println("Enter data of the node");
				int d=sc.nextInt();
		        CNode p = new CNode(d);        
		        if(head == null) {    
		            head = p;    
		            tail = p;    
		            p.next = head;    
		        }    
		        else {    
		            tail.next = p;    
		            tail = p;    
		            tail.next = head;    
		        }    
		    }
			 public static void dequeue() {
			    	   tail.next=tail.next.next;
		  	   display();
			}
			 public static void display() {
					CNode temp=tail.next;
					if(tail==null) {
						System.out.println("list is empty");
					}
					do {
						System.out.println(temp.data+" ");
						temp=temp.next;
					}while(temp!=tail.next);
				}
		}

	




    

