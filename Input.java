import java.util.*;// USED TO GET SCANNER OBJECT 
public class Input {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        //  SINGLE WORD INPUT 
        //   String input = sc.next();//only captures till space is entered
        //   System.out.println(input);
          
        //FULL SENTENCE/PARAGRAPH  INPUT
        // String name = sc.nextLine();
        // System.out.println(name);
         
        //INT NUMBER INPUT
        int number= sc.nextInt();
        System.out.println(number);
        
        //FLOAT NUMBER  INPUT
        float pp=sc.nextFloat();
        System.out.println(pp);

        //  BOOLEAN INPUT
        boolean b=sc.nextBoolean();// can be true or false
        System.out.println(b);

        sc.close();
    }
}
