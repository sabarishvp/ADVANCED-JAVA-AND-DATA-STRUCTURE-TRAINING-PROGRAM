// Java program for the above approach
import java.util.*;

public class uniquecount {

	// Function that returns the count
	// of unique digits of number N
	public static void
	countUniqueDigits(int N)
	{
		// Initialize a variable to
		// store count of unique digits
		int res = 0;

		// Initialize cnt array to
		// store digit count
		int cnt[] = { 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0 };

		// Iterate through digits of N
		while (N > 0) {

			// Retrieve the last
			// digit of N
			int rem = N % 10;

			// Increase the count
			// of the last digit
			cnt[rem]++;

			// Remove the last
			// digit of N
			N = N / 10;
		}

		// Iterate through the
		// cnt array
		for (int i = 0;
			i < cnt.length; i++) {

			// If frequency of
			// digit is 1
			if (cnt[i] == 1) {

				// Increment the count
				// of unique digits
				res++;
			}
		}

		// Return the count of unique digit
		System.out.println(res);
	}

	// Driver Code
	public static void main(String[] args)
	{
		// Given Number N
		int N = 2234262;

		// Function Call
		countUniqueDigits(N);
	}
}
