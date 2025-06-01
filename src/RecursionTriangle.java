public class RecursionTriangle {
    public static void main(String[] args) {
        simpleTriangle(4,0);
    }
    static void simpleTriangle(int row, int col ){
        if (row == 0) return;
        if (row > col){
            simpleTriangle(row , col+1);
            System.out.print("*");
        }else {
            simpleTriangle(row -1,0);
            System.out.println();
        }
    }
}
