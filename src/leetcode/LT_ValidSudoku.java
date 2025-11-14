package leetcode;

import java.util.Arrays;

public class LT_ValidSudoku {
    public static void main(String[] args) {
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        LT_ValidSudoku aa = new LT_ValidSudoku();
        System.out.println(aa.validSudoku(board));

    }
    boolean validSudoku(char[][] board){
        int m = board.length;
        int n = board[0].length;
        for(int i =0;i<m;i++){
            for(int j =0; j<m;j++){
                if(board[i][j] != '.'){
                    if(!checker(board,i,j,m)) return false;
                }
            }
        }
    return true;
    }

    private boolean checker(char[][] board,int i,int j,int m){
        int[] freq = new int[9];
        Arrays.fill(freq,0);
        for(int k=0 ; k<m;k++) {
            if (board[i][k] != '.') {
                int num = board[i][k] - '0';
                freq[num]++;
            }
        }

        for(int k=0 ; k<m;k++) {
            if (board[k][j] != '.' && k!=i) {
                int num = board[k][j] - '0';
                    if(freq[num] == 1) return false;
            }
        }
        Arrays.fill(freq,0);
        return true;
    }
}
