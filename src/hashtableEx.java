import java.util.Hashtable;

public class hashtableEx {
    public static void main(String[] args) {
        Hashtable<Integer , String>  table = new Hashtable<>();
        table.put(9879,"Anand");
        table.put(9875,"varma");
        table.put(6907,"David laid");

        for( Integer key : table.keySet()){
            System.out.println( table.get(key));
        }


//        System.out.println(table.keySet());

    }
}
