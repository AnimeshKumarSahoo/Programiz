package Stack;

public class Fibonacci {
    static void fibonacci(int n)
    {
        int n1 = 0, n2 = 1;
        int c = 0;
        while (c < n) {
        System.out.print(n1 + " ");
            int n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
            c++;
        }
    }
    public static void main(String args[])
    {
        int n = 10;
        fibonacci(n);
    }
}
    

