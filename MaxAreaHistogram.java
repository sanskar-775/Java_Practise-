import java.util.*;
public class MaxAreaHistogram {
    public static int maxArea(int arr[]){
        int max=0;
        int nsr[]=new int[arr.length];
        int nsl[]=new int[arr.length];
        Stack<Integer> s=new Stack<>();
        //next smaller right
        for (int i = arr.length-1; i >=0; i--){
            while (!s.isEmpty()&&arr[s.peek()]>=arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i]=arr.length;//as we are calulating the width
            }else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }
        //nest smalller left 
        // yeh left se start karke ge 
        s=new Stack<>();
        for (int i = 0; i < arr.length; i++)  {
            while (!s.isEmpty()&&arr[s.peek()]>=arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i]=-1;//as we are calulating the width
            }else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }
        //Current Area : width = j-i-1= nsr[i]-nsl[i]-1
        for (int i = 0; i < arr.length; i++) {
            int height=arr[i];
            int width=nsr[i]-nsl[i]-1;
            int currArea=height*width;
            max=Math.max(currArea,max);
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={2,1,5,6,2,3};
        int area=maxArea(arr);
        System.out.println("Max area in the Histogram :"+area);
    }
}
