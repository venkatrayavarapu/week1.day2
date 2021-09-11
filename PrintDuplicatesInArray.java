package week1.day2.assignments;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		int flag = 0;
		for (int incr = 0; incr < arr.length; incr++) {
			for (int iincr = 0; iincr < arr.length; iincr++) {
				if (arr[incr] == arr[iincr]) {
					flag++;
				}
			}
			if (flag > 1) {
				System.out.print(arr[incr]+" ");
				flag = 0;
			}
		}

	}
}