package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LT_ConvertSortedListtoBinarySearchTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public TreeNode sortedListToBST(ListNode head) {

        List<Integer> nums = new ArrayList<>();
        while(head!=null){
            nums.add(head.val);
            head = head.next;
        }
        return helper(nums,0,nums.size());
    }

    private TreeNode helper(List<Integer> nums , int l , int r) {
        if(l>r) return null;
        int m = (l+r)/2;
        TreeNode root = new TreeNode(nums.get(m));
        root.left = helper(nums,l,m-1);
        root.right = helper(nums,m+1,r);
        return root;

    }
}
