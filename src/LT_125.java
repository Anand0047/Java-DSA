public class LT_125 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(  finf(s));
    }
    static boolean   finf(String s){

        String news = s.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int st = 0;
        int end = news.length()-1;
        boolean flag = true;
        while(st<=end){
            if(news.charAt(st) == news.charAt(end)){
                st++;
                end--;
            }else {
                flag = false;
            }
        }




       return flag;
        
    }
}