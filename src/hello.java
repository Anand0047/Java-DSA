class hello{
    int num =2;
    String str;
        void def() {
            System.out.println(this.num);
            System.out.println(this.str);
        }

    public static void main(String[] args) {
           hello h= new hello();
           h.def();
    }
}