import java.util.Arrays;
import java.util.HashSet;

public class Dijkstra {
    public static void dij(int[][] l, int source, int n) {//l is the adjacency matrix
        int[] d = new int[n];
        Arrays.fill(d, 9999);
        d[source] = 0;
        HashSet<Integer> visited = new HashSet<>();
        while (visited.size() < n) {
            int u = -1;
            for (int i = 0; i < n; i++) {
                if (!visited.contains(i) && (u == -1 || d[i] < d[u])) {
                    u = i;
                }
            }
            visited.add(u);
            for (int v = 0; v < n; v++) {
                // For every vertex v adjacent to u
                if (l[u][v] != 0 && d[v] > d[u] + l[u][v]) {
                    d[v] = d[u] + l[u][v]; // Update distance if shorter path found
                }
            }
        }
        for(int i=0;i<n;i++) {
        	System.out.println(d[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        int[][] l = {
            {0, 4, 0, 0, 0, 0, 0, 8, 0},
            {4, 0, 8, 0, 0, 0, 0, 11, 0},
            {0, 8, 0, 7, 0, 4, 0, 0, 2},
            {0, 0, 7, 0, 9, 14, 0, 0, 0},
            {0, 0, 0, 9, 0, 10, 0, 0, 0},
            {0, 0, 4, 14, 10, 0, 2, 0, 0},
            {0, 0, 0, 0, 0, 2, 0, 1, 6},
            {8, 11, 0, 0, 0, 0, 1, 0, 7},
            {0, 0, 2, 0, 0, 0, 6, 7, 0}
        };
        int source = 0;
        int n = l.length;
        dij(l, source, n);
    }
}
