public class Reverseno {
  public static void main (String args[]){
    int n = 12345;
    int rev=0;
    while (n>0) {
        int lastdigit=n%10;
        rev=(rev*10)+lastdigit;
        n/=10;
    }
    System.out.println(rev);
  }  
}
// int n = 12345;
//     while (n>0) {
//         int lastdigit=n%10;
//         System.out.print(lastdigit);
//         n/=10;
//     }
//     System.out.println();
/*do{

}while(); */