import java.io.*;
class sumequaltovalue {
    static void chkPair(int A[],int B[], int size,int size1, int x)
    {
        System.out.println("The sum of the elements whose sum equal to the value:");
        for (int i = 0; i < size; i++) {
            for (int j =0; j < size1; j++) {
                if (A[i] + B[j] == x) {
                System.out.println(A[i]+" "+B[j]);
                }
            }
        }
    
    }
 
    public static void main(String[] args)
    {
        int A[] = { 0, -1, 2, -3, 1 };
        int B[]={7,-1,4};
        int x = -2;
        int size = A.length;
        int size1 = B.length;
 chkPair(A,B, size,size1, x);
       
        }
    }
