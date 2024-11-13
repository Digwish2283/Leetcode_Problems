package Juspay;

import java.util.*;

public class NearestMeetingCell {

    private static final int INF = Integer.MAX_VALUE;

    public static long[] Dijkstra(List<List<Integer>> adj, int s) {
        PriorityQueue<long[]> pq = new PriorityQueue<>(Comparator.comparingLong(a -> a[0]));
        int v = adj.size();
        long[] ans = new long[v];
        Arrays.fill(ans, INF);
        ans[s] = 0;
        pq.add(new long[] {0, s});

        while (!pq.isEmpty()) {
            long[] curr = pq.poll();
            long dist = curr[0];
            int node = (int) curr[1];

            for (int neighbor : adj.get(node)) {
                if (dist + 1 < ans[neighbor]) {
                    ans[neighbor] = dist + 1;
                    pq.add(new long[] {dist + 1, neighbor});
                }
            }
        }

        return ans;
    }

    public static int minimumWeight(int n, int[] edges, int C1, int C2) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
            if (edges[i] != -1) {
                graph.get(i).add(edges[i]);
            }
        }

        long[] A = Dijkstra(graph, C1);
        long[] B = Dijkstra(graph, C2);

        int node = -1;
        long dist = INF;
        for (int i = 0; i < n; i++) {
            if (A[i] == INF || B[i] == INF) continue;
            if (dist > A[i] + B[i]) {
                dist = A[i] + B[i];
                node = i;
            }
        }

        return node;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the number of edges (or -2 to exit):");
            int n = scanner.nextInt();

            if (n == -2) {
                System.out.println("Exiting...");
                break;
            }

            int[] edges = new int[n];
            System.out.println("Enter " + n + " edges:");
            for (int i = 0; i < n; i++) {
                edges[i] = scanner.nextInt();
            }

            System.out.println("Enter the two points (C1 and C2):");
            int C1 = scanner.nextInt();
            int C2 = scanner.nextInt();

            int nearestMeetingCell = minimumWeight(n, edges, C1, C2);
            System.out.println("Nearest meeting cell: " + nearestMeetingCell);
        }

        scanner.close();
    }
}
