
import java.util.Scanner;
public class Linkedlist {
    Node head;
  class Node
  {
    int data;
    Node next;
      Node (int x)
    {
      data = x;
      next = null;
    }
  }
  public void searchNode (int data)
  {
    Node current = head;
    int i = 1;
    boolean value = false;
    if (head == null)
      {
	System.out.println ("List is empty");
      }
    else
      {
	while (current != null)
	  {
	    if (current.data == data)
	      {
		value = true;
        break;
	      }
	    i++;
	    current = current.next;
	  }
      }
    if (value)
      System.out.println ("Element is present in the list at the position : " + i);
    else
      System.out.println ("Element is not present in the list");
  }
  public Node insert (int data)
  {
    Node newNode = new Node (data);
    newNode.next = head;
    head = newNode;
    return head;
  }
  public void addLast(int data) {
    Node newNode = new Node(data);
    if(head == null) {
    head = newNode;
    return;
    }
    Node lastNode = head;
    while(lastNode.next != null) {
    lastNode = lastNode.next;
    }
    lastNode.next = newNode;
  }
  
  public  int size()
  {
      Node temp = head;
      int count = 0;
      while (temp != null) {
          count++;
          temp = temp.next;
      }
      return count;
  }
public void reverse(){
  if(head==null || head.next==null){
    return;
  }
  Node prevnode=head;
  Node currnode=head.next;
  while(currnode!=null){
 Node nextnode=currnode.next;
 currnode.next=prevnode;
 prevnode=currnode;
 currnode=nextnode;
  }
  head.next=null;
  head=prevnode;
}
  public void display ()
  {
    Node node = head;
    while (node != null)
      {
	System.out.print (node.data + " ");
	node = node.next;
      }
    System.out.println ("\n");
  }
  boolean areIdentical(Linkedlist listb)
  {
      Node a = this.head, b = listb.head;
      while (a != null && b != null)
      {
          if (a.data != b.data){
              return false;}
          a = a.next;
          b = b.next;
      }
      if (a == null && b == null)
 return true;
 return false;
}
public  Node copyList() {
  Node headNode = null;
  Node tailNode = null;
  Node tempNode = null;
  Node curr = head;
  if (curr == null)
  return null;
  headNode = new Node(curr.data);
  tailNode = headNode;
  curr = curr.next;
  while (curr != null) {
  tempNode = new Node(curr.data);
  tailNode.next = tempNode;
  tailNode = tempNode;
  curr = curr.next;
  }
return headNode;
 }

      
  public static void main (String args[])
  {
    Scanner sc=new Scanner(System.in);
    Linkedlist ll = new Linkedlist ();
    ll.insert(1);
    ll.addLast(2);
    ll.addLast(3);
    ll.addLast(4);
    System.out.println("The elements of the linked lists are");
    ll.display();
    System.out.println("The number elements in the linked is:"+ll.size());
    Linkedlist ll1 = new Linkedlist ();
    ll1.insert(1);
    ll1.addLast(3);
    ll1.addLast(2);
    ll1.addLast(4);
    System.out.println("The elements of the 2nd linked lists are");
    ll.display();
    if (ll.areIdentical(ll1) == true)
    System.out.println("Identical ");
else
    System.out.println("Not identical ");
    System.out.println();
    ll.copyList();
    ll.display();
    System.out.println("The number elements in the linked is:"+ll1.size());
    System.out.println("Enter the element you want to search");
    int key=sc.nextInt();
    ll.searchNode(key);
    System.out.println("Reverse of the linked list is:");
    ll.reverse();

    ll.display();
   
  }
}
