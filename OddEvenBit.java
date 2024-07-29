public class OddEvenBit {
    public static void OddEven(int n){
        int bitMask=1;
        if ((n&bitMask)==0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
    public static void main(String []args){
        OddEven(12);
        OddEven(13);
        OddEven(45);
    }
}
