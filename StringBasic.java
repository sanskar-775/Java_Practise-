//import java.util.Scanner;
/*sometimes the feeling that you are not imporatnt to some people make you feel sad but thats why people have familes they are the once to whome you are always  important so 
 * dont always judge your self on the worth that you are not imporatnt to some people but also be the one for your family 
 * as they are the only once 
 * with you for you 
 * fuck what others say leave them doesnt matters all matters is family 
 * others are there only till you are some materialistc worth to them
 * fake friend fake world and its doing 
 * keep doing your best 
 * work on your self 
 * nobody will bring the change that much  till you yourself decide to bring the change  
 * lalalalallallalalalalal
 * POV : you get ignored all day long by others and now  you feel a but low so to cheer yourself up
 * riyal hai visited twicess
 */
public class StringBasic {
    public static void printLetter(String str){//funtion to print the letters of a word 
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+" ");
        }
        //charAt function shows the letter at that index
        System.out.println();
    }
    public static void main(String args[]){
        // char arr[]={'a','b','c'};
        // String str = "abcd";
        // String str2 =new String("xyz");

        // // STRINGS ARE IMMUTABLE

        // Scanner sc= new Scanner(System.in);
        // String name=sc.nextLine();
        // System.out.println(name);

        // String fullname="Tony Stark";
        // System.out.println(fullname.length());

        //note here in java length is a function and not a property 

        String firstname="Sanskar";
        String lastname="Sharma";
        String fullname=firstname +" "+lastname;//concatenation 
        printLetter(fullname);
         

    }
}
