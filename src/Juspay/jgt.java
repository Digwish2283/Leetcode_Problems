package Juspay;

import java.util.*;

class NearestMeetingCell4 {

    private static final int INF = Integer.MAX_VALUE;

    // Function to perform Dijkstra's algorithm
    public static long[] Dijkstra(Map<Integer, List<Integer>> adj, int s) {
        PriorityQueue<long[]> pq = new PriorityQueue<>(Comparator.comparingLong(a -> a[0]));
        int v = adj.size();
        long[] dist = new long[v];
        Arrays.fill(dist, INF);
        dist[s] = 0;
        pq.add(new long[]{0, s});

        while (!pq.isEmpty()) {
            long[] curr = pq.poll();
            long currentDist = curr[0];
            int node = (int) curr[1];

            if (!adj.containsKey(node)) continue;  // Skip if the node doesn't have neighbors

            for (int neighbor : adj.get(node)) {
                if (currentDist + 1 < dist[neighbor]) {
                    dist[neighbor] = currentDist + 1;
                    pq.add(new long[]{dist[neighbor], neighbor});
                }
            }
        }

        return dist;
    }

    // Function to find the nearest meeting cell
    public static int minimumWeight(int n, int[] edges, int C1, int C2) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (edges[i] != -1) {
                graph.computeIfAbsent(i, k -> new ArrayList<>()).add(edges[i]);
            }
        }

        long[] distFromC1 = Dijkstra(graph, C1);
        long[] distFromC2 = Dijkstra(graph, C2);

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

        return meetingCell;
    }

    // Helper function to call everything and handle input/output
    public static void helper_function() {
        Scanner scanner = new Scanner(System.in);

        // Number of test cases
        int T = scanner.nextInt();
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
        // Call the helper function to handle everything
        helper_function();
    }
}