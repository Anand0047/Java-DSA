package leetcode;

import javax.swing.*;
import java.util.Arrays;
import java.util.HashSet;



public class LT_Intersection_of_two_arrays {
    public static void main(String[] args) {

        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));



    }

    // Two pointers apprch
    public int[] intersection3(int[] nums1, int[] nums2) {
        // Sort both arrays for two pointer traversal
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0;
        HashSet<Integer> set = new HashSet<>();

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                set.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        // Convert set to array
        int[] res = new int[set.size()];
        int idx = 0;
        for (int num : set) {
            res[idx++] = num;
        }

        return res;
    }

    // optimized way
    public static int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int i : nums1){
            set1.add(i);
        }

        for (int i: nums2){
            if (set1.contains(i)) set2.add(i);
        }

        int[] res = new int[set2.size()];
        int j=0;

        for (int i : set2){
            res[j++]=i;
        }

        return res;
    }

}
