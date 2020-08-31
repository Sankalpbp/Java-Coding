import java.util.*;

public class Palindrome {
		
	public String str;

	public Palindrome (String str) {
		this.str = str;
	}

	public boolean isPalindrome () {
		for (int i = 0; i < (this.str.length() / 2); ++i) {
			if (this.str.charAt(i) != this.str.charAt(this.str.length() - i - 1)) {
				return false;
			}
		}

		return true;
	}

	public static void main (String[] args) {
			
		System.out.println("Enter the string: ");
		Scanner input = new Scanner (System.in);
		String str = input.nextLine();

		Palindrome p = new Palindrome(str);

		if (p.isPalindrome()) {
			System.out.println ("String is a palindrome");
		} else {
			System.out.println ("String is not a palindrome");
		}
	}
}
