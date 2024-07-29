import java.util.*;
public class HPQimpli {
    static class Heap{
        ArrayList <Integer> arr = new ArrayList<>();
        public void add(int data){// O(log n) -> as it covers all the levels
            // STEP 1 : adding the element to the last index
            arr.add(data);// adding the element to last position of the heap
            // STEP 2 : Fix the Heap
            int x=arr.size()-1;// -1 kyuki 0 based idxing hai
            int par=(x-1)/2;
            while (arr.get(x)<arr.get(par)) {// will run till parent valur > child value
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
                // chnaging the pointers
                x=par;
                par=(x-1)/2;
            }
        }
        public int peek(){
            return arr.get(0);
        }

        public boolean isEmpty(){
            return arr.size()==0;
        }

        private void heapify(int i){

            int left = 2*i+1;
            int right= 2*i+2;
            int minIdx=i;

            //Compare and get the min idx
            if (left<arr.size()&& arr.get(minIdx)>arr.get(left)) {
             minIdx=left;   
            }
            if (right<arr.size()&& arr.get(minIdx)>arr.get(right)) {
                minIdx=right;   
            }
            if(minIdx!=i){
                // swap the min value to fix the heap 
                int tmp=arr.get(minIdx);
                arr.set(minIdx,arr.get(i));
                arr.set(i,tmp);

                //further check if the heap is fixed or not
                heapify(minIdx);

            }
        }
        public int remove(){
            int data = arr.get(arr.size()-1);
            //STEP 1 : Swap 1st and last idx
        // why ? because it is ez to remove the last element from the arraylist
            int temp = arr.get(arr.size()-1);
            arr.set(arr.size()-1,arr.get(0));
            arr.set(0,temp);
            //STEP 2 : remove the last element
            arr.remove(arr.size()-1);
            //STEP 3 : heapify
        // why 0 idx ? because we just swapped
            heapify(0);
            return data;
        }


    }
    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(4);
        h.add(3);
        h.add(1);
        h.add(5);

        while (!h.isEmpty()) {// heap sort 
            System.out.println(h.peek());
            h.remove();
        }
    }


}
