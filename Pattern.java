public class Pattern {
    public static void main (String args[]){
        int n=4;
        char ch= 'A';
        for (int line = 1; line <=n; line++) {
            //one line
            for(int chars=1; chars<=line;chars++){ 
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
//---------------------------------------------------------
// STAR PATTERN 
// *
// **
// ***
// ****
// for (int line = 1; line <=4; line++) {
//             //one line
//             for(int star=1; star<=line;star++){ 
//                 System.out.print('*');
//             }
//             System.out.println();
//         }
//----------------------------------------------------------
//INVERTED STAR PATTERN
// ****
// ***
// **
// *
// for (int line = 1; line <=4; line++) {
//             //one line
//             for(int star=1; star<=(4-line+1);star++){ 
//                 System.out.print('*');
//             }
//             System.out.println();
//         }
//-------------------------------------------------------------------
// HALF PYRAMID
// 1
// 12
// 123
// 1234
// for (int line = 1; line <=4; line++) {
//             //one line
//             for(int star=1; star<=line;star++){ 
//                 System.out.print(star);
//             }
//             System.out.println();
//         }
//-------------------------------------------------------------------------
//CHARACTER PATTERN
// A
// BC
// DEF
// GHIJ
//         int n=4;
//         char ch= 'A';
//         for (int line = 1; line <=n; line++) {
//             //one line
//             for(int chars=1; chars<=line;chars++){ 
//                 System.out.print(ch);
//                 ch++;
//             }
//             System.out.println();
//         }