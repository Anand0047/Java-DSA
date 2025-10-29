package leetcode;

import java.util.Arrays;

public class LT_FloodFillAlgo {
    public static void main(String[] args) {

        LT_FloodFillAlgo obj = new LT_FloodFillAlgo();
       int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1;
        int sc = 1;
        int color = 2;
        System.out.println(Arrays.deepToString(obj.floodFill(image, sr, sc, 2)));

    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int initial = image[sr][sc];
        int maxR = image.length-1;
        int maxC = image[0].length-1;

        dfs(image,sr,sc,color,maxR,maxC,initial);
        return image;
    }

    void dfs(int[][] image , int sr , int sc ,int color , int mr, int mc, int initial){
        if (sr<0 || sr>mr || sc<0 || sc>mc || image[sr][sc] != initial){
            return;
        }else{
            image[sr][sc] = color;
            dfs(image,sr+1,sc,color,mr,mc,initial);
            dfs(image,sr-1,sc,color,mr,mc,initial);
            dfs(image,sr,sc+1,color,mr,mc,initial);
            dfs(image,sr+1,sc-1,color,mr,mc,initial);
        }
    }
}
