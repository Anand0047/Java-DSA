public class SignOfTheArrayInLT {
    public static void main(String[] args) {

        int [] nums = {-1,-2,-3,-4,3,2,1};
        int x =1;
        for (int i : nums){
            x*=i;
        }
        System.out.println(signFunc(x));
    }
    static int signFunc(int x){
        if (x>0){
            return 1;
        }else if (x<0){
            return -1;
        }else {
            return 0;
        }
    }
}
