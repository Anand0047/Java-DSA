public class TwoSum_lc {
    public static void main(String[] args) {
        int num[] = {2,7,11,15};
        int target = 9;
        int indx1 = 0;
        int indx2 = 0;
        for (int i = 0;i<num.length;i++){
            for(int k=0;k<num.length;k++){
                if (num[i]+num[k]==target){
                    indx1 =i;
                    indx2 =k;
                    System.out.println();
                }
            }
        }

    }
}
