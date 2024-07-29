
public class BasicRecusion {
    public static void PrintDecrese(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        PrintDecrese(n-1);
    }
    public static void PrintIncrease(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        PrintIncrease(n-1);
        System.out.println(n);
    }
    public static int Factorial(int n){
        if (n==0) {
            return 1;
        }
        int fac = n * Factorial(n-1);
        return fac;
    }
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int suma=n+sum(n-1);
        return suma ;
    }
    // n th of fibonacci series 
    public static int fibo(int n){
        if (n==0||n==1) {
            return n;
        }
        int fib1=fibo(n-1);
        int fib2=fibo(n-2);
        int fib = fib1+fib2;
        return fib;
    }
    public static boolean isSorted(int arr[], int i ){
        if(i == arr.length-1){
            return true;
        }
        if (arr[i]>arr[i+1]) {
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static int FirstOccur(int arr[],int key,int i){// O(n) timecomplex O(n) spacecomplex
        if (arr[i]==key) {
            return i;
        }
        if (i==arr.length-1) {
            return -1;
        }
        return FirstOccur(arr,key,i+1);       
    }
     public static int LastOccur(int arr[],int key,int i){
        if (i==arr.length) {
            return -1 ;
        }
        int isfound=LastOccur(arr, key, i+1);// loop check 
        if (isfound==-1&&arr[i]==key) {//self check  
            return i;
        }
        return isfound;
     }
    public static void main(String[] args) {
        // int n=5;
        // //PrintDecrese(n);
        // //PrintIncrease(n);
        // int f=fibo(n);
        // //sum(n);
        // //Factorial(n);
        // System.out.println(f);
        int []ar= {1,2,3,4,5,6,5};
        //System.out.println(isSorted(ar, 0));
        //System.out.println(FirstOccur(ar, 5, 0));
        System.out.println(LastOccur(ar, 5, 0));
    }
}
