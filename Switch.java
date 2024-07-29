import java.util.Scanner;

public class Switch {
    public static void main(String agrs[]){
        // can be user driven
        Scanner sc = new Scanner(System.in); 
        int a =2;
        int b =3;
        System.out.print("Enter the operator ");
        char operator =sc.next().charAt(0);
        switch (operator){
            case '+':System.out.println(a+b);
                    break;
            case '-':System.out.println(a-b);
                    break;
            case '*':System.out.println(a*b);
                    break;
            case '/':System.out.println(a/b);
                    break;
            case '%':System.out.println(a%b);
                    break;
            default:System.out.println("kya matlab kuch bhi ");                                        
        }
        sc.close();
    }
}
// char ch='a';
//         switch (ch){
//             case 'a':System.out.println("do 1");
//                     break;
//             case 'b':System.out.println("do 2");
//                     break;
//             case 'c':System.out.println("do 3");
//                     break;
//             default:
//             System.out.println("lallala");                        
//         }