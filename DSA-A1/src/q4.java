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
        }
        int n=str.length();
        for (int a = 0; a < n; a++) {
        	for (int b = 0; b < n; b++) {
        		if(a!=b) {
        			for (int c = 0; c < n; c++) {
        				if (a!=c && b!=c) {
        					for (int d = 0; d < n; d++) {
        						if (a!=d && b!=d && c!=d) {
        							for (int e = 0; e < n; e++) {
        								if (a!=e && b!=e && c!=e && d!=e) {
        									for (int f = 0; f < n; f++) {
                        						if(a!=f && b!=f && c!=f && d!=f && e!=f)
                        							System.out.println(str.charAt(a)+" "+str.charAt(b)+" "+str.charAt(c)+" "+str.charAt(d)+" "+str.charAt(e)+" "+str.charAt(f)+" ");
                        					}
        								}
                    				}
        						}
                			}
        				}
            		}
        		}
        	}
        }
    }
}
