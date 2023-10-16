package Queue;
import java.util.Deque;
import java.util.LinkedList;
 
public class SlidingWindow {
    static void printMax(int arr[], int N, int K)
    {
        Deque<Integer> Q = new LinkedList<Integer>();
        int i;
        for (i = 0; i < K; i++) {
            while (Q.size()>0 && arr[i] >= arr[Q.peekLast()])
                Q.removeLast();
            Q.addLast(i);
        }
        for (; i < N; i++) {
            System.out.print(arr[Q.peek()] + " ");
            while ((!Q.isEmpty()) && Q.peekFirst() <= i - K)
                Q.removeFirst();
            while ((!Q.isEmpty()) &&  arr[i] >= arr[Q.peekLast()])
                Q.removeLast();
            Q.addLast(i);
        }
        System.out.print(arr[Q.peek()]);
    }
    public static void main(String[] args)
    {
        int arr[] = { 12, 1, 78, 90, 57, 89, 56 };
        int K = 3;
        printMax(arr, arr.length, K);
    }
}
