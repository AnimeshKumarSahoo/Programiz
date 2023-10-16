package Queue;
import java.util.Scanner;
class queue{
    int capacity,front,rear,count;
    int arr[];
    queue(int size){
        front=0;
        rear=-1;
        capacity=size;
        arr=new int[capacity];
    }
    public boolean isFull(){
        return (size()==capacity);
    }
    public boolean isEmpty(){
        return (size()==0);
    }
    public int size(){
        return count;
    }
    public void enqueue(int item){
        if(isFull()){
            System.out.println("Queue is full");
        }
        rear=rear+1 % capacity;
        arr[rear]=item;
        count++;
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("queue is empty");
        }
        int value=arr[front];
        front=front+1 % capacity;
        count--;
        }
    
    public void display(){
        if(size()>capacity){
            System.out.println("Queue does not exists");
        }
        for(int i=front;i<=rear;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
public class Queueusingarray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the queue");
        int size=sc.nextInt();
        queue ob=new queue(size);
        System.out.println("Enter the elements of the queue");
        for(int i=0;i<size;i++){
            ob.enqueue(sc.nextInt());
        }
        ob.display();
        ob.dequeue();
        System.out.println();
        
        ob.dequeue();
        ob.display();
    }

}
