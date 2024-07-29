public class PowerRecursion {
    public static int OpPower(int a , int x){//o(logn)
        if (x==0) {
            return 1;
        }
        int halfpow= OpPower(a, x/2);
        int halfpowsq= halfpow*halfpow;
        if (x%2!=0) {//x is odd
            halfpowsq=a*halfpowsq;}
        return halfpowsq;
   }
    public static int tilpro(int n){//titling problem 2Xn for 2X1 , 4Xn for 4X1;
        //Base case
        if(n==0||n==1){
            return 1;
        }
        //kaam
        //vertical 
        int fnm1=tilpro(n-1);
        //horizontal
        int fnm2=tilpro(n-2);
        int totalways= fnm1+fnm2;
        return totalways;
    }
    public static void Duplicatestr(String str, int idx, StringBuilder newstr, boolean map[]){// remove duplicate string
        //base case
        if (idx==str.length()) {
            System.out.println(newstr);
            return;
        }
        char currentchar= str.charAt(idx);
        //kaam 
        if (map[currentchar-'a']==true) {//duplicate
            Duplicatestr(str, idx+1, newstr, map);
        }else{// naya char 
            map[currentchar-'a']=true;
            Duplicatestr(str, idx+1, newstr.append(currentchar), map);
        }

    }
    public static int friendsPairing(int n){
        if(n==1||n==2){
            return n;
        }
        // // choice
        // //single
        // int sways=friendsPairing(n-1);
        // //pair
        // int fnm1=n-1;//any frd can chose anyone of the friend 
        // int pair = fnm1*friendsPairing(n-2);// into the remaing of the frds
        // //total ways
        // int totways=sways+pair;
        // return totways;
        return friendsPairing(n-1)+(n-1)*friendsPairing(n-2);

    }
    public static void printBinstr(int n,int ltpl,String str){
        //base case
        if(n==0){
            System.out.println(str);
            return;
        }
        //kaam 
        printBinstr(n-1,0,str+"0");
        if(ltpl==0){//non consecutive ones
            printBinstr(n-1,1,str+"1");
        }
    }
    public static void main(String[] args) {
        // int a = 2;
        // int x = -2;
        // System.out.println(OpPower(a, x)); 
        // System.out.println(tilpro(5));
        // String  str= "appnnacollege";
        // Duplicatestr(str, 0, new StringBuilder(""), new boolean[26]);
        printBinstr(3, 0,"");
    }
}
