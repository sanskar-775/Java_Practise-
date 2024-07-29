import java.util.Scanner;

public class Function {
    // print hello world
    public static void printhw(){
        System.out.println("hello world");
    }
    // sum of two numbers
    public static int sum(int a , int b){//parameter or formal parameters
        int sum = a + b;
        return sum;
    }
    // is the number given prime or not
    public static boolean isPrime(int n){
       if (n==2)return true;
       
       for (int i =2;i<=Math.sqrt(n);i++){
        if (n%i ==0)return false;
       }       
       
        return true;

    }
    //factorial of a number
    public static int fac(int number ){
        int f=1;
        for (int i =1 ;i<=number;i++){
            f*=i;
        }        
        return f ;
    }
    // binomial coef of n and r given 
    public static int binomialcoefficient(int n, int r ){
        int nf=fac(n),rf=fac(r),nf1=fac(n-r);
        return (nf/(rf*nf1)) ;
    }
    // prime numbes in a range 
    public static void Rangeprime(int a ){
        boolean c=true;
        for (int i =2;i<=a;i++){
            c=isPrime(i);
            if(c==true){
                System.out.print(i+" ");
            } 
        }
    }
    public static void main (String args[]){
        //printhw();// function call
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a :");
        int a= sc.nextInt();
        Rangeprime(a);
        sc.close();

    }
}
//DUMPED CODE
//------------------------------------------------------------------
// Scanner sc = new Scanner (System.in);
//         System.out.print("Enter a :");
//         int a = sc.nextInt();
//         System.out.print("Enter b :");
//         int b = sc.nextInt();
//         int sum=sum(a,b);//arguments or actual parameters
//         System.out.println("Sum is :"+sum);
//         sc.close();
//-----------------------------------------------------------
//Scanner sc = new Scanner (System.in);
// System.out.print("Enter number :");
// int n= sc.nextInt();
// int factorial=fac(n);//arguments or actual parameters
// System.out.println("factorial of number is : "+ factorial );
// sc.close();
//----------------------------------------------------
// Scanner sc = new Scanner (System.in);
// System.out.print("Enter n :");
// int n= sc.nextInt();
// System.out.print("Enter r :");
// int r= sc.nextInt();
// int bc=binomialcoefficient(n,r);//arguments or actual parameters
// System.out.println("Binomial coefficient is : "+ bc );
// sc.close();
//-----------------------------------------------------

