package algorithm;

import java.util.Scanner;

public class Binary_search {

	static boolean Binary_search(int[] arr, int search) {
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int mid = (left + right) / 2;
			if (search < arr[mid])
				right = mid - 1;
			else if (search > arr[mid])
				left = mid + 1;
			else
				return true;
		}

		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < N; i++)
			arr[i] = sc.nextInt();

		int M = sc.nextInt();
		int[] input = new int[M];
		for (int i = 0; i < M; i++)
			input[i] = sc.nextInt();

		boolean[] isFind = new boolean[N];

		for (int i = 0; i < M; i++) {
			if (Binary_search(arr, input[i]))
				isFind[i] = true;
			else
				isFind[i] = false;
		}

		for (int i = 0; i < M; i++) {
			if (isFind[i])
				System.out.println("exist ");
			else
				System.out.println("not exist ");
		}

	}

}
