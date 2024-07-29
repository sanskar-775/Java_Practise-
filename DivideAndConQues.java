public class DivideAndConQues {
    public static String MergeSort(String arr[],int si ,int ei){
        if(si==ei){
            return {arr[si]};
        }
        int mid = si+(ei-si)/2;
        String arr1[]=MergeSort(arr, si, mid);
        String arr2[]=MergeSort(arr, mid+1, ei);

        String arr3[]=Merge(arr1,arr2);
        return arr3;
         

    }
    public static String Merge(String arr1[],String arr2[]){
        int idx=0;
        int i=0;
        int j =0;
        
    }
    public static void printArr(String arr[]){
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String[] arr={ "sun", "earth", "mars", "mercury"};
        String[]arr1=MergeSort(arr,si,ei);
        printArr(arr1);

    }
}
