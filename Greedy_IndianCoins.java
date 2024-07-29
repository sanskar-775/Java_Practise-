import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Greedy_IndianCoins {
    public static void main(String[] args) {
        Integer coins []={1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coins,Comparator.reverseOrder());

         int val=590;
         int count=0;
         ArrayList<Integer> a= new ArrayList<>();

         for (int i = 0; i < coins.length; i++) {
            if(coins[i]<=val){
                while (coins[i]<=val) {
                    count++;
                    a.add(coins[i]);
                    val-=coins[i];
                }
            }
         }

         System.out.println("The max number of coins is :"+count);
         for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i)+" ");
         }
    }
}
