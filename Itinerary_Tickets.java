import java.util.HashMap;

public class Itinerary_Tickets {
    public static String getStart(HashMap<String,String> tickets){
        // revers hashmap
        HashMap<String,String> revmap=new HashMap<>();

        for (String key : tickets.keySet()) {
            revmap.put(tickets.get(key),key);// here we enter the keys as valus and visa versea
        }
        for (String key : tickets.keySet()) {
            if (!revmap.containsKey(key)) {
               return key;// the key that never became the value
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap <String, String> tickets = new HashMap<>();
        tickets.put("Chennai","Bergaluru");
        tickets.put("Mumbai","Delhi");
        tickets.put("Goa","Chennai");
        tickets.put("Delhi","Goa");
        
        String start= getStart(tickets);
        System.out.print(start);
        for(String key:tickets.keySet()){
            System.out.print("->"+tickets.get(start));
            start=tickets.get(start);
        }
        System.out.println();
    }
}
