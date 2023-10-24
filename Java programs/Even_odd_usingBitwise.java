import java.util.Scanner;

public class Even_odd_usingBitwise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a no : ");
		int x = sc.nextInt();
		
//		if(x%2 == 0)
//			System.out.println("Even");
//		else
//			System.out.println("Odd");
		
		
//		if((x^1) == x-1)
//			System.out.println("Odd");
//		else
//			System.out.println("Even");
		
//		if((x&1) == 1)
//			System.out.println("Odd");
//		else
//			System.out.println("Even");

		if((x|1) <= x)
			System.out.println("Odd");
		else
			System.out.println("Even");
		
		
		sc.close();
	}

}
