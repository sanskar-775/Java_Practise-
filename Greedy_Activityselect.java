import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Greedy_Activityselect {
    public static void main(String[] args) {
        int start[]={1,2,3,4};
        int end []={4,5,6,5};


        //if activity was not sorted on the basis of end time 
        int activity[][]=new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activity[i][0]=i;
            activity[i][1]=start[i];
            activity[i][2]=end[i];
        }
        //sorting in 2D arrays
        Arrays.sort(activity,Comparator.comparingDouble(o->o[2]));
        
        //end time basis sorted 
        int maxAct=0;
        ArrayList<Integer> ans = new ArrayList<>();

        //!st activity

        maxAct=1;
        ans.add(activity[0][0]);
        int lastEnd=activity[0][2];
        for (int i = 1; i < end.length; i++) {
            if (activity[i][1]>=lastEnd) {
                maxAct++;
                ans.add(i);
                lastEnd=end[i];
            }
        }
        

        //print section
        System.out.println("Max Activity = "+maxAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A"+ans.get(i)+' ');
        }
        System.out.println();
    }
}
