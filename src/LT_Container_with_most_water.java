public class LT_Container_with_most_water {
    public static void main(String[] args) {

    }


    public int maxArea(int[] h) {
        int l = 0;
        int r = h.length - 1;
        int res = 0;

        while (l < r) {
            int width = r - l;
            int height = Math.min(h[l], h[r]);
            int amt = height * width;
            res = Math.max(res, amt);

// Move the pointer at the smaller line
            if (h[l] < h[r]) {
                l++;
            } else {
                r--;
            }

    res=Math.max(amt,res);
    }

    return res;
    }
}

