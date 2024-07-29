public class BinarySearch {
    public static int B_S1(int arr[],int key){
        int start=0,end=arr.length-1;
        while (start<=end) {
             int mid=(start+end)/2;
             if(arr[mid]==key){
                return mid;
             }
             if (arr[mid]< key) {//right 
                start=mid+1;
             } else {//left
                end=mid-1;
             }    
        }
        return -1;
    } 
    public static void main(String args[]){
        int number[]={2,4,6,8,10,12,14,16};
        int key=16;
        System.out.println("index for the key is "+B_S1(number,key));
    }
}
