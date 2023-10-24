public class Longest_Word {
	
	static String store(String s, int i, int j) {
		String temp = "";
		temp = s.substring(j, i+1);
		
		return temp;
		
	}

	public static void main(String[] args) {

//*Using split
//		String s = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s";
//		String words[] = s.split(" ");
//		
//		String longest = words[0];
//		for(int i = 1; i<words.length; i++) {
//			if (words[i].length()>longest.length()){
//				longest = words[i];
//			}
//		}
//		System.out.println("The longest word is : " + longest);
		
	
		
//*Using ArrayList
//		String s = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s";
//		
//		ArrayList<String> words = new ArrayList<>();
//		String temp = "";
//		
//		for(int i = 0; i<s.length(); i++) {
//			temp = temp + s.charAt(i);
//			if(s.charAt(i)== ' ') {
//				words.add(temp);
//				temp= "";
//			}
//		}
//		
//		String longest = (String) words.get(0);
//		for(int i = 1; i<words.size(); i++) {
//			int word_size = ( words.get(i)).length();
//			if (word_size>longest.length()){
//				longest = (String) words.get(i);
//			}
//		}
//		
////		for(String word : words) {
////			if (word.length()>longest.length()){
////				longest = (String) words.get(i);
////			}
////		}
//		System.out.println("The longest word is : " + longest);

		
		
//*Without using Split
		String s = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s";
		
		String temp = "";
		String longest = temp;
		
		for(int i = 0, j = 0; i<s.length(); i++) {
			if (s.charAt(i)==' ') {
				temp=store(s,i,j);
				j=i+1;
			}
			if(temp.length()>longest.length()) {
				longest = temp;
				temp = "";
			}
		}
		
		System.out.println("The longest word is : " + longest);
	}

}
