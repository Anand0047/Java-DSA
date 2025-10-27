package Graph;
import java.util.*;

public class DFS_Practice_gfg {
    public static void main(String[] args) {


    }

    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj){
        boolean[] vis = new boolean[V+1];
        vis[0] = true;

        ArrayList<Integer>  result = new ArrayList<>();
        dfsHelper(0,vis,adj,result);

       return result;
    }

    public void dfsHelper(int node , boolean[] vis , ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> result){

        result.add(node);

        for (Integer num : adj.get(node)){
            if (vis[node] == false){
                vis[node] = true;
                dfsHelper(num,vis,adj,result);
            }
        }
    }
}
