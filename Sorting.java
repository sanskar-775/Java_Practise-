//import java.util.Arrays;
//import java.util.Collections;
public class Sorting {
//BUBBLESORT   O(n2)
public static void BubbleSOrt(Integer arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            int swap=1;// in case the array is already sorted
            if(swap!=0){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){//for descending <
                    //swap
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap--;

                }
            }
            }
        }
}
//SELCETION SORT  O(n2)
public static void selectionsort(Integer arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            int minpos=turn;
            for(int j=turn+1;j<arr.length;j++){
                if(arr[minpos]>arr[j]){//incraesing order for decreseing order <
                    minpos=j;
                } 
            }  
                //swap 
            int temp = arr[minpos];
            arr[minpos]=arr[turn];
            arr[turn]=temp;    
    }
}
//INSERTION SORT O(n2)
public static void Insertionsort(Integer arr[]){
    for(int i =1; i<arr.length;i++){
        int cur=arr[i];
        int prev=i-1;
        //finding the right pos to insert 
        while(prev>=0 && arr[prev]>cur){// for decresing order arr[prev]<cur
            arr[prev+1]=arr[prev];
            prev--;
        }
        //insertion 
        arr[prev+1]=cur;

    }
}
// PRINT OF ARRAY
public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
}
public static void countingSort(int arr[]){//value is small
    int largest=Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
        largest=Math.max(largest, arr[i]);
    }
    int count[] = new int[largest+1];
    for (int i = 0; i < arr.length; i++) {
        count[arr[i]]++;
    }
    //sorting
    int j=0;
    for (int i = 0; i < count.length; i++) {// i = count.length -1 ; i>=0
        while (count[i]>0) {
            arr[j]=i;
            j++;
            count[i]--;
        }
    }
}
public static void main (String[]args){
        int arr[]={1,4,1,3,2,4,3,7};
        //BubbleSOrt(arr);
        //selectionsort(arr);
        //Insertionsort(arr);
        
        //countingSort(arr);
        // inbuild sort
        Arrays.sort(arr,0,3,Collections.reverseOrder());
        printArr(arr);
    }

    //reverseORder functions works on Objects threrfore we write Integer as int is a primitive datatype
}
