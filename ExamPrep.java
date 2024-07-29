import java.util.Scanner;

public class ExamPrep {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1 :");
        int n=sc.nextInt();
        int sum_of_digits=0;

        while (n>0) {
            int rem = n%10;
            sum_of_digits+=rem;
            n/=10;
        }
       System.out.println("The sum of digits of the number is "+sum_of_digits);
        sc.close();

    }
}
