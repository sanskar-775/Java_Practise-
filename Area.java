import java.util.*;
public class Area {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        float r = s.nextFloat();
        float area = 3.14f*r*r;
        System.out.println(area);
        s.close();
        /*
         * NOTE:   here we use f as java tale decimall values as double data type 
         * to get it to float we add a f in the end         */

    }
}
