package Graph;

import java.util.*;

public class NumofProvincesGFG {
    public static void main(String[] args) {

    }

    private static void dfs(int node, ArrayList<ArrayList<Integer>> adjs, int[] visited){
        visited[node] = 1;
        for(int it : adjs.get(node)){
            if(visited[it]==0) dfs(it,adjs,visited);
        }
    }
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int v) {
        // code here
        int count =0;
        ArrayList<ArrayList<Integer>> adjs = new ArrayList<>();
        for (int i =0;i<v;i++){
            adjs.add(new ArrayList<>());
        }
        for (int i =0;i<v;i++){
            for (int j =0;j<v;j++){
                if (adj.get(i).get(j) == 1 && i!=j){
                    adjs.get(i).add(j);
                    adjs.get(j).add(i);

                }
            }
        }


        int[] visited = new int[v];
        for (int i = 0;i<v;i++) {

            if (visited[i] == 0) {
                count++;
                dfs(i, adjs, visited);
            }
        }

        return count;
    }
}
