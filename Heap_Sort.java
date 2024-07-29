public class Heap_Sort {
    private static void heapify(int arr[], int i , int n){
        int left = 2*i+1;
        int right=2*i+2;
        int maxIdx=i;

        if (left<n&&arr[left]>arr[maxIdx]) {
            maxIdx=left;
        }if (right<n&&arr[right]>arr[maxIdx]) {
            maxIdx=right;
        }
        if (maxIdx!=i) {
            int temp=arr[0];
            arr[0]=arr[maxIdx];
            arr[maxIdx]=temp;
            heapify(arr, maxIdx, n);
        }
    }
    public static void heapsort(int arr[]){
        int n = arr.length;
        //Step 1 : Build max heap
        for (int i = n/2;i>=0; i--) {
            heapify(arr,i,n);
        }
        //STEP 2 : push the largeset element to the last 
         for (int i = n-1; i>=0; i--) {
            int temp = arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr,0,i);
         }

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        heapsort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    } 
}
