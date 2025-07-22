class Pair{
    int first;
    int second;
    Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}
class Solution {
    public int[] dijkstra(int V, int[][] edges, int src) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            int wt = edges[i][2];
            adj.get(u).add(new Pair(wt, v));
            adj.get(v).add(new Pair(wt, u));
        }
         int[] dist = new int[V];
        Arrays.fill(dist, (int) 1e9);
        dist[src] = 0;

        PriorityQueue<Pair> pq = new PriorityQueue<>((x, y) -> x.first - y.first);
        pq.add(new Pair(0, src));  // (distance, node)

        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            int d = curr.first;
            int node = curr.second;

            for (Pair neighbor : adj.get(node)) {
                int wt = neighbor.first;
                int adjNode = neighbor.second;

                if (d + wt < dist[adjNode]) {
                    dist[adjNode] = d + wt;
                    pq.add(new Pair(dist[adjNode], adjNode));
                }
            }
        }

        return dist;
    }
}