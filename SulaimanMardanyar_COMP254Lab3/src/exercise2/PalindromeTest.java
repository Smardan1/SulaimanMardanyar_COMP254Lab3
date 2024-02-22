package exercise2;
import java.util.Scanner;
public class PalindromeTest {

	public static boolean palindrome(String s) {
		if (s.length() <= 1) {
			return true;
			//there are no more values to check
			//is flawed if no check done before passing string on first function call in main.
		}
		if (s.charAt(0) == s.charAt(s.length() -1)) {
			return palindrome(s.substring(1, s.length() -1));
			// recursive call providing a substring of s that starts from first position and last position
			// this removes those two and allows us to check the next two in line.
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string to check: ");
		// racecar -> 7 chars
		// deed -> 4 chars
		// gohangasalamiimalasagnahog -> 26?
		String s = input.nextLine();
		if(s.length() == 0) {
			System.out.println("Please rerun and enter a valid input");
		} else {
			boolean result = palindrome(s);
			System.out.println(result);
		}
	}
}
