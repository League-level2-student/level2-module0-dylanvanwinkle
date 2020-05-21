package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static int sn;
	public static int ln;

	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] food = { "Pizza", "Apple", "bannana", "orange", "Lemon" };
		// 2. print the third element in the array
		System.out.println(food[2]);
		// 3. set the third element to a different value
		food[2] = "lime";
		// 4. print the third element again
		System.out.println(food[2]);
		// 5. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < food.length; i++) {
			System.out.println(food[i]);
		}

		// 6. make an array of 50 integers
		int[] n = new int[50];
		Random r = new Random();
		// 7. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < n.length; i++) {
			int ran = r.nextInt(300);
			n[i] = ran;
		}
		// 8. without printing the entire array, print only the smallest number in the
		// array
		sn = n[0];
		ln = n[0];
		for (int i = 1; i < n.length; i++) {
			if (sn > n[i]) {
				sn = n[i];
			}
			if (ln < n[i]) {
				ln = n[i];
			}
		}
		System.out.println(sn);
		System.out.println(ln);
		// 9 print the entire array to see if step 8 was correct
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}
		// 10. print the largest number in the array.
	}
}
