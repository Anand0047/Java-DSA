package Graph;





import java.util.*;

public class UndirectedGraphCycleDetection_GFG {

    public class Pair{
        int first;
        int second ;
        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public boolean isCycle(int V, int[][] edges) {
        // Code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < V; i++) adj.add(new ArrayList<>());

        for(int[] e : edges){
            int u = e[0], v = e[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        int[] vis = new int[V];
        for(int i=0;i<V;i++){
            if(vis[i] == 0){
                if(checker(i,V,adj,vis)) return true;
            }


        }
        return false;
    }

    public boolean checker(int src , int V, ArrayList<ArrayList<Integer>> adj,int[] vis){
        vis[src] = 1;
        Queue<Pair> q = new LinkedList<>();
        q.add( new Pair(src,-1));
        while (!q.isEmpty()){
            int node = q.peek().first;
            int parent = q.peek().second;
            q.poll();

            for(int adjNode : adj.get(node)){
                if(vis[adjNode] == 0){
                    q.offer(new Pair(adjNode,node));
                } else if (adjNode != parent) {
                    return true;
                }
            }
        }



        return false;
    }
}
