public class Ass2Darray {
    public static void printarr(int mat[][]){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main (String[]args){
        int mat[][]={{1,2,3},{4,5,6}};
        printarr(mat);
        //transpose
        int transpose[][]=new int[mat[0].length][mat.length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                transpose[j][i]=mat[i][j];
            }
        }
        printarr(transpose);
    }
}
