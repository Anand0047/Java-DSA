package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LT_generateParenthesis {

    public static void main(String[] args) {
        LT_generateParenthesis obj = new LT_generateParenthesis();
        ArrayList<String> ans = (ArrayList<String>) obj.generateParenthesis(5);
        System.out.println(ans.toString());
        }
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result,new StringBuilder(),0,0 ,n);
        return result;
    }

    private void backtrack(List<String> result, StringBuilder curr, int open, int close , int max){

        if(curr.length()==max*2){
            result.add(curr.toString());
            return;
        }

        if(open<max){
            curr.append("(");
            backtrack(result,curr,open+1,close, max);
            curr.deleteCharAt(curr.length()-1);
        }
        if(close<open){
            curr.append(")");
            backtrack(result,curr,open,close+1, max);
            curr.deleteCharAt(curr.length()-1);
        }

    }
}
