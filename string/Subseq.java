// Java program for the above approach


class Subseq{

	// Function to calculate the number of
	// subsequences of "01"
	static int countSubsequence(String S, int N, int K)
	{
		// Store count of 0's and 1's
		int C = 0, C1 = 0, C0 = 0;

		for (int i = 0; i < N; i++) {
			if (S.charAt(i) == '1')
				C1++;
			else if (S.charAt(i) == '0')
				C0++;
		}

		// Count of subsequences without
		// concatenation
		int B1 = 0;
		for (int i = 0; i < N; i++) {
			if (S.charAt(i) == '1')
				B1++;
			else if (S.charAt(i) == '0')
				C = C + (C1 - B1);
		}

		// Case 1
		int ans = C * K;

		// Case 2
		ans += (C1 * C0 * (((K) * (K - 1)) / 2));

		// Return the total count
		return ans;
	}

	// Driver Code
	public static void main(String[] args)
	{
		String S = "230013110087";
		int K = 2;
		int N = S.length();

		System.out.println(countSubsequence(S, N, K));
	}
}

// This code is contributed by Potta Lokesh
