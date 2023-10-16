package DSA;
public class Decimaltobinary {
    public static void main(String args[]){
    	int[] arr = new int[10];
  int n=15;
        int i = 0;
        while (n > 0)
        {
            arr[i] = n % 2;
            n = n / 2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--)
            System.out.print(arr[j]);
    }
}
     
    
    