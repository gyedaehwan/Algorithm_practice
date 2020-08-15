package algorithm;

import java.util.Scanner;

public class Bubble_sort {

	static void Bubble_sort(int[] arr, int size) {

		for (int i = size - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}

			}
			for (int k = 0; k < size; k++) {
				System.out.print(arr[k] + " ");

			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < N; i++)
			arr[i] = sc.nextInt();

		Bubble_sort(arr, N);

		for (int i = 0; i < N; i++)
			System.out.print(arr[i] + " ");

	}

}
