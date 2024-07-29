//TYPE CONVERSION and TYPE CASTING
public class Type {
    public static void main(String args[]){
//TYPE CONVERSION
        // int a = 23 ;
        // long b = a ;
        // System.out.println(b);
        // long a =23;
        // int b = a;
        //the above will cause an error as destination type>source type
//TYPE casting
        // float a = 25.999f;//doesnt round off
        // int b = (int)a;
        // System.out.println(b);
//char to number
        // char ch ='A';
        // int number= ch;
        // System.out.println(number);
//type promotion 
        byte b= 5;
        byte a = (byte)(b*2);// without the type casting this will produce an error
        System.out.println(a);        
    } 
}
