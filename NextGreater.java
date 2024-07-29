import java.util.*;
public class NextGreater {
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int nextgrt[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while (!s.isEmpty()&&arr[s.peek()]<=arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextgrt[i]=-1;
            } else {
                nextgrt[i]=arr[s.peek()];
            }
            s.push(i);
        }
        //printing the next greater array
        for (int i : nextgrt) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
