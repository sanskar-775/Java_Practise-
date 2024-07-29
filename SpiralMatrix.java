public class SpiralMatrix {
    public static void printSpiral(int mat[][]){
        int strow=0;
        int stcol=0;
        int endrow= mat.length-1;
        int endcol= mat.length-1;
        while (strow<=endrow&&stcol<=endcol) {
            //top 
            for (int j=stcol; j <=endcol; j++) {
                System.out.print(mat[strow][j]+ " ");
            }
            //right
            for (int i = strow+1; i <=endrow; i++) {
                System.out.print(mat[i][endcol]+ " ");
            }
            //bottom
            for (int j=endcol-1; j >=stcol; j--) {
                if (strow==endrow) {// for a single row matrix we have already done it in the above top loop 
                    break;
                }
                System.out.print(mat[endrow][j]+ " ");
            }
            //left
            for (int i=endrow-1; i>=strow+1; i--) {
                if (stcol==endcol) {// for a single row matrix we have already done it in the above top loop 
                    break;
                }
                System.out.print(mat[i][stcol]+ " ");
            }
            strow++;
            stcol++;
            endrow--;
            endcol--;
        }



    }
    public static void main(String[]args){
        int matrix[][]={{1,2,3,4},{5,6,7,8},
                        {9,10,11,12},{13,14,15,16}};
        printSpiral(matrix);
    }
}
