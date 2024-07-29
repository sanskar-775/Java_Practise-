public class Largest {
    public static int largest(int arr[]){
        int lar=Integer.MIN_VALUE;
        int sml=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (lar<arr[i]) {
                lar=arr[i];   
            }
            if (sml>arr[i]) {
                sml=arr[i];
            }
        }
        System.out.println("smallest value is "+sml);
        return lar;    
    }
    public static void main(String args[]){
        int number[]={1,2,6,3,5};

        int num=largest(number);
        System.out.println("Largest number is "+ num);
        
    }
}
