public class Pattern2 {
    public static void hollow_rectangle(int trow,int tcol){
        //outer loop 
        for (int i = 1; i <= trow; i++) {
            //inner loop
            for (int j = 1; j <= tcol; j++) {
                //cell -(i,j)
                if(i==1 || i==trow|| j==1|| j==tcol){
                    //boundary element
                    System.out.print("*");

                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void inverted_halfpyramid(int trow,int tcol){
        //outer loop 
        for (int i = 1; i <= trow; i++) {
            //inner loop
            for (int j = 1; j <= tcol; j++) {
                //cell -(i,j)
                if(i+j>=tcol+1){
                    //boundary element
                    System.out.print("*");

                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    //with two parameteres 
    public static void no_inverted_halfpyramid(int trow,int tcol){
        //outer loop 
        for (int i = 1; i <= trow; i++) {
            for (int j = 1; j <= tcol; j++) {
                if(i+j<=tcol+1){
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
    //  with one parameter
    public static void no_inverted_halfpyramid2(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void alt_inverted_halfpyramid(int n){
        //outer loop 
        for (int i = 1; i <= n; i++) {
            //space
            for (int j = 1; j <= n-i; j++) {
               
                    System.out.print(" ");
                }
            //star
            for (int j = 1; j <= i; j++) {
               
                    System.out.print("*");
                }
            System.out.println();    
            }
        
    }
    public static void tri01(int n){
        //outer loop 
        for (int i = 1; i <= n; i++) {
            //inner loop
            for (int j = 1; j <= i; j++) {
                //cell -(i,j)
                if((i+j)%2==0){
                    System.out.print(1+" ");
                }else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }

    public static void floyd_tri(int n){
        int counter=1;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void butterfly(int n){
        //1 st half outer loop 
        for (int i = 1; i <= n; i++) {
            //star- i
            for (int j = 1; j <= i; j++) {            
                    System.out.print("*");
                }
            // space- 2*(n-i)
            for (int j = 1; j <= 2*(n-i); j++) {
               
                    System.out.print(" ");
                }
            // star- i        
            for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }    
            System.out.println();    
            }
            //2nd half outer loop
        for (int i = n; i >=1; i--) {
            for (int j = 1; j <= i; j++) {            
                    System.out.print("*");
                }
            for (int j = 1; j <= 2*(n-i); j++) {
               
                    System.out.print(" ");
                }    
            for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }    
            System.out.println();    
            }    
        
    }
    public static void soild_rhombus(int n ){
        for (int i = 1; i <=n; i++) {
            // spaces
            for (int j = 1; j<=(n-i); j++) {
                System.out.print(" ");  
            }
            // stars 
            for (int j = 1;j<=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void hollow_rhombus(int n ){
        for (int i = 1; i <=n; i++) {
            // spaces
            for (int j = 1; j<=(n-i); j++) {
                System.out.print(" ");  
            }
            // stars
            for (int j = 1;j<=n; j++) {
                if (i==1||i==n||j==1||j==n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                } 
            }
            System.out.println();
        }

    }
    public static void diamond(int n){
        //1 st half outer loop 
        for (int i = 1; i <= n; i++) {
            // space- n-i
            for (int j = 1; j <= (n-i); j++) {
               
                    System.out.print(" ");
                }
            //star- 2*i-1
            for (int j = 1; j <= (2*i-1); j++) {
                    System.out.print("*");
                }    
            System.out.println();    
            }
            //2nd half outer loop
        for (int i = n; i >=1; i--) {
            // space- n-i
            for (int j = 1; j <= (n-i); j++) {               
                    System.out.print(" ");
                }
            //star- 2*i-1
            for (int j = 1; j <= (2*i-1); j++) {
                    System.out.print("*");
                }    
            System.out.println();    
               
            }    
        
    }
    public static void main (String args[]){
        //hollow_rectangle(4,5);
        //inverted_halfpyramid(5, 5);
        //no_inverted_halfpyramid(5, 5);
        //no_inverted_halfpyramid2(5);
        //floyd_tri(5);
        //tri01(5);
        //butterfly(4);
        //soild_rhombus(5);
        //hollow_rhombus(7);
        diamond(4);
    }
}
//HOLLOW REcTANGLE
// *****
// *   *
// *   *
// *****
//INVERTED OR ROTATED HALF PYRAMID(two methods)
//    *
//   **
//  ***
// ****
// WITH NUMBERS
// 12345
// 1234
// 123
// 12
// 1
//-----------------------------------------------------
//FLOYDS TRIANGLE
// 1 
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15
//----------------------------------------------------
// 1     0 1 triangle 
// 0 1 
// 1 0 1 
// 0 1 0 1 
// 1 0 1 0 1 
//-----------------------------------------------------------
// *      *
// **    **
// ***  ***
// ********
// ********  butterfly
// ***  ***
// **    **
// *      *
//--------------------------------------------------------------------
//always ingnore spaces after the pattern 
// they can be ignore as we can do next line 
// first always outer loop 
// then inner loop 
//