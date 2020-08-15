package algorithm;

import java.util.Scanner;

public class SieveOfEratosthenes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// number of test case
		int T = sc.nextInt();
		final int MAX = 1000001;
		int[] input = new int[T];

		boolean[] arr = new boolean[MAX];

		arr[0] = false;
		arr[1] = false;
		int sqrt_MAX = (int) Math.sqrt(MAX);
		// System.out.println(sqrt_MAX);

		for (int i = 2; i < MAX; i++)
			arr[i] = true;

		for (int i = 2; i < sqrt_MAX; i++) {
			int idx = i;
			if (arr[idx]) {
				for (int j = idx * 2; j < MAX; j += idx)
					arr[j] = false;
			}
		}

		for (int i = 0; i < T; i++) {
			input[i] = sc.nextInt();
		}

		for (int i = 0; i < T; i++) {
			if (arr[input[i]])
				System.out.println("YES");
			else
				System.out.println("NO");
		}

	}

}
