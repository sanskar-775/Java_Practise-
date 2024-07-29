public class LinearSearch {
    public static void L_S1(int arr[],int x){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==x){
                System.out.println("Element "+arr[i]+" found at "+i+" index of the array.");
                return;
            }
        }
        System.out.println("NOt found");
    }
    public static int L_S2(int arr[],int x){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==x){
                
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int number[]={2,4,6,8,10,12,14,16};
        int key=10;
        L_S1(number,key);

        int index=L_S2(number, key);
        if (index==-1) {
            System.out.println("NOT found");
        } else {
            System.out.println("found at index "+index );
        }
    }
}
