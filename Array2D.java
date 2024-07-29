import java.util.Scanner;

public class Array2D {
    public static boolean search(int mat[][],int x){
        for (int i = 0; i <mat.length; i++) {
            for (int j = 0; j <mat[0].length; j++) {
                if(mat[i][j]==x){
                    System.out.println("Element found at "+"("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static void lar(int mat[][]){
        int larg=Integer.MIN_VALUE;
        int sml=Integer.MAX_VALUE;
        for (int i = 0; i <mat.length; i++) {
            for (int j = 0; j <mat[0].length; j++) {
                larg=Math.max(larg,mat[i][j]);
                sml=Math.min(sml,mat[i][j]);
            }
        }
        System.out.println("Largest : "+larg);
        System.out.println("smallest : "+sml);
    }
    public static void main(String[]args){
        int matrix[][]= new int[3][3];
        int n = matrix.length, m=matrix[0].length;
        Scanner sc= new Scanner(System.in);
        //input
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m; j++) {
                matrix[i][j]=sc.nextInt();
            }
        }
        //output
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        //search(matrix, 5);
        lar(matrix);
        sc.close();
    }
}
