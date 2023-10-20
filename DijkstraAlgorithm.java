public class DijkstraAlgorithm {
  static final int totalVertices = 9;

  int findMinimumDistance(int distances[], Boolean shortestPathSet[]) {
    int minDistance = Integer.MAX_VALUE;
    int minIndex = -1;
    for (int vertex = 0; vertex < totalVertices; vertex++) {
      if (!shortestPathSet[vertex] && distances[vertex] <= minDistance) {
        minDistance = distances[vertex];
        minIndex = vertex;
      }
    }
    return minIndex;
  }

  void printShortestDistances(int distances[], int n) {
    System.out.println("The shortest distances from source node 0 to all other nodes are: ");
    for (int node = 0; node < n; node++)
      System.out.println("To Node " + node + ", the shortest distance is: " + distances[node]);
  }

  void dijkstra(int graph[][], int sourceNode) {
    int distances[] = new int[totalVertices];
    Boolean shortestPathSet[] = new Boolean[totalVertices];
    for (int node = 0; node < totalVertices; node++) {
      distances[node] = Integer.MAX_VALUE;
      shortestPathSet[node] = false;
    }
    distances[sourceNode] = 0;
    for (int count = 0; count < totalVertices - 1; count++) {
      int u = findMinimumDistance(distances, shortestPathSet);
      shortestPathSet[u] = true;
      for (int v = 0; v < totalVertices; v++) {
        if (!shortestPathSet[v] && graph[u][v] != -1 && distances[u] != Integer.MAX_VALUE
            && distances[u] + graph[u][v] < distances[v]) {
          distances[v] = distances[u] + graph[u][v];
        }
      }
    }
    printShortestDistances(distances, totalVertices);
  }
}