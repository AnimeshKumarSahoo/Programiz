package DSA;

import java.util.Scanner;

class area{
    int length;
    int breadth;
    area(int a, int b)
    {
         length = a;
         breadth = b;
    }
    public int Area()
    {
        return length * breadth;
    }
}
public class Areaofrect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter the lenght of Recatangle");
        a = sc.nextInt();
        System.out.println("Enter the breadth of Recatangle");
        b = sc.nextInt();
        area ob = new area(a,b);
        System.out.println("Area = "+ ob.Area());
    }
}
