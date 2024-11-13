package Juspay;

import java.util.*;

class NearestMeetingCell3 {

    // BFS/DFS to compute distance from start node to all other nodes
    public static int[] computeDistances(int[] edges, int startNode, int n) {
        int[] distance = new int[n];
        Arrays.fill(distance, Integer.MAX_VALUE);  // Initialize distances to "infinity"
        distance[startNode] = 0;

        int currentNode = startNode;
        int dist = 0;

        while (currentNode != -1 && distance[currentNode] == Integer.MAX_VALUE) {
            distance[currentNode] = dist++;
            currentNode = edges[currentNode];  // Move to the next node in the graph
        }

        return distance;
    }

    public static int minimumWeight(int n, int[] edges, int C1, int C2) {
        // Compute the distances from both C1 and C2 to all other nodes
        int[] distFromC1 = computeDistances(edges, C1, n);
        int[] distFromC2 = computeDistances(edges, C2, n);

        // Find the node with the minimum combined distance
        int minDist = Integer.MAX_VALUE;
        int nearestNode = -1;

        for (int i = 0; i < n; i++) {
            // Both distances must be finite to be considered
            if (distFromC1[i] != Integer.MAX_VALUE && distFromC2[i] != Integer.MAX_VALUE) {
                int combinedDist = Math.max(distFromC1[i], distFromC2[i]);
                if (combinedDist < minDist) {
                    minDist = combinedDist;
                    nearestNode = i;
                }
            }
        }

        return nearestNode;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();  // Number of nodes
        int[] edges = new int[n];

        for (int i = 0; i < n; i++) {
            edges[i] = scanner.nextInt();  // Reading all edges one by one
        }

        int C1 = scanner.nextInt();  // First node
        int C2 = scanner.nextInt();  // Second node

        int nearestMeetingCell = minimumWeight(n, edges, C1, C2);
        System.out.println(nearestMeetingCell);

        scanner.close();
    }
}