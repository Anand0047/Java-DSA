package leetcode;

import java.util.ArrayList;

public class LT_numbeOfProvinces {
    public static void main(String[] args) {


    }
    public int findCircleNum(int[][] isConnected) {
        // code here
        int count =0;
        ArrayList<ArrayList<Integer>> adjs = new ArrayList<>();
        int v = isConnected.length;
        for (int i =0;i<v;i++){
            adjs.add(new ArrayList<>());
        }
        for (int i =0;i<v;i++){
            for (int j =0;j<v;j++){
                if (isConnected[i][j] == 1 && i!=j){
                    adjs.get(i).add(j);
                    // adjs.get(j).add(i);

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

    private void dfs(int node, ArrayList<ArrayList<Integer>> adjs, int[] visited){
        visited[node] = 1;
        for(int it : adjs.get(node)){
            if(visited[it]==0) dfs(it,adjs,visited);
        }
    }
}
