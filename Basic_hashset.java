import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
public class Basic_hashset {
    public static void main(String args[]){
        HashSet <String> city = new HashSet<>();
        city.add("Delhi");
        city.add("Mumbai");
        city.add("Mumbai");
        city.add("Indore");
        city.add("Chennai");
        city.add("Pasadena");
        // // number one method to iterate over the loop 
        // Iterator it = city.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // } 
        // // use of advanced loops to iterate the set
        // for(String s : city){
        //     System.out.println(s);
        // }
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Mumbai");
        lhs.add("Indore");
        lhs.add("Chennai");
        lhs.add("Pasadena");
        System.out.println(lhs);
        System.out.println(city);
    }
}
