import java.util.Scanner;

public class SumOf_OddDigits_and_EvenDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a no : ");
		int n = sc.nextInt();
		
		int odd_sum = 1;
		int even_sum = 1;
		int temp = n;
		int temp2= 0;
		
		while(temp2>0) {
			temp2 = temp%10;
			temp/=10;
			if(temp2%2 == 0)
				even_sum*=temp2;
			else
				odd_sum*=temp2;
		}
		
//		for (int i = 0; i<n.length(); i++) {
//			if(n.charAt(i)%2 == 0)
//				even_sum*=(int)n.charAt(i);
//			else
//				odd_sum*=(int)n.charAt(i);
//		}
		System.out.println("The sum of digits : " + even_sum+odd_sum);
		
		

	}

}
