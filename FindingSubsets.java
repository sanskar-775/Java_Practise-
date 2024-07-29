// hello this a cod eto find subset of an string using backtracking
public class FindingSubsets {
    public static void findSubset(String str,String ans,int i){
        // base case
        if(i==str.length()){
            if(ans.length()==0)System.out.println("null");
            else System.out.println(ans);
            return;
        }
        //recursion
        // yes choice
        findSubset(str, ans+str.charAt(i), i+1);
        // no choice
        findSubset(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str="abc";
        findSubset(str,"",0);
    }
}
