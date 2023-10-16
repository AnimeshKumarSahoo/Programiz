package DSA;
public class Uppertriangularandlowertriangular {
    static void lower(int arr[][], int row, int col)
    {
        int i, j;
        for (i = 0; i < row; i++)
        {
            for (j = 0; j < col; j++)
            {
                if (i < j)
                {
                    System.out.print("0" + " ");
                }
                else
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void upper(int arr[][],  int row, int col)
    {
        int i, j;
        for (i = 0; i < row; i++)
        {
            for (j = 0; j < col; j++)
            {
                if (i > j)
                {
                    System.out.print("0" + " ");
                }
                else
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    // Driver Code
    public static void main(String args[])
    {
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int row =arr.length;
        int col=arr.length;
        System.out.println("Lower triangular matrix: ");
        lower(arr, row, col);
        System.out.println("Upper triangular matrix: ");
        upper(arr, row, col);
    }
}

