package DSA;

public class Sumofrowsandcolumns {
    public static void main(String[] args) {    
        int rows, col, sumR, sumC;    
        int a[][] = {{1, 2, 3},{4, 5, 6}, {7, 8, 9}};        
          rows = a.length;    
        col = a.length;    
        for(int i = 0; i < rows; i++){    
            sumR = 0;    
            for(int j = 0; j < col; j++){    
              sumR = sumR + a[i][j];    
            }    
            System.out.println("Sum of " + (i+1) +" row: " + sumR);    
        }     
        for(int i = 0; i < col; i++){    
            sumC = 0;    
            for(int j = 0; j < rows; j++){    
              sumC = sumC + a[j][i];    
            }    
            System.out.println("Sum of " + (i+1) +" column: " + sumC);    
        }    
    }    
}    

