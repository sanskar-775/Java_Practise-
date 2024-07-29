import java.lang.Math;
public class BinanryDecimal {
    public static void BtD(int n ){
        int rem ,dec=0;
        for (int i = 0; n>0; i++) {
            rem = n%10;
            dec+=rem*Math.pow(2,i);
            n/=10;
        }
        System.out.println("the decimal number is "+dec);
    }
    public static void DtB(int n ){
        int rem ,bin=0;
        for (int i = 0; n>0; i++) {
            rem = n%2;
            bin+=rem*Math.pow(10,i);
            n/=2;
        }
        System.out.println("the binary number is "+bin);
    }
    public static void main (String args[]){
        BtD(1010);
        DtB(10);

    }
}
