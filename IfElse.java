import java.util.*;
public interface IfElse {
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number :");
        int a = sc.nextInt();
        //GREATER OF TWO NUMBERS
        // int b =3;
        // if (b>a){
        //     System.out.println("The b is greater a ");
        // } else{
        //     System.out.println("nothing here ! ");
        // }
        //ODD or EVEN 
        if (a%2==0 && a!=0) {
            System.out.println("EVEN");
        } else if (a==0){// to save time in checking for an extra if 
            System.out.println("Zero");
        } else {
            System.out.println("ODD");
        }
        sc.close();
    }
}