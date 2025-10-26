package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_Practice_gfg {
    public static void main(String[] args) {


    }

    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        int V = adj.size();
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean[] vis = new boolean[V];
        Queue<Integer> q = new LinkedList<>();

        q.add(0);
        vis[0] = true;

        while(!q.isEmpty()){
            int current = q.poll();
            bfs.add(current);

            for(Integer num : adj.get(current)){
                if (vis[num] == false){
                    vis[num] = true;
                    q.offer(num);
                }
            }
        }
        return bfs;
    }
}
