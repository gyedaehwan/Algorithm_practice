package algorithm;

import java.util.Scanner;

public class DFS {
	static boolean edge[][];
	static boolean visited[];
	static int N;
	static int M;

	static void dfs(int cur) {
		visited[cur] = true;
		System.out.print(cur + " ");
		for (int i = 1; i <= N; i++) {
			if (visited[i] || !edge[cur][i])
				continue;
			dfs(i);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// ������ ����
		N = sc.nextInt();

		// ������ ����
		M = sc.nextInt();

		edge = new boolean[N + 1][N + 1];
		visited = new boolean[N + 1];

		// �������� u, �������� v
		int u, v;

		for (int i = 0; i < M; i++) {
			u = sc.nextInt();
			v = sc.nextInt();
			edge[u][v] = true;
		}
		dfs(1);

	}
}