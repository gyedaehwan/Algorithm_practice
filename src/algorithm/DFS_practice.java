package algorithm;

import java.util.Scanner;

public class DFS_practice {
	static int node_count;
	static int edge_count;

	static void dfs(int cur, boolean[] node, boolean[][] edge) {
		// 거쳐간 노드 true
		node[cur] = true;
		System.out.print(node[cur] + " ");

		for (int i = 1; i < node_count; i++) {
			if (node[i] || !edge[cur][i])
				continue;
			// 이미 거쳐간 노드 , 혹은 없는 간선
			dfs(i, node, edge);

		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		node_count = sc.nextInt() + 1;
		edge_count = sc.nextInt();

		boolean[] node = new boolean[node_count + 1];
		boolean[][] edge = new boolean[node_count + 1][node_count + 1];

		for (int i = 0; i < edge_count; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();

			edge[u][v] = true;
		}
	}

}
