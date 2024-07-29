import java.util.Scanner;
public class Income {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A :");
        int A=sc.nextInt();
        System.out.print("Enter B :");
        int B=sc.nextInt();
        System.out.print("Enter C :");
        int C=sc.nextInt();
        if (A>=B&&A>=C) {
            System.out.println("Largest number is A .");
        }else if(B>=C){
            System.out.println("Largest number is B.");
        } 
        else {
            System.out.println("Largest number is C .");
        }
        sc.close();
    }
}
//INCOME TAX CALCULATOR
// public static void main (String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Income :rs.");
//         float income=sc.nextFloat();
//         float tax;
//         if (income< 500000) {
//             tax = 0 ;
//         }else if(income>=500000 && income<1000000){
//             tax=(float)(income*0.2);
//         }else {
//             tax=(float)(income*0.3);
//         }
//         System.out.println("Total tax is rs."+tax);
//         sc.close();
//     }