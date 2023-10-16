import java.util.Scanner;

//import org.w3c.dom.Node;
class CNode{
    public int data;
    public CNode next;
    CNode(int d){
this.data=d;
this.next=null;
    }
}
public class Circularlinkedlist {
    public static CNode head;
    public static CNode tail;
  static  Scanner sc=new Scanner(System.in);
    public static void insertbeg(){
        System.out.println("Enter the data part");
        int d=sc.nextInt();
        CNode p=new CNode(d);
        if(head == null) {  
           head = p;  
           tail = p;  
       }  
       else {    
           p.next = head;  
           head = p;   
           tail.next = head;  
       }  
   }  
   public static void insertend(){
    System.out.println("Enter the data part");
        int d=sc.nextInt();
        CNode p=new CNode(d);
        if(head == null) {  
           head = p;  
           tail = p;  
       }  
       else {    
           tail.next = p;  
           tail = p;   
           tail.next = head;  
       }
    }
   public static void insertanyloc(){
    CNode temp=head;
    System.out.println("Enter at what position you want to insert");
    int pos=sc.nextInt();
    if(head==null){
    System.out.println("List is empty");
    }
    if(pos==1){
        insertbeg();
    }
    else{
        System.out.println("Enter the data to be inserted");
        int d=sc.nextInt();
        CNode p=new CNode(d);
        for(int i = 1; i < pos-1; i++)
        temp = temp.next;
      p.next = temp.next;
      temp.next = p;  
    }
  }
  public static void deleteend(){
    CNode temp=head;
    if(head==null){
        System.out.println("List is empty");
    }
    while(temp.next!=tail){
        temp=temp.next;
    }
    temp.next=null;
    tail=temp;
  }
  public static void deletebeg(){
    CNode temp=head;
    if(head==null){
        System.out.println("List is empty");
    }
    head=head.next;
    head=head.next;
  }
        public static void display(){
            CNode temp=head;
            if(head==null){
                System.out.println("List is empty");
            }
            do{
                System.out.print(temp.data+"-->");
                temp=temp.next;
            }while(temp!=tail.next);
            }
            public static void containsNode(int searchValue) {
   CNode currentNode = head;
boolean c=false;
int i=1;
    if (head == null) {
        c=false;
    } else {
        do {
            if (currentNode.data == searchValue) {
                c= true;
                break;
            }
            i++;
            currentNode = currentNode.next;
        } while (currentNode != head);
        if(c)  
        System.out.println("Element is present in the list at the position : " + i);  
   else  
        System.out.println("Element is not present in the list");  
}  
}  
public static void main (String args[]){
System.out.println("Enter the no of node in a CLL");
int n=sc.nextInt();
for(int i=0;i<n;i++){
    insertend();
}
display();
//insertanyloc();
//display();
///deleteend();
//System.out.println();
//deletebeg();
//display();
containsNode(4);
containsNode(5);

}

}
    


