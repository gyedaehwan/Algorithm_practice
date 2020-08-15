package algorithm;

import java.util.Scanner;

public class Insertion_sort {

	static void Insertion_sort(int[] arr, int size) {
		for (int i = 0; i < size; i++) {
			int tmp = arr[i];
			int j = i - 1;
			for (; j >= 0; j--) {
				if (arr[j] < tmp)
					break;
				arr[j + 1] = arr[j];
			}
			arr[j + 1] = tmp;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < N; i++)
			arr[i] = sc.nextInt();

		Insertion_sort(arr, N);

		for (int i = 0; i < N; i++)
			System.out.print(arr[i] + " ");
	}

}
