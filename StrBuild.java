public class StrBuild {
    public static void main (String args[]){
        StringBuilder sb= new StringBuilder("");
        for (char ch ='a';ch<='z';ch++) {
            sb.append(ch);// appends at the end of the string 
        }//O(26)
        //O(n^2) as the loop will run string 's length time thereby n^2
        System.out.println(sb);
        System.out.println(sb.length());
    }
}//memory efficincy 
