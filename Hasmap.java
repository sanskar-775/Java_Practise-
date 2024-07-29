import java.util.*;
public class Hasmap {
    static class HashMap<K,V>{
        private class Node {
            K key ;
            V value;
             public Node(K key,V value){
                this.key=key;
                this.value=value;
             }
        }
        private int size;// totoal number of nodes
        private LinkedList<Node> buckets[];
         
        @SuppressWarnings("unchecked")
         public HashMap(){
            this.size=0;
            this.buckets=new LinkedList[4];
            for (int i = 0; i < buckets.length; i++) {
                this.buckets[i]= new LinkedList<>();
            }
         }
         private int hashFunction(K key){
            int hc = hashCode();
            
         }
         public void put(K key, V value){
            int bi = hashFunction(key);// 0 1 2 3 values will be between in 
            int di =SearchInLL(key);// valid index
         }
    }
}
