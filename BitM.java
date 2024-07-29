public class BitM {
    public static int Getith(int n , int i ){
        int bitMask=1<<i;
        if((n&bitMask)==0){
            return 0;
        }else{
            return 1;
        }
    }
    public static int Setith(int n , int i ){
        int bitMask=1<<i;
        return n|bitMask;
    }
    public static int Clearith(int n , int i ){
        int bitMask=~(1<<i);
        return n&bitMask;
    }
    public static int Updateith(int n, int i , int newbit){
        // if (newbit==0) {
        //     return Clearith(n, i);
        // } else {
        //     return Setith(n, i);
        // }
        n=Clearith(n, i);
        int BitMask=newbit<<i;
        return n|BitMask;
    }
    public static int Clearbits(int n , int i ){
        int bitMask=(~0)<<i;
        return n&bitMask;
    }
     public static int Clearbitsinrange(int n , int i,int j  ){
        int a=((~0)<<(j+1));
        int b=(1<<i)-1;
        int bitMask=a|b;
        return n&bitMask;
    } 
    public static boolean isPowerofTwo(int n){
        return (n&(n-1))==0;
    }
    public static int countsetbits(int n)
    {
        int  count=0;
        while (n>0) {
            if ((n&1)!=0) {//check Lsb
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static void main (String []args){
        // System.out.println((5 & 6));
        // System.out.println((5 | 6));
        // System.out.println((~5));
        // System.out.println((~0));
        // System.out.println((5<<2));
        //System.out.println(Setith(10, 2));
        //System.out.println(Clearith(10, 1));
        //System.out.println(Updateith(10, 2, 1));
        //System.out.println(Clearbits(15, 2));
        //System.out.println(Clearbitsinrange(10, 2,4));
        //System.out.println(isPowerofTwo(8));
        System.out.println(countsetbits(15));
        //System.out.println(Getith(10, 3));

    }
}
