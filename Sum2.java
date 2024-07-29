import java.util.*;
public class Sum2 {
    public static void main(String args[]){
        // code to calculate sum of two numbers
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a :");
        int a=sc.nextInt();
        System.out.print("Enter b :");
        int b= sc.nextInt();
        int sum = a + b ;
        System.out.print("The sum is :");
        System.out.println(sum);
        int  prod= a * b ;
        System.out.print("The product is :");
        System.out.println(prod);
        sc.close();
    }
}
