import java.util.Arrays;
public class Anagrams {
    public static boolean Anagram(String str1,String str2){
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        if (str1.length()!=str2.length()) {
            return false;
        }else{
            char[] str11=str1.toCharArray();
            char[] str12=str2.toCharArray();
            Arrays.sort(str11);
            Arrays.sort(str12);
            if(Arrays.equals(str11,str12)){
                return true;
            }
        }
        return false;
    }
    public static void main (String args[]){
        String str1="race";
        String str2="care";
        if(Anagram(str1, str2))
        System.out.println("Yes ,they  are anagrams ");
        else System.out.println("NO, they are not anagrams");
    }
}
