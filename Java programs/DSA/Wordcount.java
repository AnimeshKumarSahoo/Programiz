package DSA;

public class Wordcount {

        public static void main(String[] args) {
            String inputString = "Java is a programming language.";
            inputString = inputString.trim();
            String[] words = inputString.split(" ");
            int wordCount = words.length;
            System.out.println("Number of words: " + wordCount);
        }
    }

