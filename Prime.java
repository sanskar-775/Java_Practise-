import java.util.*;
public class Prime {
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in );
        int number=sc.nextInt();
        boolean flag=true;
        if (number==2) {
            System.out.println(" number is Prime");
        } else {
            for(int i =2; i<=Math.sqrt(number);i++){
            if (number%i==0){
                flag=false;
            }
            }
            if (flag==false) {
                System.out.println("number is Not Prime");
            } else {
                System.out.println(" number is Prime");
            }
        }
        sc.close();
    }
}
