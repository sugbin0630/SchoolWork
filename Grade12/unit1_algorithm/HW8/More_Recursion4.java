package Grade12.unit1_algorithm.HW8;

import java.util.Scanner;

/*
 * More_Recursion4.java
 * Made by Austin
 * Made in 2022 10/14
 * Purpose: Recursion with String
 */
public class More_Recursion4 {
	public static void main(String[] args) {
		String str;
		String str2;
		char c;
		Scanner sc = new Scanner(System.in);
		System.out.println("String Length");
		System.out.print("Enter String: ");
		str = sc.nextLine();
		System.out.println("String length: " + length(str));

		System.out.println("\nCompare 2 Strings");
		System.out.print("Enter first String: ");
		str = sc.nextLine();
		System.out.print("Enter second String: ");
		str2 = sc.nextLine();
		if (equalsIgnoreCase(str, str2)) {
			System.out.println(str + " and " + str2 + " are same");
		} else {
			System.out.println(str + " and " + str2 + " are not same");
		}

		System.out.println("\nFind char from String");
		System.out.print("Enter String: ");
		str = sc.nextLine();
		System.out.print("Enter char: ");
		c = sc.nextLine().charAt(0);
		System.out.println(countChar(str, c) + " chars in " + str);

		System.out.println("\nCompare 2 Strings without vowel");
		System.out.print("Enter first String: ");
		str = sc.nextLine();
		System.out.print("Enter second String: ");
		str2 = sc.nextLine();
		if (equalsIgnoreVowel(str, str2)) {
			System.out.println(str + " and " + str2 + " are same");
		} else {
			System.out.println(str + " and " + str2 + " are not same");
		}

		System.out.println("\nMove char to end");
		System.out.print("Enter String: ");
		str = sc.nextLine();
		System.out.print("Enter char: ");
		c = sc.nextLine().charAt(0);
		System.out.println(moveToEnd(str, c));

		System.out.println("\nReverse String");
		System.out.print("Enter String: ");
		str = sc.nextLine();
		System.out.println(reverse(str));

		System.out.println("\nPalindrome");
		System.out.print("Enter String: ");
		str = sc.nextLine();
		if (palindrome(str)) {
			System.out.println(str + " is Palindrome");
		} else {
			System.out.println(str + " is not Palindrome");
		}
		sc.close();
	}

	// Methods
	public static int length(String s) {
		if (s.isEmpty()) {
			return 0;
		} else {
			return 1 + length(s.substring(1));
		}
	}

	public static boolean equalsIgnoreCase(String s1, String s2) {
		if (Character.toUpperCase(s1.charAt(0)) == Character.toUpperCase(s2.charAt(0)) && length(s1) == length(s2)
				&& length(s2) == 1) {
			return true;
		} else if (s1.charAt(0) == s2.charAt(0) && length(s1) == length(s2)) {
			return equalsIgnoreCase(s1.substring(1), s2.substring(1));
		} else {
			return false;
		}
	}

	public static int countChar(String s, char c) {
		if (s.isEmpty() != true && s.charAt(0) == c) {
			return 1 + countChar(s.substring(1), c);
		} else if (s.isEmpty() != true) {
			return countChar(s.substring(1), c);
		} else {
			return 0;
		}
	}

	public static boolean equalsIgnoreVowel(String s1, String s2) {
		return equalsIgnoreVowel(s1, s2, 0, 0);
	}

	public static boolean equalsIgnoreVowel(String s1, String s2, int i, int j) {
		if (i == s1.length() && j == s2.length()) {
			return true;
		}
		if (i == s1.length() || j == s2.length()) {
			return false;
		}
		if (checkVowel(s1.charAt(i))) {
			return equalsIgnoreVowel(s1, s2, i + 1, j);
		}
		if (checkVowel(s2.charAt(j))) {
			return equalsIgnoreVowel(s1, s2, i, j + 1);
		}
		if (s1.charAt(i) == s2.charAt(j)) {
			return equalsIgnoreVowel(s1, s2, i + 1, j + 1);
		}
		return false;
	}

	public static boolean checkVowel(char c) {
		switch (c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			return true;
		default:
			return false;
		}
	}

	public static String moveToEnd(String s, char x) {
		if (s.length() > 1) {
			if (s.charAt(0) == x) {
				return moveToEnd(s.substring(1), x) + x;
			} else {
				return s.charAt(0) + moveToEnd(s.substring(1), x);
			}
		} else {
			return s;
		}
	}

	public static String reverse(String s) {
		if (s.length() > 1) {
			return reverse(s.substring(1)) + s.charAt(0);
		} else {
			return s;
		}
	}

	public static boolean palindrome(String s) {
		if (s.length() <= 1) {
			return true;
		} else if (s.charAt(0) == s.charAt(s.length() - 1)) {
			return palindrome(s.substring(1, s.length() - 1));
		} else {
			return false;
		}
	}
}
