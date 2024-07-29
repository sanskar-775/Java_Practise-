import java.util.HashSet;

public class UnionandIntersection {
    public static void main (String args[]){
        int arr1[]={7,9,6};    
        int arr2[]={6,3,9,2,9,4};
        HashSet <Integer> set = new HashSet<>();
        //union
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }
        //set union set
        System.out.println("union="+set.size());
        System.out.println(set);
        // intersection
        set.clear();// to empty the set
        int count=0;
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            if(set.contains(arr2[i])){// check if exits then true
                System.out.print(arr2[i]+" ");
                count++;
                set.remove(arr2[i]);// we have to remove htis element so that the the count doesnot double  with the size
            }
        }
        System.out.println();
        System.out.println("intersection="+count);
    }
}
