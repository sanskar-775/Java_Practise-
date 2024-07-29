public class FunctionOver{
    // sum of two 
    public static int sum(int a , int b ){
        return a+b ;
    }
    // sum of three 
    public static int sum(int a ,int b ,int c){
        return a+b+c;
    }
    public static float sum(float a , float b ){
        return a+b ;
    }
    public static void main (String args[]){
        int a =sum(3, 5);
        System.out.println(a);
        a=sum(3, 4, 4);
        System.out.println(a);
        float b=sum(4.6f, 7.5f);
        System.out.println(b);
    }
}