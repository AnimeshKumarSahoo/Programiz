import java.util.Scanner;
public class Doublelinkedlist {
    public static Node head;
    public static Node tail;
    public class Node {
        public int value;
        public Node next;
        public Node prev;

        public Node(int v, Node nxt, Node prv) {
            value = v;
            next = nxt;
            prev = prv;
        }
      //  public Node(int v) {
        //    value = v;
          //  next = null;
            //prev = null;
        }
    public void insertbeg(int value) {
        Node newnode = new Node(value, null, null);
        if (head == null) {
            head = tail = newnode;
        } else {
            newnode.next = head;
            newnode.prev = null;
                head.prev = newnode;
            head = newnode;
        }
    }

    public void insertend(int value) {
        Node newnode = new Node(value, null, null);
        if (head == null) {
            head = tail = newnode;
        } else {
            tail.next = newnode;
           newnode.prev = tail;
            tail = newnode;
            tail.next = null;
        }
    }

    public void deletebeg() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            head = head.next;
            head.next.prev = head;
        }
    }

    public void deleteend() {
        Node temp=head;
        if (tail == null)
            return;
        else {
            while(temp.next.next!=null){
                temp=temp.next;}
            temp.next = null;
            tail=temp;
        }
    }
    public void display() {
        Node temp = head;
        if (head == null) {
            System.out.println("List is empty");
        }
        System.out.println("The elements of the double linked lists are:");
        while (temp != null) {
          //  if(temp.next != null)
                System.out.print(temp.value + "-->");
            //else
              //
                System.out.print(temp.value);
            temp = temp.next;
        }
        System.out.println();
    }

    public static int size(Node temp) {
        int c = 0;
        while (temp != null) {
            c++;
            temp = temp.next;
        }
        return c;
    }
    public static void main(String args[]) {
        Doublelinkedlist ob = new Doublelinkedlist();
        //ob.insertbeg(10);
        //ob.insertbeg(20);
        //ob.insertbeg(30);
        //ob.insertbeg(40);
        //ob.display();
        ob.insertend(20);
        ob.insertend(30);
        ob.insertend(50);
        ob.insertend(40);
        ob.display();
        int res = size(head);
        System.out.println(res);
        ob.deleteend();
        ob.display();
        
    }
}
