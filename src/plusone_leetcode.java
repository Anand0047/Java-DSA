public class plusone_leetcode {
    public static void main(String[] args) {


        int[] digits = {1, 2, 3};
        int len = digits.length;
            if (len==1 && digits[len]==9){
                digits[0]=1;
                digits[1]=0;
            }else {
                digits[len-1]+=1;
            }

            for (int i : digits){
                System.out.println(i);
            }
    }
}
