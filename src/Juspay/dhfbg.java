package Juspay;

import java.util.*;

class NearestMeetingCell7 {

    private static final int INF = Integer.MAX_VALUE;

    // Function to perform Dijkstra's algorithm
    public static long[] Dijkstra(List<List<Integer>> adj, int s, int v) {
        PriorityQueue<long[]> pq = new PriorityQueue<>(Comparator.comparingLong(a -> a[0]));
        long[] dist = new long[v];
        Arrays.fill(dist, INF);
        dist[s] = 0;
        pq.add(new long[] {0, s});

        while (!pq.isEmpty()) {
            long[] curr = pq.poll();
            long currentDist = curr[0];
            int node = (int) curr[1];

            for (int neighbor : adj.get(node)) {
                if (currentDist + 1 < dist[neighbor]) {
                    dist[neighbor] = currentDist + 1;
                    pq.add(new long[] {dist[neighbor], neighbor});
                }
            }
        }

        return dist;
    }

    // Function to find the nearest meeting cell
    public static int minimumWeight(int n, int[] edges, int C1, int C2) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
            if (edges[i] != -1) {
                graph.get(i).add(edges[i]);
            }
        }

        long[] distFromC1 = Dijkstra(graph, C1, n);
        long[] distFromC2 = Dijkstra(graph, C2, n);

        int meetingCell = -1;
        long minDistance = INF;

        for (int i = 0; i < n; i++) {
            if (distFromC1[i] != INF && distFromC2[i] != INF) {
                long totalDist = distFromC1[i] + distFromC2[i];
                if (totalDist < minDistance) {
                    minDistance = totalDist;
                    meetingCell = i;
                }
            }
        }

        // If no valid meeting point is found, return -1
        return (minDistance == INF) ? -1 : meetingCell;
    }

    // Helper function to call all functions and handle input
    public static void data() {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt(); // Number of test cases
        while (T-- > 0) {
            int N = scanner.nextInt(); // Number of cells
            int[] edges = new int[N];

            for (int i = 0; i < N; i++) {
                edges[i] = scanner.nextInt(); // Edge array
            }

            int C1 = scanner.nextInt(); // Cell 1
            int C2 = scanner.nextInt(); // Cell 2

            // Find and print the nearest meeting cell
            int result = minimumWeight(N, edges, C1, C2);
            System.out.println(result);
        }

        scanner.close();
    }

    public static void main(String[] args) {
        data();  // Call the helper function to handle input and solve the problem
    }
}