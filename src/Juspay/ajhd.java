package Juspay;

import java.util.*;

class NearestMeetingCell1 {

    private static final int INF = Integer.MAX_VALUE;

    // Function to perform Dijkstra's algorithm using HashMap
    public static long[] Dijkstra(Map<Integer, Integer> adj, int s, int n) {
        PriorityQueue<long[]> pq = new PriorityQueue<>(Comparator.comparingLong(a -> a[0]));
        long[] dist = new long[n];
        Arrays.fill(dist, INF); // Initialize all distances to INF
        dist[s] = 0; // Starting point has a distance of 0
        pq.add(new long[] {0, s}); // Add the start node to the priority queue

        while (!pq.isEmpty()) {
            long[] curr = pq.poll();
            long currentDist = curr[0];
            int node = (int) curr[1];

            // Check if there is an edge from the current node
            if (adj.containsKey(node)) {
                int neighbor = adj.get(node);
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
        // Create a HashMap to represent the graph
        Map<Integer, Integer> graph = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (edges[i] != -1) {
                graph.put(i, edges[i]); // Store the edge from node i to edges[i]
            }
        }

        // Compute the shortest distance from C1 and C2 using Dijkstra's algorithm
        long[] distFromC1 = Dijkstra(graph, C1, n);
        long[] distFromC2 = Dijkstra(graph, C2, n);

        // Find the meeting cell with the minimum combined distance
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

    public static void main(String[] args) {
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
}