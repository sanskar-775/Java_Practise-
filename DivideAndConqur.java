public class DivideAndConqur {
    public static void MergeSort(int arr[], int si,int ei){
        //Base case
        if(si>=ei){
            return;
        }
        int mid = si+(ei-si)/2;
        //kaam
        MergeSort(arr,si,mid);
        MergeSort(arr,mid+1,ei);
        Merge(arr, si, mid, ei);

    }
    public static void Merge(int arr[],int si ,int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i = si;//iteratator for 1 st sorted part
        int j= mid+1;//iteratator for 2nd sorted part
        int k=0;//iteratator for temp
        while (i<=mid && j<=ei) {
            if (arr[i]<arr[j]) {
                temp[k]=arr[i];
                i++;
            } else {
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while (i<=mid) {
           temp[k++]=arr[i++] ;
        }
        while(j<=ei){
            temp[k++]=arr[j++] ;
        }
        for (k=0,i=si; k < temp.length; k++,i++) {
            arr[i]=temp[k];
        }
    }
    public static void printArr(int arr[]){
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+" ");
        }
        System.out.println();
    }
    public static void QuickSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        //kaam
        int idx=partition(arr, si, ei);
        QuickSort(arr, si, idx-1);
        QuickSort(arr, idx+1, ei);
    }
    public static int partition(int arr[],int si, int ei){
        int pivot=arr[ei];
        int i=si-1;//used to make space for element smaller then pivot;

        for (int j = si; j < ei; j++) {
            if(arr[j]<=pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }
    public static void main (String args[]){
        int arr[]={4,2,5,6,1,3,8,9};
        //MergeSort(arr, 0, arr.length-1);
        QuickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
