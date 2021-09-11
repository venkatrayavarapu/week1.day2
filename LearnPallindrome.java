package week1.day2.assignments;

/*
Pallindrome of a number
=======================
Pseudocode
STEP 1 : Declare the variable as int =454;
STEP 2 : Hold the number in a temporary variable.
STEP 3 : Reverse that number.
STEP 4 : Compare the temporary number with the reversed number.
STEP 5 : If both numbers are the same, print "palindrome number".
STEP 6 : Else print "not palindrome number".
 */

public class LearnPallindrome {

	public static void main(String[] args) {
		int number = 454, temp = 454, remainder = 0, reverse = 0;

		while (number != 0) {
			remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}
		System.out.println("******************" + reverse);
		if (temp == reverse) {
			System.out.println("Given number is pallindrome: " + reverse);
		} else {
			System.out.println("Given number is not a pallindrome");
		}
	}
}
