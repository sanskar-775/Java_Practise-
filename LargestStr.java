public class LargestStr {
    
    public static void main (String args[]){
        String fruits[]={"apple","mango","banana"};
        String largest = fruits[0];
        //checks lexicographically
        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i])<0) {
                largest=fruits[i];
            }
        }
        System.out.println(largest);
    }
}
