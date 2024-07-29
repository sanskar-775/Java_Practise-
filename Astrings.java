import java.util.Scanner;
public class Astrings {
    public static void main (String args[]){
        int count=0;
        Scanner sc= new Scanner (System.in);
        String str=sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if(Character.isLowerCase(str.charAt(i))&&(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')){
                count++;
            }
        }
        System.out.println("Lowercase vowel occurs : "+count+" times");
        sc.close();
    }
}
