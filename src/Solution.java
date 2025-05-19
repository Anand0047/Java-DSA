class nextGreatestLetter {
    public static void main(String[] args) {

    }
    public char nextGreatestLetter1(char[] letters, char target) {


        int left = 0;
        int right = letters.length-1;
        while (left<right){
            int mid = (left + right)/2;
            if (letters[mid] == target){
                return letters[mid];
            } else if (letters[mid] > target) {
                right = mid-1;
            }else if (letters[mid] <target){
                left = mid+1;
            }
        }
    return letters[left % letters.length];
    }
}