package leetcode;

public class LT_ConvertSortedArraytoBinarySearchTree {
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
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums,0, nums.length-1);
    }

    public TreeNode helper(int[] nums, int l , int r){
          int m = (l+r)/2;
          TreeNode root = new TreeNode(nums[m]);
          root.left = helper(nums,l,m-1);
          root.right = helper(nums,m+1,r);

          return root;
    }
}
