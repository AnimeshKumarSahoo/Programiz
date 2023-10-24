
import java.util.*;

public class Count_a_or_A {

	public static void main(String[] args) {
		String str = "A Paragraph is the building blocks of paragraph. ";
//		String words[] = str.split(" ");
//		int count_a = 0;
//		int count_A = 0;
//		for(int i = 0; i<words.length; i++) {
//			if(words[i].substring(0, 1).equals("A"))
//				count_A++;
//			else if(words[i].substring(0, 1).equals("a"))
//				count_a++;
//		}
//		System.out.println("Small a = "+ count_a + " and Capital A = " + count_A );

		ArrayList arr = new ArrayList();
		String s="";
		for(int i=0;i < str.length();i++) {
			s = s + str.charAt(i);
			if(str.charAt(i)== ' ') {
				arr.add(s);
				s= "";
			}
		}
		
		for(int i=0;i < arr.size();i++) {
			
			boolean isTrue = true;
			String x = (String) arr.get(i);
			String batman = "";
			char ch[] = x.toCharArray();
			
			for (char c: ch) {
				
				
				if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
					isTrue = false;
					continue;}
				else
					batman = batman + c;
				}
			
			if (isTrue) {
				batman = "";
				
			}
			
			arr.set(i, batman);
			}
	}
}
