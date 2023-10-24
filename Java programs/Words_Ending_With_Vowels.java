import java.util.Scanner;

public class Words_Ending_With_Vowels {

	public static void main(String[] args) {
		// *Using split
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();

		if (s.equals(""))
			System.out.println("The String is empty");
		else {
			String words[] = s.split(" ");

			for (int i = 0; i < words.length; i++) {
				int index = words[i].length() - 1;
				char vowel = words[i].toLowerCase().charAt(index);

				if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u') {
					System.out.println(words[i]);
				}
			}
		}
		
		sc.close();

	}

}
