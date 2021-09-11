package week1.day2.assignments;

/*
Print the frequency of number in an array
=====================================
Step 1: Declare and initialize an array arr int[] arr={3,4,2,5,1,2,6,3,6,2,4,7,1}.

Step 2: Declare another array fr with the same size of array arr. It is used to store the frequencies of elements present in the array.

Step 3: Variable visited will be initialized with the value -1. It is required to mark an element visited that is, it helps us to avoid counting the same element again.

Step 4:The frequency of an element can be counted using two loops. One loop will be used to select an element from an array, and another loop will be used to compare the selected element with the rest of the array.

Step 5: Initialize count to 1 in the first loop to maintain a count of each element. Increment its value by 1 if a duplicate element is found in the second loop. (Since we have counted this element and didn't want to count it again. Mark this element as visited by setting fr[j] = visited. Store count of each element to fr)

Step 6: Finally, print out the element along with its frequency.
*/

public class PrintFrequencyOfNumInArray {
	public static void main(String[] args) {
		int[] arr = { 3, 4, 2, 5, 1, 2, 6, 3, 6, 2, 4, 7, 1 };
		int[] nonDup = { 1, 2, 3, 4, 5, 6, 7 };
		int flag = 0;
		for (int incr = 0; incr < nonDup.length; incr++) {

			for (int iincr = 0; iincr < arr.length; iincr++) {
				if (nonDup[incr] == arr[iincr]) {
					flag++;
				}
			}
			System.out.println(nonDup[incr] + " occured " + flag + " times");
			flag = 0;
		}
	}
}
