import java.util.Scanner;

public class ne {
	    public static void generatePermutations(String str, String result) {
	        if (str.length() == 0) {
	            System.out.println(result);
	            return;
	        }

	        for (int i = 0; i < str.length(); i++) {
	            char currentChar = str.charAt(i);
	            String remainingString = str.substring(0, i) + str.substring(i + 1);
	            generatePermutations(remainingString, result + currentChar);
	        }
	    }

	    public static void main(String[] args) {
	        String characters = "car";

	        // Generate all permutations
	        generatePermutations(characters, "");
	    }
	
}
