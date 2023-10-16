package Heap;
public class Minheap {
    private int[] Heap;
    private int size;
    private int maxsize;
    public Minheap (int maxsize)
    {
        this.maxsize = maxsize;
        this.size = 0;
 
        Heap = new int[this.maxsize];
        Heap[0] = Integer.MIN_VALUE;
    }
    private int parent(int pos) { return pos / 2; }
    private int leftChild(int pos) { return (2 * pos); }
    private int rightChild(int pos)
    {
        return (2 * pos) + 1;
    }
    private boolean isLeaf(int pos)
    {
 
        if (pos > (size / 2)) {
            return true;
        }
        return false;
    }
    private void swap(int fpos, int spos)
    {
 
        int tmp;
        tmp = Heap[fpos];
 
        Heap[fpos] = Heap[spos];
        Heap[spos] = tmp;
    }
   private void minHeapify(int pos)
   {     
     if(!isLeaf(pos)){
       int swapPos= pos;
       if(rightChild(pos)<=size)
          swapPos = Heap[leftChild(pos)]<Heap[rightChild(pos)]?leftChild(pos):rightChild(pos);
       else
         swapPos= leftChild(pos);
        
       if(Heap[pos]>Heap[leftChild(pos)] || Heap[pos]> Heap[rightChild(pos)]){
         swap(pos,swapPos);
         minHeapify(swapPos);
       }
        
     }      
   }
    public void insert(int element)
    {
 
        if (size >= maxsize) {
            return;
        }
 
        Heap[++size] = element;
        int current = size;
 
        while (Heap[current] < Heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }
    public void print()
    {
        for (int i = 1; i <= size / 2; i++) {
            System.out.print(" PARENT : " + Heap[i]+ " LEFT CHILD : " + Heap[2 * i]+ " RIGHT CHILD :" + Heap[2 * i + 1]);
 
            // By here new line is required
            System.out.println();
        }
    }
    public static boolean isMinHeap(int[] arr, int size) {
int lchild, rchild;

for (int parent = 0; parent < (size-1)/2; parent++) {
lchild = parent * 2 + 1;
rchild = parent * 2 + 2;
if(((lchild < size) && (arr[parent] > arr[lchild])) || ((rchild < size) && 
 (arr[parent] > arr[rchild])))
return false;
}
return true;
} 
    public static void main(String[] args)
    {
        System.out.println("The Min Heap is ");
        Minheap minHeap = new Minheap(15);
        minHeap.insert(5);
        minHeap.insert(3);
        minHeap.insert(17);
        minHeap.insert(10);
        minHeap.insert(84);
        minHeap.insert(19);
        minHeap.insert(6);
        minHeap.insert(22);
        minHeap.insert(9);
        minHeap.print();
        if(isMinHeap(minHeap.Heap,9)){
            System.out.println("Yes it is a minheap");
        }
        else
System.out.println("Not a minheap");
            



        
        }
 
    }   

