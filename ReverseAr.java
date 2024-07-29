public class ReverseAr {
    public static void reverse(int arr[]){
        int ft=0;
        int lt=arr.length-1;
        while (ft<lt) {
            int swap=arr[lt];
            arr[lt]=arr[ft];
            arr[ft]=swap;
            ft++;
            lt--;
        }
    } 
    public static void main(String args[]){
        int number[]={2,4,6,8,10,12,14,16};
        reverse(number);
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]+" ");
        }
    }
}
