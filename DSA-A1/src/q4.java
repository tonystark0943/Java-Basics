import java.util.Scanner;

public class q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter few characters: ");
		String characters = sc.next();
		Permutations(characters, "");
		sc.close();
	}
    public static void Permutations(String str, String result) {
        if (str.length() == 0) {
            System.out.println(result);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            Permutations(remaining, result + currChar);
        }
    }
}
